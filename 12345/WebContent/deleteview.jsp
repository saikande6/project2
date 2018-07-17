<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
try {
	String id1=request.getParameter("lastname");
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");
	PreparedStatement pstmt=conn.prepareStatement("delete reg where lastname=?");
	pstmt.setString(1,id1);
  ResultSet rs= pstmt.executeQuery();
%>
		<h1>Student Record Deleted Successfully</h1>
	    <a href="home.jsp">Home</a>
		
<%					
	}
catch(Exception e){
	
	
	System.out.println(e);
}

%>
</body>
</html>