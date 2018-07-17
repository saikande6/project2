package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import bean.Bean1;

public class Dao3 {
	public static void delete(Bean1 f)
	{
		try
		{
		Class.forName("oracle.jdbc.driver.OracleDriver");  
		Connection con=DriverManager.getConnection(  
		"jdbc:oracle:thin:@localhost:1521:xe","system","system");  
		      
		PreparedStatement ps=con.prepareStatement("delete from reg where lastname=?");
		 
		ps.setString(1, f.getLastname());
		

		      
		ps.executeUpdate();  
		con.close();
	}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	}

