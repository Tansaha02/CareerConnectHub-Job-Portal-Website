package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;

public final class feedback_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("  <style>\n");
      out.write("      .contain {\n");
      out.write("    width: 80%;\n");
      out.write("    margin: 20px auto;\n");
      out.write("    padding: 20px;\n");
      out.write("    background-color: #fff;\n");
      out.write("    box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\n");
      out.write("}\n");
      out.write("\n");
      out.write("h1 {\n");
      out.write("    text-align: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write("label {\n");
      out.write("    display: block;\n");
      out.write("    margin-bottom: 5px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=\"text\"],\n");
      out.write("input[type=\"email\"],\n");
      out.write("select,\n");
      out.write("textarea {\n");
      out.write("    width: 100%;\n");
      out.write("    padding: 8px;\n");
      out.write("    margin-bottom: 15px;\n");
      out.write("    border: 1px solid #ccc;\n");
      out.write("    border-radius: 4px;\n");
      out.write("    box-sizing: border-box;\n");
      out.write("}\n");
      out.write("\n");
      out.write("textarea {\n");
      out.write("    resize: vertical;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=\"submit\"] {\n");
      out.write("    background-color: black;\n");
      out.write("    color: white;\n");
      out.write("    padding: 10px 20px;\n");
      out.write("    border: none;\n");
      out.write("    border-radius: 4px;\n");
      out.write("    cursor: pointer;\n");
      out.write("    transition: background-color 0.3s;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".contact-info {\n");
      out.write("    background-color: #fff;\n");
      out.write("    padding: 20px;\n");
      out.write("    border-radius: 5px;\n");
      out.write("    box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".contact-info h2 {\n");
      out.write("    font-size: 24px;\n");
      out.write("    margin-bottom: 15px;\n");
      out.write("    text-align: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".contact-info p {\n");
      out.write("    margin-bottom: 8px;\n");
      out.write("    text-align: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".contact-info strong {\n");
      out.write("    font-weight: bold;\n");
      out.write("    margin-right: 5px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("  </style>\n");
      out.write("  <body>\n");
      out.write("    <!------HEADER SECTION HEADER SECTION HEADER SECTION ------>\n");
      out.write("<header>\n");
      out.write("    <div class=\"width-100\">\n");
      out.write("      <div class=\"container header\">\n");
      out.write("        <div class=\"width-25\">\n");
      out.write("          <img src=\"img/mainlogo.png\">\n");
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
      out.write("          <a href=\"resume.jsp\" >\n");
      out.write("            <i class=\"fa fa-pencil-square-o\" aria-hidden=\"true\"></i> Create Resume </a>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </header>\n");
      out.write("                <body>\n");
      out.write("    < <div class=\"contain\">\n");
      out.write("        <h1>Feedback Us</h1>\n");
      out.write("        <form action=\"http://localhost:8080/Job_Portal/feedback\" method=\"post\">\n");
      out.write("            <label for=\"name\">Name:</label>\n");
      out.write("            <input type=\"text\" id=\"name\" name=\"name\" required>\n");
      out.write("\n");
      out.write("            <label for=\"email\">Email:</label>\n");
      out.write("            <input type=\"email\" id=\"email\" name=\"email\" required>\n");
      out.write("\n");
      out.write("          \n");
      out.write("            <label for=\"feedback\">Your Feedback:</label>\n");
      out.write("            <textarea id=\"feedback\" name=\"feedback\" rows=\"4\" required></textarea>\n");
      out.write("\n");
      out.write("            <input type=\"submit\" value=\"Submit\">\n");
      out.write("        </form>\n");
      out.write("            </div>\n");
      out.write("    <div class=\"contact-info\">\n");
      out.write("    <h2>Contact Information</h2>\n");
      out.write("    <p><strong>Email:</strong> info.careerconnecthub2023@gmail.com</p>\n");
      out.write("    <p><strong>Phone:</strong> +(033)09876534123</p>\n");
      out.write("    <p><strong>Address:</strong> 24,College road,EM 4,saltlake,Kolkata-700053</p>\n");
      out.write("</div>\n");
      out.write("    <footer>\n");
      out.write("    <div class=\"width-100 footer-background\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"width-25\">\n");
      out.write("          <h4>SiteMap</h4>\n");
      out.write("          <ul class=\"footer-list\">\n");
      out.write("            <a href=\"it.jsp\"><li>IT JOBS</li>\n");
      out.write("            <a href=\"bpo.jsp\"><li>BPO JOBS</li>\n");
      out.write("            <a href=\"sales.jsp\"><li>SALES JOB</li>\n");
      out.write("            <a href=\"management.jsp\"><li>MANAGEMENT JOB</li>\n");
      out.write("          </ul>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"width-25\">\n");
      out.write("          <h4>Admin Login</h4>\n");
      out.write("          <ul class=\"footer-list\">\n");
      out.write("            \n");
      out.write("            <a href=\"user_login.jsp\"><li>USER LOGIN</li></a>\n");
      out.write("            <a href=\"reg.jsp\"><li>USER REGISTRATION</li>\n");
      out.write("            <a href=\"T&C.jsp\"><li>TERMS & CONDITIONS</li>\n");
      out.write("          </ul>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"width-25\">\n");
      out.write("          <h4>RESOURCES</h4>\n");
      out.write("          <ul class=\"footer-list\">\n");
      out.write("            <a href=\"home.jsp\"><li>Home</li></a>\n");
      out.write("            <a href=\"it.jsp\"><li>Jobs</li></a>\n");
      out.write("            <a href=\"\"><li>Companies</li></a>\n");
      out.write("            <a href=\"aboutus.jsp\"><li>About us</li></a>\n");
      out.write("       \t    <a href=\"contactus.jsp\"><li>Any Complain?complain here</li></a>\n");
      out.write("          </ul>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"width-25\">\n");
      out.write("          <h4>GET IN TOUCH</h4>\n");
      out.write("          <ul class=\"get-in-touch\">\n");
      out.write("            <li>\n");
      out.write("              <i class=\"fa fa-envelope-o\" aria-hidden=\"true\"></i>\n");
      out.write("              <p>E-MAIL: info.careerconnecthub.com</p>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("              <i class=\"fa fa-headphones\" aria-hidden=\"true\"></i>\n");
      out.write("              <p>WHATS-APP: +916287074180</p>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("              <i class=\"fa fa-fax\" aria-hidden=\"true\"></i>\n");
      out.write("              <p>CONTACT NO.: +91 -(123)-4567890</p>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("              <i class=\"fa fa-globe\" aria-hidden=\"true\"></i>\n");
      out.write("              <p>WEBSITE: https://www.CareerConnectHub.com</p>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("              <img src=\"https://imgs.search.brave.com/pHNxVXruRk9h42oa1iA12pSEXJzg0zlhLZ2ijck5ses/rs:fit:500:0:0/g:ce/aHR0cHM6Ly90NC5m/dGNkbi5uZXQvanBn/LzAzLzAwLzI0LzU5/LzM2MF9GXzMwMDI0/NTk1M19TdmloMURZ/SmJ3NHYydDkyRWhE/T1R3VzRMSXFNZ2ht/eS5qcGc\">\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("              <img src=\"https://imgs.search.brave.com/cdA4EESxZIip_Z_PMhaUfpfHygnsRUBcrBY_AOR_yMw/rs:fit:500:0:0/g:ce/aHR0cHM6Ly93d3cu/ZWRpZ2l0YWxhZ2Vu/Y3kuY29tLmF1L3dw/LWNvbnRlbnQvdXBs/b2Fkcy9pbnN0YWdy/YW0tbG9nby1hY3J5/bGljLXNwbGFzaC5q/cGVn\">\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("              <img src=\"https://imgs.search.brave.com/BfF-6PmzEYBuyW-kbGpeyqtmSx37AF34-H0gLfLXHHA/rs:fit:500:0:0/g:ce/aHR0cHM6Ly90My5m/dGNkbi5uZXQvanBn/LzAzLzk3LzIyLzcw/LzM2MF9GXzM5NzIy/NzA4N19RYVlKQW1M/RU5UNms5VVFkdWV4/REhXaGxoNmRsMlhX/SS5qcGc\">\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("              <img src=\"C:\\Users\\Hp\\Desktop\\project techno\\img\\circle-linkedin-512.webp\">\n");
      out.write("            </li>\n");
      out.write("          </ul>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </footer>\n");
      out.write("  <!------FOOTER SECTION FOOTER SECTION FOOTER SECTION ------>");
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
