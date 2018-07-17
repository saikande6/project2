<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="Delete" method="post">
 <body background="E:\images\1.jpg">
 
  <center>
  <h1 style="color:red"><font color="black">-----</font><u>Deletion</u><font color="black">-----</font></h1>
  

 <font color="red"> *</font>Firstname:<input type="text"  name="firstname" placeholder="first name" required style="margin-left:100px;"><br><br>
<font color="red"> *</font>Lastname:<input type="text"  name="lastname"placeholder="last name" required style="margin-left:100px;"><br><br>
<font color="red"> *</font>Emailid:&nbsp;&nbsp;<input type="email" name="emailid"placeholder="email" required style="margin-left:100px;"><br><br>
<font color="red"> *</font>Password:<input type="password"  name="password" placeholder="password" required style="margin-left:100px;"><br><br>
<font color="red"> *</font>Confirmpassword:<input type="password"  name="confirmpassword"placeholder="confirm password" required style="margin-left:50px;"><br><br>
<font color="red"> *</font>Designation:<select style="margin:0px 30px 0px 100px;" name="designation" required>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<option>.......Select........</option>
<option>Java trainee</option>
<option>.Net trainee</option>
<option>Java trainer</option>
<option>.Net trainer</option>
<option>Java Developer</option>
<option>.Net Developer</option>
</select><br><br>
<font color="red"> *</font>Gender:&nbsp;&nbsp;&nbsp;<input type="radio" name="gender" value="Male" required style="margin-left:80px;">Male
<input type="radio" name="gender" value="Female"required>Female
<input type="radio" name="gender" value="Other" required>Other<br><br>
<label>Dateofbirth:</label>

  <input type="date" name="dateofbirth" style="margin-left:80px;"><br><br>
<font color="red"> *</font>Mobilenumber:<input id="number"  name="mobilenumber"type="tel" maxlength="10" placeholder="mobileno" required style="margin-left:50px;"><br><br>
Currentaddress:<textarea rows="4" cols="20" name="currentaddress" style="margin:0px 0px 0px 50px" required>Entere text here...</textarea><br><br>
<font color="red"> *</font>Peramanentaddress:<textarea rows="4" name="peramanentaddress"cols="20"name="address"   style="margin:0px 0px 0px 30px" required>Enter text here...</textarea><br><br>

<font color="red"> *</font>State:<select name="state" style="margin:0px 50px 0px 130px">
<option >......select.......</option>
<option>Andhra pradesh</option>
<option>Telengana</option>
<option>Madhya pradesh</option>
<option>West bengal</option>
</select><br><br>
<font color="red"> *</font>Nationality:<input type="text" name="nationality"required style="margin-left:90px;"><br><br>
<input type="submit" value="submit" style="padding:5px;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input type="reset" value="Reset" >

</legend>
 </form>
 </center>
</body>
</html>