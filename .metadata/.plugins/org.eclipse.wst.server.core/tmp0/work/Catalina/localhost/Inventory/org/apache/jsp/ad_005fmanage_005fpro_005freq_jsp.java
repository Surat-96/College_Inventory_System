/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.12
 * Generated at: 2019-12-01 05:58:24 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.inventory.model.applystock;
import java.util.ArrayList;

public final class ad_005fmanage_005fpro_005freq_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

 ArrayList<applystock> list = null; 
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
    _jspx_imports_classes.add("com.inventory.model.applystock");
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
      out.write("<!DOCTYPE HTML>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Anodite Cell</title>\r\n");
      out.write("\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<meta name=\"keywords\" content=\"Pooled Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, \r\n");
      out.write("Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design\" />\r\n");
      out.write("\r\n");
      out.write("<!-- Bootstrap Core CSS -->\r\n");
      out.write("<link href=\"css1/bootstrap.min.css\" rel='stylesheet' type='text/css' />\r\n");
      out.write("<!-- Custom CSS -->\r\n");
      out.write("<link href=\"css1/style.css\" rel='stylesheet' type='text/css' />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css1/morris.css\" type=\"text/css\"/>\r\n");
      out.write("<!-- Graph CSS -->\r\n");
      out.write("<link href=\"css1/font-awesome.css\" rel=\"stylesheet\"> \r\n");
      out.write("<!-- jQuery -->\r\n");
      out.write("<script src=\"js1/jquery-2.1.4.min.js\"></script>\r\n");
      out.write("<!-- //jQuery -->\r\n");
      out.write("<link href='//fonts.googleapis.com/css1?family=Roboto:700,500,300,100italic,100,400' rel='stylesheet' type='text/css'/>\r\n");
      out.write("<link href='//fonts.googleapis.com/css1?family=Montserrat:400,700' rel='stylesheet' type='text/css'>\r\n");
      out.write("<!-- lined-icons -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css1/icon-font.min.css\" type='text/css' />\r\n");
      out.write("<!-- //lined-icons -->\r\n");
      out.write("<!--js -->\r\n");
      out.write("<script src=\"js1/jquery.nicescroll.js\"></script>\r\n");
      out.write("<script src=\"js1/scripts.js\"></script>\r\n");
      out.write("<!-- Bootstrap Core JavaScript -->\r\n");
      out.write("<script src=\"js1/bootstrap.min.js\"></script>\r\n");
      out.write("<!-- /Bootstrap Core JavaScript -->\t   \r\n");
      out.write("<!-- morris JavaScript -->\t\r\n");
      out.write("<script src=\"js1/raphael-min.js\"></script>\r\n");
      out.write("<script src=\"js1/morris.js\"></script>\r\n");
      out.write("<!-- tables -->\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css1/table-style.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css1/basictable.css\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"js1/jquery.basictable.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\r\n");
      out.write("<script>\r\n");
      out.write("\tvar toggle = true;\r\n");
      out.write("    \t$(\".sidebar-icon\").click(function() {                \r\n");
      out.write("\t\tif (toggle)\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\t$(\".page-container\").addClass(\"sidebar-collapsed\").removeClass(\"sidebar-collapsed-back\");\r\n");
      out.write("\t\t\t$(\"#menu span\").css({\"position\":\"absolute\"});\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\telse\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\t$(\".page-container\").removeClass(\"sidebar-collapsed\").addClass(\"sidebar-collapsed-back\");\r\n");
      out.write("\t\t\tsetTimeout(function() {\r\n");
      out.write("\t\t\t\t$(\"#menu span\").css({\"position\":\"relative\"});\r\n");
      out.write("\t\t\t\t}, 400);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\ttoggle = !toggle;});\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</head> \r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<!--start body-->\r\n");
      out.write("   <div class=\"page-container\">\r\n");
      out.write("\t\t<!--start content-inner-->\r\n");
      out.write("\t\t\t<div class=\"left-content\">\r\n");
      out.write("\t\t\t<div class=\"mother-grid-inner\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t\t<!--header start here-->\r\n");
      out.write("\t\t\t\t\t\t<div class=\"header-main\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"logo-w3-agile\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h1 class=\"fa fa-envira\" ><a href=\"ad_index.jsp\">ANODITE CELL</a></h1>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"profile_details w3l\">\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li class=\"dropdown profile_details_drop\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" aria-expanded=\"false\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"profile_img\">\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"prfil-img\"><img src=\"images1/User-icon.png\" alt=\"\"> </span> \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"user-name\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<p>Welcome</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<span>Administrator</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"fa fa-angle-down\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"fa fa-angle-up\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<ul class=\"dropdown-menu drp-mnu\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li> <a href=\"ad_change_password.jsp\"><i class=\"fa fa-user\"></i> Profile</a> </li> \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li> <form action=\"adminlogout\" method=\"post\"> <button type=\"submit\" class=\"btn btn-primary\"><i class=\"fa fa-sign-out\">Logout</i></button></form></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"clearfix\"> </div>\t\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<!--heder end here-->\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<ol class=\"breadcrumb\">\r\n");
      out.write("\t\t\t\t\t<li class=\"breadcrumb-item\"><a href=\"ad_index.jsp\">Home</a> <i class=\"fa fa-angle-right\"></i>Manage Product Request</li>\r\n");
      out.write("\t\t\t\t\t</ol>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t\t");
 list=(ArrayList<applystock>)request.getAttribute("info");
      out.write("\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<!-- start tables -->\r\n");
      out.write("\t\t\t\t\t<div class=\"agile-grids\">\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div class=\"agile-tables\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"w3l-table-info\">\r\n");
      out.write("\t\t\t\t\t\t\t<h2>Manage Product Request</h2>\r\n");
      out.write("\t\t\t\t\t\t\t<table id=\"table\" class=\"table-bordered border-success\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th>ID</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th>StaffName</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th>Itemname</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th>Date</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th>Action</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t\t\t\t<tbody class=\"border border-primary\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

            						for(applystock aps : list)
            						{
          							
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>");
      out.print(aps.getReqid() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>");
      out.print(aps.getStaffname() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>");
      out.print(aps.getItemname() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>");
      out.print(aps.getDate() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<form action=\"addetprom?reqid=");
      out.print(aps.getReqid());
      out.write("\" method=\"post\"><button type=\"submit\" class=\"btn btn-primary btn-block\">Details</button></form></br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
} 
      out.write("\t\t\t\t\t  \r\n");
      out.write("\t\t\t\t\t\t\t\t</tbody>\r\n");
      out.write("                     \t</table>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div></div>\r\n");
      out.write("\t\t\t\t\t<!-- end tables -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<!--copy rights start here-->\r\n");
      out.write("\t\t\t\t\t<div class=\"copyrights\">\r\n");
      out.write("\t\t\t\t\t\t<p>Â© 2019 | ANODITE CELL </p>\r\n");
      out.write("\t\t\t\t\t</div>\t\r\n");
      out.write("\t\t\t\t\t<!--COPY rights end here-->\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t </div>\r\n");
      out.write("\t\t<!--end content-inner-->\r\n");
      out.write("     \r\n");
      out.write("\t    <!--start content-inner-->\r\n");
      out.write("\t\t\t<!--start sidebar-menu-->\r\n");
      out.write("\t\t\t\t<div class=\"sidebar-menu\">\r\n");
      out.write("\t\t\t\t\t<header class=\"logo1\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"#\" class=\"sidebar-icon\"> <span class=\"fa fa-bars\"></span> </a> \r\n");
      out.write("\t\t\t\t\t</header>\r\n");
      out.write("\t\t\t\t\t\t<div style=\"border-top:1px ridge rgba(255, 255, 255, 0.15)\"></div>\r\n");
      out.write("                           <div class=\"menu\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul id=\"menu\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"ad_index.jsp\"><i class=\"fa fa-tachometer\"></i> <span>Dashboard</span><div class=\"clearfix\"></div></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li id=\"menu-academico\" ><a href=\"#\"><i class=\"fa fa-list-ul\" aria-hidden=\"true\"></i><span>Stocks</span> <span class=\"fa fa-angle-right\" style=\"float: right\"></span><div class=\"clearfix\"></div></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t   <ul id=\"menu-academico-sub\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"ad_create.jsp\">Create</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"ad_manage_stocks_pre.jsp\">Manage</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li id=\"menu-academico\"><a href=\"#\"><i class=\"fa fa-users\" aria-hidden=\"true\"></i><span>Manage Users</span></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<ul id=\"menu-academico-sub\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<form action=\"staffshw\" method=\"post\"><button type=\"submit\" class=\"btn btn-succss fa fa-edit\">Manage</button></form>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li id=\"menu-academico\"><a href=\"#\"><i class=\"fa fa-table\" aria-hidden=\"true\"></i><span>Manage Pro_Req</span></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<ul id=\"menu-academico-sub\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<form action=\"adpromang\" method=\"post\"><button type=\"submit\" class=\"btn btn-succss fa fa-edit\">Manage</button></form>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li id=\"menu-academico\"><a href=\"#\"><i class=\"fa fa-table\" aria-hidden=\"true\"></i><span>Manage Ser_Req</span></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<ul id=\"menu-academico-sub\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<form action=\"adsermang\" method=\"post\"><button type=\"submit\" class=\"btn btn-succss fa fa-edit\">Manage</button></form>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li id=\"menu-academico\"><a href=\"#\"><i class=\"fa fa-file-text-o\" aria-hidden=\"true\"></i><span>Manage Feedback</span></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<ul id=\"menu-academico-sub\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<form action=\"enqryshw\" method=\"post\"><button type=\"submit\" class=\"btn btn-succss fa fa-edit\">Manage</button></form>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t\t\t<!-- end sidebar-menu-->\r\n");
      out.write("\r\n");
      out.write("\t\t<!--end content-inner-->\r\n");
      out.write("\t</div>\t\t\t\t\t\t\t  \r\n");
      out.write("<!--end body-->\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\r\n");
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
