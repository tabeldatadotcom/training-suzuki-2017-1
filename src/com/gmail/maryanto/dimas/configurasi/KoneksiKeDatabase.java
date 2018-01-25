package com.gmail.maryanto.dimas.configurasi;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.commons.dbcp2.BasicDataSource;

import com.gmail.maryanto.dimas.model.Department;

public class KoneksiKeDatabase {

	public static void main(String[] args) {
		BasicDataSource ds = new BasicDataSource();
		ds.setUrl("jdbc:oracle:thin:@localhost:1521:XE");
		ds.setUsername("hr");
		ds.setPassword("hr");
		ds.setDriverClassName("oracle.jdbc.OracleDriver");

		try {
			Connection connection = ds.getConnection();
			System.out.println("koneksi database berhasil!");

			Statement st = connection.createStatement();
			ResultSet rs = st.executeQuery("select * from departments");
			while (rs.next()) {
				Department d = new Department();
				d.setDepartmentId(rs.getInt("DEPARTMENT_ID"));
				d.setDepartmentName(rs.getString("DEPARTMENT_NAME"));
				d.setLocationId(rs.getInt("MANAGER_ID"));
				d.setManagerId(rs.getInt("LOCATION_ID"));
				
				System.out.println(d.toString());
			}
			System.out.println("--------------");
			rs.close();
			st.close();
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
