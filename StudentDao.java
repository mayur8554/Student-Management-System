package com.javaconectivity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;


public class StudentDao {

	public static boolean InsertStudnetToDB(Student st) 
	{
		boolean f=false;
		// inserting variable 
		try {
		Connection con=ConnectionGenration.createc();
		String q="insert into students(name ,age,grade ) values(?,?,?)";
		
		
			PreparedStatement pstmt= con.prepareStatement(q);
			pstmt.setString(1, st.getName());
			pstmt.setInt(2, st.getAge());
			pstmt.setString(3, st.getGrade());
			
			pstmt.executeUpdate();
			f=true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		
	}

	public static boolean DeleteStudnetToDB(int rollnum) {
		boolean f=false;
		// inserting variable 
		try {
		Connection con=ConnectionGenration.createc();
		String q="delete from students where rollnum=?";
		
		
			PreparedStatement pstmt= con.prepareStatement(q);
			
			pstmt.setInt(1, rollnum);
			
			
			pstmt.executeUpdate();
			f=true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	public static void  ShowAllStudnet() {
		boolean f=false;
		// inserting variable 
		try {
		Connection con=ConnectionGenration.createc();
		String q="select * from students;";
		
		
			Statement stmt= con.createStatement();
			
			ResultSet set=stmt.executeQuery(q);
			
			while(set.next())
			{
				
				int rollnum=set.getInt(1);
				String name=set.getString(2);
				int Age=set.getInt(3);
				String grade=set.getString(4); 
				
				
				System.out.println("Roll Number: " + rollnum);
				System.out.println("Name: " + name);
				System.out.println("Age: " + Age);
				System.out.println("Grade: " + grade);
				System.out.println("******************************************** " );
				
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

	


	
	

}
