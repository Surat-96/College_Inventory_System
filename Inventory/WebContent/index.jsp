<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
    
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
      <link href="css1/font-awesome.css" rel="stylesheet">
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
   
    <!-- //here start HEADER -->
      <div class="header-outs" id="header">
         <!--banner -->
         <div class="header-most-top">
            <div class="one-headder">
               <div class="container-fluid">
                  <div class="row left-indus-icons RWDpagescrollfix">
                     <div class="col-lg-2 col-md-2 col-sm-2 pr-0 icons">
                        <ul>
                           <li>
                              <h4 id="clockdisp"></h4>
                           </li>
                        </ul>
                     </div>
                     <div class="col-lg-3 col-md-3 col-sm-4 ">
                     <% if(request.getAttribute("Message") != null) { %>
    				<b><h3 style="color: green"><%= request.getAttribute("Message") %></h3></b>
   	 				<% } %>
   	 				<% if(request.getAttribute("Message1") != null) { %>
    				<b><h3 style="color: red"><%= request.getAttribute("Message") %></h3></b>
   	 				<% } %>
                     </div>
                     <div class="col-lg-7 col-md-7 col-sm-8 agile-email-call ">
                        <ul>
                           <li>
                              <h4>Call Us:</h4>
                           </li>
                           <li>
                              <p>7003871310</p>
                           </li>
                           <li >
                              <h4>Email Us:</h4>
                           </li>
                           <li>
                              <p><a href="mailto:surat.banerjee@gmail.com">surat.banerjee@gmail.com</a></p>
                           </li>
                        </ul>
                     </div>
                  </div>
               </div>
            </div>
            <div class="headder-nav-icon pagescrollfix">
               <div class="container-fluid">
                  <div class="nav-headder-top">
                     <!--//navigation section -->
                     <nav class="navbar navbar-expand-lg navbar-light pagescrollfix">
                        <div class="hedder-up">
                           <h1><a class="navbar-brand " href="index.jsp"><span class="fa fa-envira"></span>ANODITE CELL</a></h1>
                        </div>
                        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                        <span class="navbar-toggler-icon"></span>
                        </button>
                        <div class="collapse navbar-collapse justify-content-end" id="navbarSupportedContent">
                           <ul class="navbar-nav ">
                              <li class="nav-item active">
                                 <a class="nav-link" href="index.jsp">HOME <span class="sr-only">(current)</span></a>
                              </li>
                              <li class="nav-item">
                                 <a href="about.jsp" class="nav-link">ABOUT</a>
                              </li>
                              <li class="nav-item">
                                 <a href="stafflogreg.jsp" class="nav-link">STAFF_LOGIN</a>
                              </li>
                              <li class="nav-item">
                                 <a href="hodlogreg.jsp" class="nav-link">HOD_LOGIN</a>
                              </li>
                           </ul>
                        </div>
                     </nav>
                  </div>
                  <div class="clearfix"> </div>
               </div>
            </div>
         </div>
         <!-- //Navigation -->
         <!-- Slideshow 4 -->
         <div class="slider">
            <div class="callbacks_container">
               <ul class="rslides" id="slider4">
                  <li>
                     <div class="slider-img one-img">
                        <div class="container">
                           <div class="slider-info ">
                              <h5>College Inventory System</h5>
                              <div class="bottom-info">
                                 <p> </p>
                              </div>
                           </div>
                        </div>
                     </div>
                  </li>
                  <li>
                     <div class="slider-img two-img">
                        <div class="container">
                           <div class="slider-info ">
                              <h5>Let Work Together</h5>
                              <div class="bottom-info">
                                 <p>   </p>
                              </div>
                           </div>
                        </div>
                     </div>
                  </li>
                  <li>
                     <div class="slider-img three-img">
                        <div class="container">
                           <div class="slider-info">
                              <h5>Innovative Project</h5>
                              <div class="bottom-info">
                                 <p>   </p>
                              </div>
                           </div>
                        </div>
                     </div>
                  </li>
               </ul>
            </div>
            <!-- This is here just to demonstrate the callbacks -->
            <!-- <ul class="events">
               <li>Example 4 callback events</li>
               </ul>-->
            <div class="clearfix"></div>
         </div>
      </div>
      <!-- //banner -->
	  
	  <script>
         $(window).scroll(function() {
             if ($(document).scrollTop() > 150) {
                 $('nav.pagescrollfix,nav.RWDpagescrollfix').addClass('shrink');
             } else {
                 $('nav.pagescrollfix,nav.RWDpagescrollfix').removeClass('shrink');
             }
         });
      </script>
	  <!--//Nav script scrollon--> 
      <script>
         // You can also use "$(window).load(function() {"
         $(function () {
         	// Slideshow 4
         	$("#slider4").responsiveSlides({
         		auto: true,
         		pager:true ,
         		nav:false,
         		speed: 900,
         		namespace: "callbacks",
         		before: function () {
         			$('.events').append("<li>before event fired.</li>");
         		},
         		after: function () {
         			$('.events').append("<li>after event fired.</li>");
         		}
         	});
         
         });
      </script>
      <!--// responsiveslides banner-->	
	  
	  <!-- start-smoth-scrolling -->
      <!-- here stars scrolling icon -->
      <script>
         $(document).ready(function () {
         
         	var defaults = {
         		containerID: 'toTop', // fading element id
         		containerHoverID: 'toTopHover', // fading element hover id
         		scrollSpeed: 1100,
         		easingType: 'linear'
         	};
         
         
         	$().UItoTop({
         		easingType: 'easeOutQuart'
         	});
         
         });
      </script>
      <!-- //here ends scrolling icon -->
 <!-- //here ends HEADER -->
 
<!-- about -->
      <section class="about py-lg-4 py-md-3 py-sm-3 py-3" id="about">
         <div class="container py-lg-5 py-md-5 py-sm-4 py-3">
         <div class="row abt-colm">
            <div class="col-lg-6 agile-info-img">
               <div class="row stats-info mb-lg-4 mb-3 text-center">
                  <div class="info-sub-w3">
                  <h5>Inventory Control is a technique of maintaining and monitoring the size of the inventory at appropriate level, 
                  so that the production and distributions take place effectively.
                  </h5>
                  </div>
               </div>
               <div class="video-left-w3l" id="video">
                <iframe src="https://www.google.com/maps/embed?pb=!1m14!1m8!1m3!1d14736.347508249042!2d88.4282805!3d22.5758538!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x0%3A0x16c43b9069f4b159!2sTechno+India+University!5e0!3m2!1sen!2sin!4v1551949079496" width="600" height="850" frameborder="0" style="border:0" allowfullscreen></iframe>
               </div>
            </div>
            <div class="col-lg-6 agile-abt-info">
                <div class="outs_more-buttn">
                  <a href="about.jsp">Inventory can be defined in several ways as follows as given below:</a>
               </div>
               <div class="arrow mt-lg-4 mt-md-3 mt-3">
                  <ul>
                     <li>
                        <span class="fas fa-angle-double-right dog-arrow"></span>
                        <p>�	Inventory is the stock of physical items such as materials, components, work-in-progress, finished goods, etc.,
                         held at a specific location at a specific time.  </p>
                     </li>
                     <li>
                        <span class="fas fa-angle-double-right dog-arrow"></span>
                        <p>	Inventory is the merchandise that is purchased and/or produced and stored for eventual sale. </p>
                     </li>
                     <li>
                        <span class="fas fa-angle-double-right dog-arrow"></span>
                        <p>Inventory is a list of what you have. In company accounts, inventory usually refers to the value of stocks, 
                        as distinct from fixed assets. </p>
                     </li>
                     <li>
                        <span class="fas fa-angle-double-right dog-arrow"></span>
                        <p>Inventory is a list of names, quantities and/or monitory values of all or any group of items.  </p>
                     </li>
                     
                  </ul>
               </div>
            </div>
         </div>
		 </div>
      </section>
      <!-- //about -->
      <!--Fun-facts-->
      <section class="fun-facts py-lg-4 py-md-3 py-sm-3 py-3">
         <div class="container py-lg-5 py-md-5 py-sm-4 py-3">
         <div class="row">
            <div class="col-lg-3 funt-list-grids">
               <div class="row">
                  <div class="col-md-3 col-sm-3 col-3 funt-agile-grids text-right">
                     <h6>1</h6>
                  </div>
                  <div class="col-md-8 col-sm-8 col-8 funt-agile-text text-left">
                     <h4 class="mb-3">NEW IDEAS</h4>
                    <!-- <p>Bibendum sodales, augue Vivamus elementum</p>-->
                  </div>
               </div>
            </div>
            <div class="col-lg-3 funt-list-grids">
               <div class="row">
                  <div class="col-md-3 col-sm-3 col-3 funt-agile-grids text-right">
                     <h6>2</h6>
                  </div>
                  <div class="col-md-8 col-sm-8 col-8 funt-agile-text text-left">
                     <h4 class="mb-3">INNOVATIVE</h4>
                     <!-- <p>Bibendum sodales, augue Vivamus elementum</p>-->
                  </div>
               </div>
            </div>
            <div class="col-lg-3 funt-list-grids">
               <div class="row">
                  <div class="col-md-3 col-sm-3 col-3 funt-agile-grids text-right">
                     <h6>3</h6>
                  </div>
                  <div class="col-md-8 col-sm-8 col-8 funt-agile-text text-left">
                     <h4 class="mb-3">COLLEGE RELATIVE</h4>
                     <!-- <p>Bibendum sodales, augue Vivamus elementum</p>-->
                  </div>
               </div>
            </div>
			<div class="col-lg-3 funt-list-grids">
               <div class="row">
                  <div class="col-md-3 col-sm-3 col-3 funt-agile-grids text-right">
                     <h6>4</h6>
                  </div>
                  <div class="col-md-8 col-sm-8 col-8 funt-agile-text text-left">
                     <h4 class="mb-3">INVENTORY SYSTEM</h4>
                     <!-- <p>Bibendum sodales, augue Vivamus elementum</p>-->
                  </div>
               </div>
            </div>
         </div>
		 </div>
      </section>
      <!--//Fun-facts-->
      <!--services-->
      <section class="service py-lg-4 py-md-3 py-sm-3 py-3" id="service">
         <div class="container py-lg-5 py-md-4 py-sm-4 py-3">
         <div class="title text-center mb-lg-5 mb-md-4 mb-sm-4 mb-3">
            <h3>Icons</h3>
         </div>
         <div class="row text-center">
            <div class="col-md-4 col-sm-6 service-list-grid">
               <div class="serv-w3l-grid">
                  <span class="fa fa-laptop"></span>
               </div>
              <!-- <h4 class="my-3">Commercial Fuel</h4>
               <p>Ut enim ad minima veniam, quis nostrum ullam corporis</p>-->
            </div>
            <div class="col-md-4 col-sm-6 service-list-grid">
               <div class="serv-w3l-grid">
                  <span class="fa fa-plane"></span>
               </div>
               <!-- <h4 class="my-3">Commercial Fuel</h4>
               <p>Ut enim ad minima veniam, quis nostrum ullam corporis</p>-->
            </div>
            <div class="col-md-4 col-sm-6 service-list-grid">
               <div class="serv-w3l-grid">
                  <span class="fa fa-road"></span>
               </div>
               <!-- <h4 class="my-3">Commercial Fuel</h4>
               <p>Ut enim ad minima veniam, quis nostrum ullam corporis</p>-->
            </div>
            <div class="col-md-4 col-sm-6 mt-lg-5 mt-md-4 mt-3 service-list-grid">
               <div class="serv-w3l-grid">
                  <span class="far fa-lightbulb"></span>
               </div>
               <!-- <h4 class="my-3">Commercial Fuel</h4>
               <p>Ut enim ad minima veniam, quis nostrum ullam corporis</p>-->
            </div>
            <div class="col-md-4 col-sm-6 mt-lg-5 mt-md-4 mt-3 service-list-grid">
               <div class="serv-w3l-grid">
                  <span class="fas fa-cogs"></span>
               </div>
               <!-- <h4 class="my-3">Commercial Fuel</h4>
               <p>Ut enim ad minima veniam, quis nostrum ullam corporis</p>-->
            </div>
            <div class="col-md-4 col-sm-6 mt-lg-5 mt-md-4 mt-3 service-list-grid">
               <div class="serv-w3l-grid">
                  <span class="fa fa-mobile-phone"></span>
               </div>
               <!-- <h4 class="my-3">Commercial Fuel</h4>
               <p>Ut enim ad minima veniam, quis nostrum ullam corporis</p>-->
            </div>
         </div>
		  </div>
      </section>
      <!--//services-->

 <!-- //here start FOOTER -->
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
                                 <a class="nav-link" href="index.jsp">HOME <span class="sr-only">(current)</span></a>
                              </li>
                              <li class="nav-item">
                                 <a href="about.jsp" class="nav-link">ABOUT</a>
                              </li>
                              <li class="nav-item">
                                 <a href="stafflogreg.jsp" class="nav-link">STAFF_LOGIN</a>
                              </li>
                              <li class="nav-item">
                                 <a href="hodlogreg.jsp" class="nav-link">HOD_LOGIN</a>
                              </li>
                              <li class="nav-item">
                                 <a href="admnlog.jsp" class="nav-link">ADMIN_LOGIN</a>
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
            <p>� 2019 ANODITE CELL. All Rights Reserved | Design by <a href="#" target="_blank">INVENTORY</a></p>
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
      
       <!-- //here ends FOOTER -->
	  
	  </body>
</html>