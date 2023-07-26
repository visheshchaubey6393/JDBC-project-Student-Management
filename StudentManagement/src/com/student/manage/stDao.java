package com.student.manage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class stDao {
	public static void deletestudent(String name) {
//		
		try {
			Connection con=CP.createConnection();
			String query="DELETE FROM students WHERE sname = ?;";
			PreparedStatement ps=con.prepareStatement(query);
			ps.setString(1, name);
			ps.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		
		
	}
	public static void displayAll() {
	
		try {
			Connection con=CP.createConnection();
			  String query = "SELECT * FROM students";
			  Statement stm=con.createStatement();
			  
			 ResultSet rs=stm.executeQuery(query);
			 while(rs.next()) {
				 int id=rs.getInt("sid");
				 String name=rs.getString("sname");
				 String cont=rs.getString("contact");
				 String city=rs.getString("scity");
				 System.out.println("Student");
				 
				 System.out.println("Student ID: " + id);
		            System.out.println("Name: " + name);
		            System.out.println("Contact: " + cont);
		            System.out.println("City: " + city);
		            System.out.println("-------------------------");
			 }
			
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		 
	}
	public static void display(String name) {
//		complete this code 
//		create connection
	
		try {
			Connection con=CP.createConnection();
			String query="select * from students where sname=?";
			PreparedStatement pstmt=con.prepareStatement(query);
			pstmt.setString(1, name);
			
//			output will be in result set
			ResultSet rs=pstmt.executeQuery();
			if (rs.next()) {
	            // Retrieve the student details from the result set
	            int sid = rs.getInt("sid");
	            String sname = rs.getString("sname");
	            String contact = rs.getString("contact");
	            String scity = rs.getString("scity");
	            System.out.println("Student ID: " + sid);
	            System.out.println("Name: " + sname);
	            System.out.println("Contact: " + contact);
	            System.out.println("City: " + scity);
	        } else {
	            System.out.println("No student found with the name: " + name);
	        }

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static boolean inserttoDB(student st ) {
		boolean f=false;
		try {
			
			Connection con=CP.createConnection();
			String query="insert into students(sname,contact,scity) values(?,?,?)";
//			prepared statement to update the values 
			PreparedStatement pstmt=con.prepareStatement(query);
			pstmt.setString(1, st.getStudentname());
			pstmt.setString(2, st.getStudentphone());
			pstmt.setString(3, st.getStudentcity());
			
//			execute
			pstmt.executeUpdate();
			f=true;
//			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return f;
	}

}
