package com;

import java.sql.*;

public class JdbcDemo3 {
	
	private String url;
	private String user;
	private String password;
	Connection con;
	
	public void connect()
	{
		url="jdbc:oracle:thin:@localhost:1521:ORCL";
		user="system";
		password="oracle";
		//load the driver
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				//get the connection
				try {
					 con=DriverManager.getConnection(url, user, password);
				} catch (SQLException e) {
					e.printStackTrace();
				}
				//CREATE THE STATEMENT
				
				try {
					PreparedStatement pstmt=con.prepareStatement("select * from student2");
					ResultSet rs=pstmt.executeQuery();
					while(rs.next())	
					{
						System.out.println(rs.getRow());
						System.out.println(rs.getInt(1)+"  "+rs.getString(2));
					}
					
					ResultSetMetaData rsmd=rs.getMetaData();
					
					System.out.println("column numbers  "+rsmd.getColumnCount());
					
				} catch (SQLException e) {
					e.printStackTrace();
				}
				try {
					DatabaseMetaData dbmt=con.getMetaData();
					System.out.println(dbmt.getDatabaseProductName());
					System.out.println(dbmt.getURL());
					System.out.println(dbmt.getUserName());
					
				} catch (SQLException e) {
					e.printStackTrace();
				}
				
	
	}
	public void processBatch()
	{
		try {
			Statement st=con.createStatement();
			st.addBatch("insert into student2 values(108,'bina')");
			st.addBatch("insert into student2 values(109,'rina')");
			st.addBatch("insert into student2 values(110,'tina')");
			st.addBatch("insert into student2 values(111,'sina')");
			st.addBatch("insert into student2 values(112,'gita')");
			st.addBatch("delete from student2 where sid=104");
			
			st.executeBatch();
			System.out.println("batch updated");	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void proccall() throws SQLException
	{
		CallableStatement cst=con.prepareCall("{call myproc(?,?)}");
		cst.setInt(1, 115);
		cst.setString(2, "siya");
		cst.execute();
		System.out.println("procedure called");
	}
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		JdbcDemo3 obj=new JdbcDemo3();
		obj.connect();
		//obj.processBatch();
		obj.proccall();	
	}

}
