package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectionDemo {
	
	public static void main(String ar[])
	{
		try {
			//Class.forName("org.postgresql.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "1234");
			
			System.out.println("Connected to PostgreSQL database!");
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM public.Student");
            while (rs.next()) {
                System.out.println(rs.getInt(1)+"  "+rs.getString(2));
               // rs.next();
            }	
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		 
	}

}
