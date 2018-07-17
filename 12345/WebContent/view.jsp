<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<img src="C:\Users\Kande Sai\Desktop\login1\images\1.png" alt="softboot" style="width:150px;height:80px;">
</head>
<body>
 <body background="E:\images\6.jpg">
<h3>employee details</h3>
<table border="2" width=40% height="50">
<tr>
<th>firstname</th>
<th>lastname</th>
<th>emailid</th>
<th>password</th>
<th>confirmpassword</th>
<th>designation</th>
<th>gender</th>
<th>dateofbirth</th>
<th>mobilenumber</th>
<th>currentaddress</th>
<th>peramanentaddress</th>
<th>state</th>
<th>nationality</th>
<th>Action</th>

</tr>
<%
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");


Statement stmt=con.createStatement();
ResultSet rs=stmt.executeQuery("select * from reg");
while(rs.next())
{
	String firstname=rs.getString("firstname");
	String lastname=rs.getString("lastname");
	String emailid=rs.getString("emailid");
	String password=rs.getString("password");
	String confirmpassword=rs.getString("confirmpassword");
	String designation=rs.getString("designation");
	String gender=rs.getString("gender");
	String dateofbirth=rs.getString("dateofbirth");
	String mobilenumber=rs.getString("mobilenumber");
	String currentaddress=rs.getString("currentaddress");
	String peramanentaddress=rs.getString("peramanentaddress");
	String state=rs.getString("state");
	String nationality=rs.getString("nationality");
	
	
	
	
	%>

<tr>
<td><%=firstname %></td>
<td><%=lastname %></td>
<td><%=emailid %></td>
<td><%=password %></td>
<td><%=confirmpassword %></td>
<td><%=designation %></td>
<td><%=gender %></td>
<td><%=dateofbirth %></td>
<td><%=mobilenumber%></td>
<td><%=currentaddress %></td>
<td><%=peramanentaddress %></td>
<td><%=state %></td>
<td><%=nationality %></td>
<td><a href="update.jsp">edit</a>&nbsp;
<a href="deleteview.jsp?lastname=<%=lastname%>">delete</a></td>
 
	</tr>	

<%
}
%>

</table>
<center>
<a href="home.jsp">homepage</a>

</center>
</body>
</html>