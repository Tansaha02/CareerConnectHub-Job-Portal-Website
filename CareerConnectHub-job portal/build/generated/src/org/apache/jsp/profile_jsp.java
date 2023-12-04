package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class profile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

  String user = "";
  Object usernameObj = session.getAttribute("username");
  if (usernameObj != null) {
    user = usernameObj.toString();
  } else {
    response.sendRedirect("user_login.jsp");
  }

      out.write("\n");
      out.write("\n");
      out.write("<!-----META SECTION----->\n");
      out.write("<!DOCTYPE html>\n");
      out.write(" <html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("   <title>Search Job</title>\n");
      out.write("   <meta charset=\"utf-8\">\n");
      out.write("   <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("   <link rel=\"stylesheet\" href=\"index.css\">\n");
      out.write("   <meta name=\"robots\" content=\"noindex, nofollow\">\n");
      out.write("   <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("   <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\n");
      out.write("  <style>\n");
      out.write("\n");
      out.write("        /* Sidebar styles */\n");
      out.write("        .sidebar {\n");
      out.write("            width: 250px;\n");
      out.write("            background-color: #000;\n");
      out.write("            color: #fff;\n");
      out.write("            float: left;\n");
      out.write("            height: 100vh; /* Adjust sidebar height */\n");
      out.write("        }\n");
      out.write("        .sidebar ul {\n");
      out.write("            list-style: none;\n");
      out.write("            padding: 0;\n");
      out.write("        }\n");
      out.write("        .sidebar li {\n");
      out.write("            padding: 10px;\n");
      out.write("            cursor: pointer;\n");
      out.write("        }\n");
      out.write("        .sidebar li:hover {\n");
      out.write("            background-color: #333;\n");
      out.write("        }\n");
      out.write("        /* Content section */\n");
      out.write("        .content {\n");
      out.write("            margin-left: 250px; /* Adjust according to sidebar width */\n");
      out.write("            padding: 50px;\n");
      out.write("        }\n");
      out.write("        /* Table styles */\n");
      out.write("        table {\n");
      out.write("            border-collapse: collapse;\n");
      out.write("            width: 100%;\n");
      out.write("            color: #000; /* Adjust text color */\n");
      out.write("        }\n");
      out.write("        th, td {\n");
      out.write("            padding: 10px;\n");
      out.write("            text-align: left;\n");
      out.write("            border-bottom: 1px solid #ddd; /* Add border between rows */\n");
      out.write("        }\n");
      out.write("        th {\n");
      out.write("            background-color: #f2f2f2;\n");
      out.write("        }\n");
      out.write("    \n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("  <body>\n");
      out.write("    <!------HEADER SECTION HEADER SECTION HEADER SECTION ------>\n");
      out.write("<header>\n");
      out.write("    <div class=\"width-100\">\n");
      out.write("      <div class=\"container header\">\n");
      out.write("        <div class=\"width-25\">\n");
      out.write("          <img src=\"img\\mainlogo.png\">\n");
      out.write("        </div>\n");
      out.write("        <div class=\"width-50\">\n");
      out.write("          <ul class=\"header-menu \">\n");
      out.write("            <li>\n");
      out.write("              <a href=\"home.jsp\">Home </a>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("              <a href=\"it.jsp\">Jobs </a>\n");
      out.write("            </li>\n");
      out.write("            \n");
      out.write("            <li class=\"dropdown\"><a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">Services <span class=\"caret\"></span></a>\n");
      out.write("        <ul class=\"dropdown-menu\">\n");
      out.write("          <li><a href=\"course.jsp\">industrial trainings</a></li>\n");
      out.write("          <li><a href=\"it.jsp\">apply for jobs</a></li>\n");
      out.write("        </ul>\n");
      out.write("            <li>\n");
      out.write("              <a href=\"feedback.jsp\">Contact Us </a>\n");
      out.write("            </li>\n");
      out.write("          </ul>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"width-25\">\n");
      out.write("         \n");
      out.write("          \n");
      out.write("                <li><a href=\"profile.jsp\">Welcome, ");
      out.print(user);
      out.write("</a></li>\n");
      out.write("                <li><a href=\"http://localhost:8080/Job_Portal/logout\">Logout</a></li>\n");
      out.write("                \n");
      out.write("          <a href=\"cv.html\" >\n");
      out.write("            <i class=\"fa fa-pencil-square-o\" aria-hidden=\"true\"></i> Create Resume </a>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </header>\n");
      out.write("<div class=\"sidebar\">\n");
      out.write("        <ul>\n");
      out.write("          <li><img src=\"https://imgs.search.brave.com/budZV5WXI8fPMNjtNI4DFAa20HjQkiC6GbvI7H95HYk/rs:fit:500:0:0/g:ce/aHR0cHM6Ly93d3cu/a2luZHBuZy5jb20v/cGljYy9tLzI1Mi0y/NTI0Njk1X2R1bW15/LXByb2ZpbGUtaW1h/Z2UtanBnLWhkLXBu/Zy1kb3dubG9hZC5w/bmc\"></li>\n");
      out.write("            <li>Edit Profile</li>\n");
      out.write("            <li>Change Password</li>\n");
      out.write("            <!-- Add other sidebar options -->\n");
      out.write("        </ul>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- User Details -->\n");
      out.write("    <div class=\"content\">\n");
      out.write("        <h2>User Details</h2>\n");
      out.write("        <table>\n");
      out.write("            <tr>\n");
      out.write("                <th>Field</th>\n");
      out.write("                <th>Details</th>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>First Name</td>\n");
      out.write("                <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.firstname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Middle Name</td>\n");
      out.write("                <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.middlename}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Last Name</td>\n");
      out.write("                <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.lastname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Email</td>\n");
      out.write("                <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Date of Birth</td>\n");
      out.write("                <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.dob}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Address</td>\n");
      out.write("                <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.address}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Aadhar No.</td>\n");
      out.write("                <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.aadharno}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Phone No.</td>\n");
      out.write("                <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.phone}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Alternate Phone No.</td>\n");
      out.write("                <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.alternatephoneno}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Gender</td>\n");
      out.write("                <td>Male</td>\n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("            <!-- Add other rows with user details -->\n");
      out.write("        </table>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
