package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import bean.Bean;

public class Dao {

	public boolean login(Bean bean)
	{
		boolean b=false;
		
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:XE","system","system");
			System.out.println("create statement");
			Statement stmt = con.createStatement();
			//PreparedStatement ps = con.prepareStatement("insert into dorasingam(company,id,name,designation) values(?,?,?,?)");
			ResultSet rs = stmt.executeQuery("select username,password from login");
			System.out.println("result");
			
			while(rs.next())
			{
				String username=rs.getString("username");
				String password=rs.getString("password");
				
				System.out.println((rs.getString("username")));
				System.out.println(rs.getString("password"));
			if(bean.getUsername().equals(username)&&bean.getPassword().equals(password))
				{
					System.out.println("match");	
					b=true;
					return b;
				}
				
			}
			
			System.out.println("success");
			con.close();
		}catch(Exception e)
		{
		e.printStackTrace();	
}
		return b;

	
	}
}