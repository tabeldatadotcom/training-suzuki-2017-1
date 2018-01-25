package com.gmail.maryanto.dimas.configurasi;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.commons.dbcp2.BasicDataSource;

import com.gmail.maryanto.dimas.model.Department;

public class UpdateDatabase {
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

			PreparedStatement st = connection.prepareStatement("insert into departments"
					+ "(department_id, department_name, location_id, manager_id) " +
					"values (?, ?, ? ,?)");
			st.setInt(1, 999);
			st.setString(2, "aslkfjaskdl");
			st.setInt(3, 3200);
			st.setInt(4, 124);
			st.executeUpdate();

			st.close();
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
