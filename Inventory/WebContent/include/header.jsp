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
      <div class="header-outs" id="header">
         <!--banner -->
         <div class="header-most-top">
            <div class="one-headder">
               <div class="container-fluid">
                  <div class="row left-indus-icons RWDpagescrollfix">
                     <div class="col-lg-5 col-md-5 col-sm-4 pr-0 icons">
                        <ul>
                           <li>
                              <h4 id="clockdisp"></h4>
                           </li>
                        </ul>
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
                           <h1><a class="navbar-brand" href="index.jsp"><span class="fas fa-cogs"></span>ANODITE CELL</a></h1>
                        </div>
                        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                        <span class="navbar-toggler-icon"></span>
                        </button>
                        <div class="collapse navbar-collapse justify-content-end" id="navbarSupportedContent">
                           <ul class="navbar-nav ">
                              <li class="nav-item active">
                                 <a class="nav-link" href="index.jsp">Home <span class="sr-only">(current)</span></a>
                              </li>
                              <li class="nav-item">
                                 <a href="about.jsp" class="nav-link">About</a>
                              </li>
                              <li class="nav-item">
                                 <a href="userlogreg.jsp" class="nav-link">USER_LOGIN</a>
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
	  
	  </body>
</html>