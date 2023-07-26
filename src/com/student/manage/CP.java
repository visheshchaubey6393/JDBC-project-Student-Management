package com.student.manage;

import java.sql.Connection;
import java.sql.DriverManager;

public class CP {
	static Connection con;
	public static Connection createConnection() {

		try {
//			st1- load the driver
			Class.forName("com.mysql.jdbc.Driver");
//			st2= create the connection
			String url="jdbc:mysql://localhost:3306/student_management";
			String user="root";
			String pass="root";
			
			con=DriverManager.getConnection(url, user, pass);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}


}
