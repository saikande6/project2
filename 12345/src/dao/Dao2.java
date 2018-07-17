package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import bean.Bean;
import bean.Bean1;

public class Dao2 {
	public static void update(Bean1 c)
	{
		try
		{
		Class.forName("oracle.jdbc.driver.OracleDriver");  
		Connection con=DriverManager.getConnection(  
		"jdbc:oracle:thin:@localhost:1521:xe","system","system");  
		      
		PreparedStatement ps=con.prepareStatement("update reg set firstname=?,emailid=?,password=? where lastname=?");
		 
		ps.setString(1, c.getFirstname());
		ps.setString(2, c.getEmailid());
		ps.setString(3, c.getPassword());
		ps.setString(4, c.getLastname());

		      
		ps.executeUpdate();  
		con.close();
	}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
