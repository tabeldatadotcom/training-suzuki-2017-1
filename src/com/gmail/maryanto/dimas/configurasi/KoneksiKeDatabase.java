package com.gmail.maryanto.dimas.configurasi;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.commons.dbcp2.BasicDataSource;

import com.gmail.maryanto.dimas.model.Department;

public class KoneksiKeDatabase {

	public static void main(String[] args) {
		Integer value = 10;
		BasicDataSource ds = new BasicDataSource();
		ds.setUrl("jdbc:oracle:thin:@localhost:1521:XE");
		ds.setUsername("hr");
		ds.setPassword("hr");
		ds.setDriverClassName("oracle.jdbc.OracleDriver");

		try {
			Connection connection = ds.getConnection();
			System.out.println("koneksi database berhasil!");

			PreparedStatement st = connection.prepareStatement("select * from departments where department_id = ? and department_name = ?");
			st.setInt(1, value);
			st.setString(2, "aslkfjaskdl");
			ResultSet rs = st.executeQuery();
			while (rs.next()) {
				Department d = new Department();
				d.setDepartmentId(rs.getInt("DEPARTMENT_ID"));
				d.setDepartmentName(rs.getString("DEPARTMENT_NAME"));
				d.setLocationId(rs.getInt("MANAGER_ID"));
				d.setManagerId(rs.getInt("LOCATION_ID"));
				
				System.out.println(d.toString());
			}
			rs.close();
			st.close();
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
