<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

   
      <link rel="icon" type="image/x-icon" href="C:\Users\Kande Sai\Desktop\login1\images\51.jpg">
<img src="C:\Users\Kande Sai\Desktop\login1\images\1.png" alt="softboot" style="width:150px;height:80px;">
   

<title>Insert title here</title>

</head>
<body>
 <body background="E:\images\daffa.jpg">
<center><form action="Login" method="post"><br><br><br><br><br><br><br><br><u><h1 style="color:red;">Login page</u></h1>
<font color="blue" size="4px">Username:<input type="text" name="username" id="username" placeholder="username" required><br><br>
Password:<input type="password" name="password" placeholder="password" id="password" required><br><br></font>
<input type="checkbox"><label for="checkbox">Keep me logged in</label><br>
<input type="submit" value="Login" style="padding:7px;">
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="registration.jsp" style="color:red;"> Create New User</a></font>

  </center>
  </form>
  <script>
  function  validate(frm){
	   // Set vflag to yes indicating  client side form validations are done
	  // frm.vflag.value="yes";
	 
	  // Empty Error messages
	  document.getElementById("usernameErr").innerHTML="";
    document.getElementById("passwordErr").innerHTML="";
	  document.getElementById("usernameErr").style.color='red';
    document.getElementById("passwordErr").style.color='red';




	  //read form data
	  var username=frm.pusername.value;
	  var password=frm.password.value;
	  // Perform Client side form validations
	  if(username==""){  //required rule
	    document.getElementById("usernameErr").innerHTML="UserName is mandatory";
		 frm.pusername.focus();
		 return false;
		 }
		if(password==""){  //required rule
	    document.getElementById("passwordErr").innerHTML="password is mandatory";
		 frm.ppassword.focus();
		 return false;
		 }

			 
			 
			
		
		return true;
  }//function
</script>
</body>
</html>