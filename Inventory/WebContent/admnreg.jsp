<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Anodite Cell</title>

<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Pooled Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />

<!-- Bootstrap Core CSS -->
<link href="css1/bootstrap.min.css" rel='stylesheet' type='text/css' />
<!-- Custom CSS -->
<link href="css1/style.css" rel='stylesheet' type='text/css' />
<link rel="stylesheet" href="css1/morris.css" type="text/css"/>
<!-- Graph CSS -->
<link href="css1/font-awesome.css" rel="stylesheet"> 
<!-- jQuery -->
<script src="js1/jquery-2.1.4.min.js"></script>
<!-- //jQuery -->
<link href='//fonts.googleapis.com/css1?family=Roboto:700,500,300,100italic,100,400' rel='stylesheet' type='text/css'/>
<link href='//fonts.googleapis.com/css1?family=Montserrat:400,700' rel='stylesheet' type='text/css'>
<!-- lined-icons -->
<link rel="stylesheet" href="css1/icon-font.min.css" type='text/css' />
<!-- //lined-icons -->
<!--js -->
<script src="js1/jquery.nicescroll.js"></script>
<script src="js1/scripts.js"></script>
<!-- Bootstrap Core JavaScript -->
<script src="js1/bootstrap.min.js"></script>
<!-- /Bootstrap Core JavaScript -->	   
<!-- morris JavaScript -->	
<script src="js1/raphael-min.js"></script>
<script src="js1/morris.js"></script>

<script>
function showpassword() 
 		{
 		    var x = document.getElementById("password");
 		    if (x.type === "password") {
 		        x.type = "text";
 		    } else {
 		        x.type = "password";
 		    }
 		}
 		
         
      </script>

</head>

<body>

<div class="main-wthree">
	<div class="container">
	<div class="sin-w3-agile">
		<h2>Sign Up</h2>
		<form action="adminregistration" method="post">
			<div class="username">
				<span class="username">Adminname:</span>
				<input type="text" name="adminname" id="adminname" class="name" placeholder="" required="">
				<div class="clearfix"></div>
			</div>
			<div class="username">
				<span class="username">Email:</span>
				<input type="email" name="email" id="email" class="name" placeholder="" required="">
				<div class="clearfix"></div>
			</div>
			<div class="password-agileits">
				<span class="username">Password:</span>
				<input type="password" name="password" id="password" class="password" maxlength="10" placeholder="" required="">
				<input type="checkbox" id="brand2" onclick="showpassword()"><label for="brand2">show password</label> 
				<div class="clearfix"></div>
				
			</div>
			<div class="username">
				<span class="username">Address:</span>
				<input type="text" name="address" id="address" class="password" maxlength="50" placeholder="" required="">
				<div class="clearfix"></div>
			</div>
			<div class="username">
				<span class="username">MobileNo:</span>
				<input type="number" name="mob" id="mob" class="password" maxlength="50" placeholder="" required="">
				<div class="clearfix"></div>
			</div>
			<div class="login-w3">
					<input type="submit" class="login" value="Sign Up">
			</div>
			<div class="clearfix"></div>
		</form>
		<div class="back">
						<a href="index.jsp">Back to home</a>
				</div>
				<div class="footer">
					<p>© 2019 | ANODITE CELL </p>
				</div>
	</div>
	</div>
	</div>

</body>
</html>