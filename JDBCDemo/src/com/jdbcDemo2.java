package com;

import java.sql.*;

public class jdbcDemo2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//load the driver
				Class.forName("oracle.jdbc.driver.OracleDriver");
				
				//get the connection
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "system", "oracle");
				
				//CREATE THE STATEMENT
				
				PreparedStatement pstmt=con.prepareStatement("delete  from student2 where sid=?");
				
				//execute query
				 pstmt.setInt(1, 103);
				  pstmt.execute();
				 
					/*
					 * while(rs1.next()) { System.out.println(rs1.getInt(1)+"  "+rs1.getString(2));
					 * }
					 */
				//PreparedStatement  
					/*
					 * pstmt=con.prepareStatement("insert into student2 values(?,?)");
					 * pstmt.setInt(1, 104); pstmt.setString(2, "tina"); int
					 * i=pstmt.executeUpdate(); System.out.println("record inserted");
					 */
				  
				  pstmt=con.prepareStatement("update student2 set sname=? where sid=?");
				  pstmt.setString(1, "neha");
				  pstmt.setInt(2, 104);
				  	int i=pstmt.executeUpdate();
				  System.out.println("record updated");
				  con.close();
	}

}
