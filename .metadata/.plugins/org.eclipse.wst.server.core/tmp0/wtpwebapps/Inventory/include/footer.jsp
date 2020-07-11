<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="zxx">
   <head>
      <title>ANODITE CELL</title>
      <!--meta tags -->
      <meta charset="UTF-8">
      <meta name="viewport" content="width=device-width, initial-scale=1">
      <meta name="keywords" content="Molten Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
         Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
      <script>
      addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); }
		 
		 window.onload=function(){getTime();}  

		function getTime()
		{  
			var today=new Date();  
			var h=today.getHours();  
			var m=today.getMinutes();  
			var s=today.getSeconds();  

			// add a zero in front of numbers<10  
			h=checkTime(h);
			m=checkTime(m);  
			s=checkTime(s);  

			document.getElementById('clockdisp').innerHTML=h+":"+m+":"+s;  

			//Recursive Function Call
			setTimeout(function(){getTime()},1000);
			//setInterval("getTime()",1000);//another way
		}  
    
		function checkTime(i)
		{  
			if (i<10)
			{  i="0" + i;  }
			return i;  
		}  
      </script>
	  
	  
	  
      <!--//meta tags ends here-->
      <!--booststrap-->
      <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css" media="all">
      <!--//booststrap end-->
      <!-- font-awesome icons -->
      <link href="css/fontawesome-all.min.css" rel="stylesheet" type="text/css" media="all">
      <!-- //font-awesome icons -->
      <!--stylesheets-->
      <link href="css/style.css" rel='stylesheet' type='text/css' media="all">
      <!--//stylesheets-->
      <link href="//fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,600,700" rel="stylesheet">
      <link href="//fonts.googleapis.com/css?family=Open+Sans:300,400,600" rel="stylesheet">
	  <!--js working-->
      <script src='js/jquery-2.2.3.min.js'></script>
      <!--//js working-->
	  <!--responsiveslides banner-->
      <script src="js/responsiveslides.min.js"></script>
	  <!--bootstrap working-->
      <script src="js/bootstrap.min.js"></script>
      <!-- //bootstrap working-->
	  
   </head>
   
    <body>
	
	<!--comments-->
      <section class="comments py-lg-4 py-md-3 py-sm-3 py-3">
         <div class="container py-lg-5 py-md-4 py-sm-4 py-3">
            <div class="fun-hedder-up">
               <h6>COLLEGE INVENTORY SYSTEM</h6>
            </div>
         </div>
      </section>
      <!--//comments-->
	<!--Footer -->
      <section class="py-lg-4 py-md-3 py-sm-3 py-3">
        
      </section>
      <section class="images-position-grid">
         <div class="container">
            <div class="row imgs-both-side">
               <div class="col-lg-6 col-md-6 col-sm-6 img-first-left">
                  <h5>TECHNO INDIA GROUP</h5>
               </div>
               <div class="col-lg-6 col-md-6 col-sm-6 img-second-left">
                  <h5>TECHNO INDIA GROUP</h5>
               </div>
            </div>
         </div>
      </section>
      <footer class="buttom-footer py-lg-4 py-md-3 py-sm-3 py-3">
         <section>
            <div class="container py-lg-5 py-md-5 py-sm-4 py-4">
               <div class="">
                  <div class="row footer-agile-grids ">
                     <div class="col-lg-4 col-md-4 col-sm-12 wthree-left-right">
                        <h4 class="pb-lg-3 pb-3">Nav Links</h4>
                        <nav class="border-line">
                           <ul class="nav flex-column">
                              <li class="nav-item active">
                                 <a class="nav-link" href="index.jsp">Home <span class="sr-only">(current)</span></a>
                              </li>
                              <li class="nav-item">
                                 <a href="about.jsp" class="nav-link">About</a>
                              </li>
                              <li class="nav-item">
                                 <a href="userlogreg.jsp" class="nav-link">USER_LOGIN</a>
                              </li>
                              <li class="nav-item">
                                 <a href="adminlog.jsp" class="nav-link">ADMIN_LOGIN</a>
                              </li>
                           </ul>
                        </nav>
                     </div>
                     <div class="wthree-left-right col-lg-4 col-md-4 col-sm-12">
                        <h4 class="pb-lg-3 pb-3">Get In Touch</h4>
                        <div class="wls-hours-list">
                           <ul>
                              <li class="d-flex">Monday-Friday<span class="time ml-auto"> 6:00am-11:00pm</span></li>
                              <li class="d-flex">Saturday-Sunday <span class="time ml-auto">6:00am-11:00pm</span></li> 
                           </ul>
                        </div>
                     </div>
                  </div>
               </div>
            </div>
         </section>
         <div class="copy-agile-right text-center">
            <p>© 2019 ANODITE CELL. All Rights Reserved | Design by <a href="#" target="_blank">INVENTORY</a></p>
         </div>
      </footer>
      <!-- //Footer -->
	  
	  <!-- //OnScroll-Number-Increase-JavaScript -->  
      <!-- start-smoth-scrolling -->
      <script src="js/move-top.js"></script>
      <script src="js/easing.js"></script>
      <script>
         jQuery(document).ready(function ($) {
         	$(".scroll").click(function (event) {
         		event.preventDefault();
         		$('html,body').animate({
         			scrollTop: $(this.hash).offset().top
         		}, 900);
         	});
         });
      </script>
	  
	  </body>
</html>