/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.12
 * Generated at: 2019-10-18 12:33:42 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.inventory.model.stockmodel;
import java.util.ArrayList;

public final class staff_005fstocks_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

 ArrayList<stockmodel> list = null; 
  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.inventory.model.stockmodel");
    _jspx_imports_classes.add("java.util.ArrayList");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"zxx\">\r\n");
      out.write("   <head>\r\n");
      out.write("      <title>ANODITE CELL</title>\r\n");
      out.write("      <!--meta tags -->\r\n");
      out.write("      <meta charset=\"UTF-8\">\r\n");
      out.write("      <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("      <meta name=\"keywords\" content=\"Molten Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, \r\n");
      out.write("         Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design\" />\r\n");
      out.write("         \r\n");
      out.write("       <!--//meta tags ends here-->\r\n");
      out.write("      <!--booststrap-->\r\n");
      out.write("      <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\">\r\n");
      out.write("      <!--//booststrap end-->\r\n");
      out.write("      <!-- font-awesome icons -->\r\n");
      out.write("      <link href=\"css/fontawesome-all.min.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\">\r\n");
      out.write("      <link href=\"css1/font-awesome.css\" rel=\"stylesheet\">\r\n");
      out.write("      <!-- //font-awesome icons -->\r\n");
      out.write("      <!--stylesheets-->\r\n");
      out.write("      <link href=\"css/style.css\" rel='stylesheet' type='text/css' media=\"all\">\r\n");
      out.write("      <!--//stylesheets-->\r\n");
      out.write("      <link href=\"//fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,600,700\" rel=\"stylesheet\">\r\n");
      out.write("      <link href=\"//fonts.googleapis.com/css?family=Open+Sans:300,400,600\" rel=\"stylesheet\">\r\n");
      out.write("\t  <!--js working-->\r\n");
      out.write("      <script src='js/jquery-2.2.3.min.js'></script>\r\n");
      out.write("      <!--//js working-->\r\n");
      out.write("\t  <!--responsiveslides banner-->\r\n");
      out.write("      <script src=\"js/responsiveslides.min.js\"></script>\r\n");
      out.write("\t  <!--bootstrap working-->\r\n");
      out.write("      <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("      <!-- //bootstrap working-->\r\n");
      out.write("      \r\n");
      out.write("      <!--gallery-->\r\n");
      out.write("      <link rel=\"stylesheet\" href=\"css/lightbox.css\">\r\n");
      out.write("      <!--//gallery-->\r\n");
      out.write("      <!--gallery-hover-->\r\n");
      out.write("      <link rel=\"stylesheet\" type=\"text/css\" href=\"css/set1.css\" />\r\n");
      out.write("      <!--//gallery-hover-->   \r\n");
      out.write("           \r\n");
      out.write("      <script>\r\n");
      out.write("      addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); }\r\n");
      out.write("\t\t \r\n");
      out.write("\t\t window.onload=function(){getTime();}  \r\n");
      out.write("\r\n");
      out.write("\t\tfunction getTime()\r\n");
      out.write("\t\t{  \r\n");
      out.write("\t\t\tvar today=new Date();  \r\n");
      out.write("\t\t\tvar h=today.getHours();  \r\n");
      out.write("\t\t\tvar m=today.getMinutes();  \r\n");
      out.write("\t\t\tvar s=today.getSeconds();  \r\n");
      out.write("\r\n");
      out.write("\t\t\t// add a zero in front of numbers<10  \r\n");
      out.write("\t\t\th=checkTime(h);\r\n");
      out.write("\t\t\tm=checkTime(m);  \r\n");
      out.write("\t\t\ts=checkTime(s);  \r\n");
      out.write("\r\n");
      out.write("\t\t\tdocument.getElementById('clockdisp').innerHTML=h+\":\"+m+\":\"+s;  \r\n");
      out.write("\r\n");
      out.write("\t\t\t//Recursive Function Call\r\n");
      out.write("\t\t\tsetTimeout(function(){getTime()},1000);\r\n");
      out.write("\t\t\t//setInterval(\"getTime()\",1000);//another way\r\n");
      out.write("\t\t}  \r\n");
      out.write("    \r\n");
      out.write("\t\tfunction checkTime(i)\r\n");
      out.write("\t\t{  \r\n");
      out.write("\t\t\tif (i<10)\r\n");
      out.write("\t\t\t{  i=\"0\" + i;  }\r\n");
      out.write("\t\t\treturn i;  \r\n");
      out.write("\t\t}  \r\n");
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("      </script>\r\n");
      out.write("      \t  \r\n");
      out.write("   </head>\r\n");
      out.write("   <body>\r\n");
      out.write("   \r\n");
      out.write("    <!-- //here start HEADER -->\r\n");
      out.write("      <div class=\"header-outs\" id=\"header\">\r\n");
      out.write("         <!--banner -->\r\n");
      out.write("         <div class=\"header-most-top\">\r\n");
      out.write("            <div class=\"one-headder\">\r\n");
      out.write("               <div class=\"container-fluid\">\r\n");
      out.write("                  <div class=\"row left-indus-icons RWDpagescrollfix\">\r\n");
      out.write("                     <div class=\"col-lg-5 col-md-5 col-sm-4 pr-0 icons\">\r\n");
      out.write("                        <ul>\r\n");
      out.write("                           <li>\r\n");
      out.write("                              <h4 id=\"clockdisp\"></h4>\r\n");
      out.write("                           </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                     </div>\r\n");
      out.write("                     <div class=\"col-lg-7 col-md-7 col-sm-8 agile-email-call \">\r\n");
      out.write("                        <ul>\r\n");
      out.write("                           <li>\r\n");
      out.write("                              <h4>Call Us:</h4>\r\n");
      out.write("                           </li>\r\n");
      out.write("                           <li>\r\n");
      out.write("                              <p>7003871310</p>\r\n");
      out.write("                           </li>\r\n");
      out.write("                           <li >\r\n");
      out.write("                              <h4>Email Us:</h4>\r\n");
      out.write("                           </li>\r\n");
      out.write("                           <li>\r\n");
      out.write("                              <p><a href=\"mailto:surat.banerjee@gmail.com\">surat.banerjee@gmail.com</a></p>\r\n");
      out.write("                           </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                     </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("               </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"headder-nav-icon pagescrollfix\">\r\n");
      out.write("               <div class=\"container-fluid\">\r\n");
      out.write("                  <div class=\"nav-headder-top\">\r\n");
      out.write("                     <!--//navigation section -->\r\n");
      out.write("               <nav class=\"navbar navbar-expand-lg navbar-light pagescrollfix\">\r\n");
      out.write("                        <div class=\"hedder-up\">\r\n");
      out.write("                           <h1><a class=\"navbar-brand \" href=\"staff_dash.jsp\"><span class=\"fa fa-envira\"></span>ANODITE CELL</a></h1>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("                        <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("                        </button>\r\n");
      out.write("                        <div class=\"collapse navbar-collapse justify-content-end\" id=\"navbarSupportedContent\">\r\n");
      out.write("                           <ul class=\"navbar-nav \">\r\n");
      out.write("                              <li class=\"nav-item active\">\r\n");
      out.write("                                 <a class=\"nav-link\" href=\"staff_dash.jsp\">Staff_Profile<span class=\"sr-only\">(current)</span></a>\r\n");
      out.write("                              </li>\r\n");
      out.write("                              <li class=\"nav-item dropdown\">\r\n");
      out.write("                                 <a href=\"staff_stocks_pre.jsp\" class=\"nav-link\">Stocks</a>\r\n");
      out.write("                              </li>\r\n");
      out.write("                              <li class=\"nav-item\">\r\n");
      out.write("                                 <a href=\"staff_serv.jsp\" class=\"nav-link\">Service</a>\r\n");
      out.write("                              </li>\r\n");
      out.write("                             <li class=\"nav-item\">\r\n");
      out.write("                                 <a href=\"staff_cart_pre.jsp\" class=\"nav-link\">Manage</a>\r\n");
      out.write("                             </li>\r\n");
      out.write("                              <li class=\"nav-item\">\r\n");
      out.write("                                 <a href=\"staff_feed.jsp\" class=\"nav-link\">Feedback</a>\r\n");
      out.write("                              </li>\r\n");
      out.write("                           </ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("                     </nav>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"clearfix\"> </div>\r\n");
      out.write("               </div>\r\n");
      out.write("            </div>\r\n");
      out.write("         </div>\r\n");
      out.write("         <!-- //Navigation -->\r\n");
      out.write("         <!-- Slideshow 4 -->\r\n");
      out.write("         <div class=\"slider\">\r\n");
      out.write("            <div class=\"callbacks_container\">\r\n");
      out.write("               <ul class=\"rslides\" id=\"slider4\">\r\n");
      out.write("                  <li>\r\n");
      out.write("                     <div class=\"slider-img one-img\">\r\n");
      out.write("                        <div class=\"container\">\r\n");
      out.write("                           <div class=\"slider-info \">\r\n");
      out.write("                              <h5>College Inventory System</h5>\r\n");
      out.write("                              <div class=\"bottom-info\">\r\n");
      out.write("                                 <p> </p>\r\n");
      out.write("                              </div>\r\n");
      out.write("                           </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                     </div>\r\n");
      out.write("                  </li>\r\n");
      out.write("                  <li>\r\n");
      out.write("                     <div class=\"slider-img two-img\">\r\n");
      out.write("                        <div class=\"container\">\r\n");
      out.write("                           <div class=\"slider-info \">\r\n");
      out.write("                              <h5>Let Work Together</h5>\r\n");
      out.write("                              <div class=\"bottom-info\">\r\n");
      out.write("                                 <p>   </p>\r\n");
      out.write("                              </div>\r\n");
      out.write("                           </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                     </div>\r\n");
      out.write("                  </li>\r\n");
      out.write("                  <li>\r\n");
      out.write("                     <div class=\"slider-img three-img\">\r\n");
      out.write("                        <div class=\"container\">\r\n");
      out.write("                           <div class=\"slider-info\">\r\n");
      out.write("                              <h5>Innovative Project</h5>\r\n");
      out.write("                              <div class=\"bottom-info\">\r\n");
      out.write("                                 <p>   </p>\r\n");
      out.write("                              </div>\r\n");
      out.write("                           </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                     </div>\r\n");
      out.write("                  </li>\r\n");
      out.write("               </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- This is here just to demonstrate the callbacks -->\r\n");
      out.write("            <!-- <ul class=\"events\">\r\n");
      out.write("               <li>Example 4 callback events</li>\r\n");
      out.write("               </ul>-->\r\n");
      out.write("            <div class=\"clearfix\"></div>\r\n");
      out.write("         </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <!-- //banner -->\r\n");
      out.write("\t  \r\n");
      out.write("\t  <script>\r\n");
      out.write("         $(window).scroll(function() {\r\n");
      out.write("             if ($(document).scrollTop() > 150) {\r\n");
      out.write("                 $('nav.pagescrollfix,nav.RWDpagescrollfix').addClass('shrink');\r\n");
      out.write("             } else {\r\n");
      out.write("                 $('nav.pagescrollfix,nav.RWDpagescrollfix').removeClass('shrink');\r\n");
      out.write("             }\r\n");
      out.write("         });\r\n");
      out.write("      </script>\r\n");
      out.write("\t  <!--//Nav script scrollon--> \r\n");
      out.write("      <script>\r\n");
      out.write("         // You can also use \"$(window).load(function() {\"\r\n");
      out.write("         $(function () {\r\n");
      out.write("         \t// Slideshow 4\r\n");
      out.write("         \t$(\"#slider4\").responsiveSlides({\r\n");
      out.write("         \t\tauto: true,\r\n");
      out.write("         \t\tpager:true ,\r\n");
      out.write("         \t\tnav:false,\r\n");
      out.write("         \t\tspeed: 900,\r\n");
      out.write("         \t\tnamespace: \"callbacks\",\r\n");
      out.write("         \t\tbefore: function () {\r\n");
      out.write("         \t\t\t$('.events').append(\"<li>before event fired.</li>\");\r\n");
      out.write("         \t\t},\r\n");
      out.write("         \t\tafter: function () {\r\n");
      out.write("         \t\t\t$('.events').append(\"<li>after event fired.</li>\");\r\n");
      out.write("         \t\t}\r\n");
      out.write("         \t});\r\n");
      out.write("         \r\n");
      out.write("         });\r\n");
      out.write("      </script>\r\n");
      out.write("      <!--// responsiveslides banner-->\t\r\n");
      out.write("\t  \r\n");
      out.write("\t  <!-- start-smoth-scrolling -->\r\n");
      out.write("      <!-- here stars scrolling icon -->\r\n");
      out.write("      <script>\r\n");
      out.write("         $(document).ready(function () {\r\n");
      out.write("         \r\n");
      out.write("         \tvar defaults = {\r\n");
      out.write("         \t\tcontainerID: 'toTop', // fading element id\r\n");
      out.write("         \t\tcontainerHoverID: 'toTopHover', // fading element hover id\r\n");
      out.write("         \t\tscrollSpeed: 1100,\r\n");
      out.write("         \t\teasingType: 'linear'\r\n");
      out.write("         \t};\r\n");
      out.write("         \r\n");
      out.write("         \r\n");
      out.write("         \t$().UItoTop({\r\n");
      out.write("         \t\teasingType: 'easeOutQuart'\r\n");
      out.write("         \t});\r\n");
      out.write("         \r\n");
      out.write("         });\r\n");
      out.write("      </script>\r\n");
      out.write("      <!-- //here ends scrolling icon -->\r\n");
      out.write(" <!-- //here ends HEADER -->\r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write("  <!-- //here start BODY -->\r\n");
      out.write(" <!-- short -->\r\n");
      out.write("      <div class=\"using-border py-3\">\r\n");
      out.write("         <div class=\"inner_breadcrumb  ml-4\">\r\n");
      out.write("            <ul class=\"short_ls\">\r\n");
      out.write("                <li>Stocks</li>\r\n");
      out.write("            </ul>\r\n");
      out.write("         </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <!-- //short-->\r\n");
      out.write("      \r\n");
      out.write("      ");
      out.write("\r\n");
      out.write("\t\t");
 list=(ArrayList<stockmodel>)request.getAttribute("info");
      out.write("\r\n");
      out.write("      \r\n");
      out.write("      <section class=\"gallery py-lg-4 py-md-3 py-sm-3 py-3\">\r\n");
      out.write("         <div class=\"container py-lg-5 py-md-4 py-sm-4 py-3\">\r\n");
      out.write("            <div class=\"title text-center mb-lg-5 mb-md-4 mb-sm-4 mb-3\">\r\n");
      out.write("               <h3>Our stocks</h3>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"row grid gallery-info\">\r\n");
      out.write("            ");

            for(stockmodel smod : list){
          	
      out.write("\r\n");
      out.write("               <div class=\"col-lg-4 col-md-6 col-sm-6 gallery-grids\">\r\n");
      out.write("                  <figure class=\"effect-goliath\">\r\n");
      out.write("                     <img src=\"images/");
      out.print(smod.getImage());
      out.write("\" width=\"300\" height=\"400\" alt=\"\"/>\r\n");
      out.write("                     <figcaption>\r\n");
      out.write("                        <h6>");
      out.print(smod.getItemname() );
      out.write("</h6>\r\n");
      out.write("                        <form action=\"detstck?itemname=");
      out.print(smod.getItemname());
      out.write("\" method=\"post\" class=\"gallery-box\" data-lightbox=\"example-set\" data-title=\"\">\r\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-primary btn-block\">Details</button></form>\r\n");
      out.write("                     </figcaption>\r\n");
      out.write("                  </figure>\r\n");
      out.write("               </div>\r\n");
      out.write("               ");
}
      out.write("\r\n");
      out.write("               \r\n");
      out.write("            </div>\r\n");
      out.write("         </div>\r\n");
      out.write("      </section>\r\n");
      out.write("      \r\n");
      out.write("      <!-- //here end BODY -->\t\t\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- //here start FOOTER -->\r\n");
      out.write("<!--comments-->\r\n");
      out.write("      <section class=\"comments py-lg-4 py-md-3 py-sm-3 py-3\">\r\n");
      out.write("         <div class=\"container py-lg-5 py-md-4 py-sm-4 py-3\">\r\n");
      out.write("            <div class=\"fun-hedder-up\">\r\n");
      out.write("               <h6>COLLEGE INVENTORY SYSTEM</h6>\r\n");
      out.write("            </div>\r\n");
      out.write("         </div>\r\n");
      out.write("      </section>\r\n");
      out.write("      <!--//comments-->\r\n");
      out.write("\t<!--Footer -->\r\n");
      out.write("      <section class=\"py-lg-4 py-md-3 py-sm-3 py-3\">\r\n");
      out.write("        \r\n");
      out.write("      </section>\r\n");
      out.write("      <section class=\"images-position-grid\">\r\n");
      out.write("         <div class=\"container\">\r\n");
      out.write("            <div class=\"row imgs-both-side\">\r\n");
      out.write("               <div class=\"col-lg-6 col-md-6 col-sm-6 img-first-left\">\r\n");
      out.write("                  <h5>TECHNO INDIA GROUP</h5>\r\n");
      out.write("               </div>\r\n");
      out.write("               <div class=\"col-lg-6 col-md-6 col-sm-6 img-second-left\">\r\n");
      out.write("                  <h5>TECHNO INDIA GROUP</h5>\r\n");
      out.write("               </div>\r\n");
      out.write("            </div>\r\n");
      out.write("         </div>\r\n");
      out.write("      </section>\r\n");
      out.write("      <footer class=\"buttom-footer py-lg-4 py-md-3 py-sm-3 py-3\">\r\n");
      out.write("         <section>\r\n");
      out.write("            <div class=\"container py-lg-5 py-md-5 py-sm-4 py-4\">\r\n");
      out.write("               <div class=\"\">\r\n");
      out.write("                  <div class=\"row footer-agile-grids \">\r\n");
      out.write("                     <div class=\"col-lg-4 col-md-4 col-sm-12 wthree-left-right\">\r\n");
      out.write("                        <h4 class=\"pb-lg-3 pb-3\">Nav Links</h4>\r\n");
      out.write("                        <nav class=\"border-line\">\r\n");
      out.write("                           <ul class=\"nav flex-column\">\r\n");
      out.write("                              <li class=\"nav-item active\">\r\n");
      out.write("                                 <a class=\"nav-link\" href=\"staff_dash.jsp\">Staff_Profile<span class=\"sr-only\">(current)</span></a>\r\n");
      out.write("                              </li>\r\n");
      out.write("                              <li class=\"nav-item dropdown\">\r\n");
      out.write("                                 <a href=\"staff_stocks_pre.jsp\" class=\"nav-link\">Stocks</a>\r\n");
      out.write("                              </li>\r\n");
      out.write("                              <li class=\"nav-item\">\r\n");
      out.write("                                 <a href=\"staff_serv.jsp\" class=\"nav-link\">Service</a>\r\n");
      out.write("                              </li>\r\n");
      out.write("                             <li class=\"nav-item\">\r\n");
      out.write("                                 <a href=\"staff_cart_pre.jsp\" class=\"nav-link\">Manage</a>\r\n");
      out.write("                             </li>\r\n");
      out.write("                              <li class=\"nav-item\">\r\n");
      out.write("                                 <a href=\"staff_feed.jsp\" class=\"nav-link\">Feedback</a>\r\n");
      out.write("                              </li>\r\n");
      out.write("                           </ul>\r\n");
      out.write("                        </nav>\r\n");
      out.write("                     </div>\r\n");
      out.write("                     <div class=\"wthree-left-right col-lg-4 col-md-4 col-sm-12\">\r\n");
      out.write("                        <h4 class=\"pb-lg-3 pb-3\">Get In Touch</h4>\r\n");
      out.write("                        <div class=\"wls-hours-list\">\r\n");
      out.write("                           <ul>\r\n");
      out.write("                              <li class=\"d-flex\">Monday-Friday<span class=\"time ml-auto\"> 6:00am-11:00pm</span></li>\r\n");
      out.write("                              <li class=\"d-flex\">Saturday-Sunday <span class=\"time ml-auto\">6:00am-11:00pm</span></li> \r\n");
      out.write("                           </ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("                     </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("               </div>\r\n");
      out.write("            </div>\r\n");
      out.write("         </section>\r\n");
      out.write("         <div class=\"copy-agile-right text-center\">\r\n");
      out.write("            <p>© 2019 ANODITE CELL. All Rights Reserved | Design by <a href=\"#\" target=\"_blank\">INVENTORY</a></p>\r\n");
      out.write("         </div>\r\n");
      out.write("      </footer>\r\n");
      out.write("      <!-- //Footer -->\r\n");
      out.write("\t  \r\n");
      out.write("\t  <!-- //OnScroll-Number-Increase-JavaScript -->  \r\n");
      out.write("      <!-- start-smoth-scrolling -->\r\n");
      out.write("      <script src=\"js/move-top.js\"></script>\r\n");
      out.write("      <script src=\"js/easing.js\"></script>\r\n");
      out.write("      <script>\r\n");
      out.write("         jQuery(document).ready(function ($) {\r\n");
      out.write("         \t$(\".scroll\").click(function (event) {\r\n");
      out.write("         \t\tevent.preventDefault();\r\n");
      out.write("         \t\t$('html,body').animate({\r\n");
      out.write("         \t\t\tscrollTop: $(this.hash).offset().top\r\n");
      out.write("         \t\t}, 900);\r\n");
      out.write("         \t});\r\n");
      out.write("         });\r\n");
      out.write("      </script>\r\n");
      out.write("      \r\n");
      out.write("       <!-- //here ends FOOTER -->\r\n");
      out.write("\t  \r\n");
      out.write("\t  </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
