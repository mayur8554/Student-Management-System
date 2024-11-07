package com.javaconectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionGenration {
	 static Connection con = null;
	public static Connection createc()
	{
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//create connectionn 
			String user="root";
			String password="8554969791";
			String url="jdbc:mysql://localhost:3306/student_management";
			
			try {
				con=DriverManager.getConnection(url, user, password);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (ClassNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}

}
