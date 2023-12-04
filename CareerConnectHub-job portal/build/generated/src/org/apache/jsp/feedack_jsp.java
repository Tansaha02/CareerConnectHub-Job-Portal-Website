package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;

public final class feedack_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write(" <html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("   <title>Search Job</title>\n");
      out.write("   <meta charset=\"utf-8\">\n");
      out.write("   <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("   <link rel=\"stylesheet\" href=\"index1.css\">\n");
      out.write("   <meta name=\"robots\" content=\"noindex, nofollow\">\n");
      out.write("   <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("   <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\n");
      out.write("  <body>\n");
      out.write("    <!------HEADER SECTION HEADER SECTION HEADER SECTION ------>\n");
      out.write("<header>\n");
      out.write("    <div class=\"width-100\">\n");
      out.write("      <div class=\"container header\">\n");
      out.write("        <div class=\"width-25\">\n");
      out.write("          <img src=\"mainlogo.jpg\">\n");
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
      out.write("          <li><a href=\"bpo.jsp\">apply for jobs</a></li>\n");
      out.write("        </ul>\n");
      out.write("            <li>\n");
      out.write("              <a href=\"feedback.jsp\">Contact Us </a>\n");
      out.write("            </li>\n");
      out.write("          </ul>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"width-25\">\n");
      out.write("         \n");
      out.write("          \n");
      out.write("                <li><a href=\"http://localhost:8080/Job_Portal/user_profile\">Welcome, ");
      out.print(user);
      out.write("</a></li>\n");
      out.write("                <li><a href=\"http://localhost:8080/Job_Portal/logout\">Logout</a></li>\n");
      out.write("                \n");
      out.write("          <a href=\"cv.html\" >\n");
      out.write("            <i class=\"fa fa-pencil-square-o\" aria-hidden=\"true\"></i> Create Resume </a>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </header>");
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
