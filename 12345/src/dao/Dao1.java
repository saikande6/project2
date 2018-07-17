
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import bean.Bean1;

public class Dao1 {
	public static void register(Bean1 a)
	{
		
		try
		{
		Class.forName("oracle.jdbc.driver.OracleDriver");  
		Connection con=DriverManager.getConnection(  
		"jdbc:oracle:thin:@localhost:1521:xe","system","system");  
		      
		PreparedStatement ps=con.prepareStatement(  
		"insert into reg(firstname,lastname,emailid,password,confirmpassword,designation,gender,dateofbirth,mobilenumber,currentaddress,peramanentaddress,state,nationality) values(?,?,?,?,?,?,?,?,?,?,?,?,?) ");  
		
		ps.setString(1, a.getFirstname());
		ps.setString(2, a.getLastname());
		ps.setString(3, a.getEmailid());
		ps.setString(4, a.getPassword());
		ps.setString(5, a.getConfirmpassword());
		ps.setString(6, a.getDesignation());
		ps.setString(7, a.getGender());
		ps.setString(8, a.getDateofbirth());
		ps.setString(9, a.getMobilenumber());
		ps.setString(10, a.getCurrentaddress());
		ps.setString(11, a.getPeramanentaddress());
		ps.setString(12, a.getState());
		ps.setString(13, a.getNationality());
		      
		ps.executeUpdate();  
		con.close();
	}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
		
	}

