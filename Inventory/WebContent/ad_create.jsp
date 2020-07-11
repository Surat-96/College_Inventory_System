<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE HTML>
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

<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<script>
							var toggle = true;
										
							$(".sidebar-icon").click(function() {                
							  if (toggle)
							  {
								$(".page-container").addClass("sidebar-collapsed").removeClass("sidebar-collapsed-back");
								$("#menu span").css({"position":"absolute"});
							  }
							  else
							  {
								$(".page-container").removeClass("sidebar-collapsed").addClass("sidebar-collapsed-back");
								setTimeout(function() {
								  $("#menu span").css({"position":"relative"});
								}, 400);
							  }
											
											toggle = !toggle;
										});
							</script>
</head> 

<body>

<!--start body-->
   <div class="page-container">
		<!--start content-inner-->
			<div class="left-content">
			<div class="mother-grid-inner">
			
					<!--header start here-->
						<div class="header-main">
							<div class="logo-w3-agile">
								<h1 class="fa fa-envira" ><a href="ad_index.jsp">ANODITE CELL</a></h1>
							</div>
						<div class="profile_details w3l">		
								<ul>
									<li class="dropdown profile_details_drop">
										<a href="#" class="dropdown-toggle" data-toggle="dropdown" aria-expanded="false">
											<div class="profile_img">	
												<span class="prfil-img"><img src="images1/User-icon.png" alt=""> </span> 
												<div class="user-name">
													<p>Welcome</p>
													<span>Administrator</span>
												</div>
												<i class="fa fa-angle-down"></i>
												<i class="fa fa-angle-up"></i>
												<div class="clearfix"></div>	
											</div>	
										</a>
										<ul class="dropdown-menu drp-mnu">
											<li> <a href="ad_change_password.jsp"><i class="fa fa-user"></i> Profile</a> </li> 
											<li> <form action="adminlogout" method="post"> <button type="submit" class="btn btn-primary"><i class="fa fa-sign-out">Logout</i></button></form></li>
										</ul>
									</li>
								</ul>
							</div>
							<div class="clearfix"> </div>	
						</div>
					<!--heder end here-->
			
				<ol class="breadcrumb">
					<li class="breadcrumb-item"><a href="ad_index.jsp">Home</a> <i class="fa fa-angle-right"></i>Create Stocks</li>
				</ol>
				<div class="grid-form1">
					<h3>Create Stocks</h3>
					<div class="tab-content">
						<div class="tab-pane active" id="horizontal-form">
							<form action="stkadd" class="form-horizontal" name="stock" method="post">
								<div class="form-group">
									<label for="focusedinput" class="col-sm-2 control-label">Item Name</label>
									<div class="col-sm-8">
										<input type="text" class="form-control1" name="itemname" id="itemname" placeholder="Item-Name" required="">
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-2 control-label">Item Type</label>
									<div class="col-sm-8">
										<select name="type" id="type" multiple="" class="form-control1">
											<option value="mechanical">Mechanical</option>
											<option value="civil">Civil</option>
											<option value="electrical">Electrical</option>
											<option value="electronics">Electronics</option>
											<option value="cse_it">Cse_It</option>
											<option value="general">General</option>
										</select>
									</div>
								</div>
								<div class="form-group">
									<label for="focusedinput" class="col-sm-2 control-label">Item Details</label>
									<div class="col-sm-8">
										<input type="text" class="form-control1" name="details" id="details" maxlength="500" placeholder="Item-Details" required="">
									</div>
								</div>
								<div class="form-group">
									<label for="focusedinput" class="col-sm-2 control-label">Item Purchase Date</label>
									<div class="col-sm-8">
										<input type="date" class="form-control1" name="pdate" id="pdate" placeholder="Item-Purchase-Date" required="">
									</div>
								</div>
								<div class="form-group">
									<label for="focusedinput" class="col-sm-2 control-label">Item Warrenty Date</label>
									<div class="col-sm-8">
										<input type="date" class="form-control1" name="warrenty" id="warrenty" placeholder="Item-Warrenty-Date" required="">
									</div>
								</div>
								<div class="form-group">
									<label for="focusedinput" class="col-sm-2 control-label">Item cost</label>
									<div class="col-sm-8">
										<input type="text" class="form-control1" name="cost" id="cost" placeholder="Item-Cost" required="">
									</div>
								</div>
								<div class="form-group">
									<label for="focusedinput" class="col-sm-2 control-label">Item Quantity</label>
									<div class="col-sm-8">
										<input type="text" class="form-control1" name="quant" id="quant" placeholder="Item-Quantity" required="">
									</div>
								</div>
								<div class="form-group">
									<label for="focusedinput" class="col-sm-2 control-label">Item Image</label>
									<div class="col-sm-8">
										<input type="file" name="image" id="image" required="">
									</div>
								</div>
								<div class="row">
									<div class="col-sm-8 col-sm-offset-2">
										<button type="submit" class="btn btn-primary">Submit</button>
										<button class="btn-inverse btn">Reset</button>
									</div>
								</div>
							</form>
						</div>
					</div>
				</div>
				
				
				<!--copy rights start here-->
					<div class="copyrights">
						<p>© 2019 | ANODITE CELL </p>
					</div>	
				<!--COPY rights end here-->
		</div> </div>
		<!--end content-inner-->
     
	    <!--start content-inner-->
			<!--start sidebar-menu-->
				<div class="sidebar-menu">
					<header class="logo1">
						<a href="#" class="sidebar-icon"> <span class="fa fa-bars"></span> </a> 
					</header>
						<div style="border-top:1px ridge rgba(255, 255, 255, 0.15)"></div>
                           <div class="menu">
									<ul id="menu" >
										<li><a href="ad_index.jsp"><i class="fa fa-tachometer"></i> <span>Dashboard</span><div class="clearfix"></div></a></li>
										<li id="menu-academico" ><a href="#"><i class="fa fa-list-ul" aria-hidden="true"></i><span>Stocks</span> <span class="fa fa-angle-right" style="float: right"></span><div class="clearfix"></div></a>
										   <ul id="menu-academico-sub" >
												<a href="ad_create.jsp">Create</a>
												<a href="ad_manage_stocks_pre.jsp">Manage</a>
											</ul>
										</li>
										<li id="menu-academico"><a href="#"><i class="fa fa-users" aria-hidden="true"></i><span>Manage Users</span></a>
											<ul id="menu-academico-sub" >
											<form action="staffshw" method="post"><button type="submit" class="btn btn-succss fa fa-edit">Manage</button></form>
											</ul>
										</li>
										<li id="menu-academico"><a href="#"><i class="fa fa-table" aria-hidden="true"></i><span>Manage Pro_Req</span></a>
											<ul id="menu-academico-sub" >
											<form action="adpromang" method="post"><button type="submit" class="btn btn-succss fa fa-edit">Manage</button></form>
											</ul>
										</li>
										<li id="menu-academico"><a href="#"><i class="fa fa-table" aria-hidden="true"></i><span>Manage Ser_Req</span></a>
											<ul id="menu-academico-sub" >
											<form action="adsermang" method="post"><button type="submit" class="btn btn-succss fa fa-edit">Manage</button></form>
											</ul>
										</li>
										<li id="menu-academico"><a href="#"><i class="fa fa-file-text-o" aria-hidden="true"></i><span>Manage Feedback</span></a>
											<ul id="menu-academico-sub" >
											<form action="enqryshw" method="post"><button type="submit" class="btn btn-succss fa fa-edit">Manage</button></form>
											</ul>
										</li>
									</ul>
							</div>
				</div>
				<div class="clearfix"></div>
			<!-- end sidebar-menu-->

		<!--end content-inner-->
	</div>							  
<!--end body-->						
							
	
</body>
</html>