package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DataBaseConnection {

	public static void main(String[] args) {
		try
		{
		//1:load the driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		String url="jdbc:oracle:thin:@localhost:1521:ORCL";
		String user="system";
		String password="oracle";
		
		//2:Connection done
		Connection con=DriverManager.getConnection(url,user,password);
		System.out.println("Connected to Database");
		
		//3:Create Statement
		Statement stmt=con.createStatement();
		
		//4:Execute the query and Get the Result
		ResultSet  rs=stmt.executeQuery("select * from emp");
		
		//5:Print the result
		
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
		}
		
		int i=stmt.executeUpdate("insert into emp values(105,'Pia','ML')");
		System.out.println("Record Inserted  "+i);
		
		int j=stmt.executeUpdate("update emp set ename='Ruby' where eid=103");
		System.out.println("Record Updated  "+j);
		
		boolean b=stmt.execute("delete from emp where eid=104");
		System.out.println("Record Deleted");
		
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
