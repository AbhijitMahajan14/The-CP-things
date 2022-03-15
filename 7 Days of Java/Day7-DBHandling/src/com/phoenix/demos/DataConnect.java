package com.phoenix.demos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataConnect {
	public static void main(String[] args) {
		try {
			 Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Por","root","root");
			String query2="update bd set NAME='Abhi' where NAME='Abhijit'";
			String query="select * from bd";
			Statement stmt=con.createStatement();
			Statement stmt2=con.createStatement();
			int i=stmt2.executeUpdate(query2);
			ResultSet rs=stmt.executeQuery(query);
			while(rs.next()) {
			System.out.println(rs.getString(1));//you can give col nm instead of 1
			
			}
			con.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
