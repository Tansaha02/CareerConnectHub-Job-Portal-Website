package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class reg_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<style>\n");
      out.write(" \n");
      out.write("\n");
      out.write("   input[type=text], input[type=password],  textarea {\n");
      out.write("      width: calc(100% - 20px); /* Adjusted width */\n");
      out.write("      padding: 8px; /* Adjusted padding */\n");
      out.write("      margin: 5px 0 8px 0;\n");
      out.write("      border: 1px solid black;\n");
      out.write("      box-sizing: border-box;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    input[type=text]:focus, input[type=password]:focus {\n");
      out.write("      background-color: #f9d5b5;\n");
      out.write("      outline: none;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    hr {\n");
      out.write("      border: 1px solid #f1f1f1;\n");
      out.write("      margin-bottom: 15px; /* Adjusted margin */\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .registerbtn {\n");
      out.write("\tbackground-color: black;\n");
      out.write("      color: white;\n");
      out.write("      padding: 12px 15px; /* Adjusted padding */\n");
      out.write("      margin: 8px 0;\n");
      out.write("      border: none;\n");
      out.write("      cursor: pointer;\n");
      out.write("      width: 100%;\n");
      out.write("      opacity: 0.9;\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("\n");
      out.write("</style>\n");
      out.write("  \n");
      out.write("</head>\n");
      out.write("  <body>\n");
      out.write("    <!------HEADER SECTION HEADER SECTION HEADER SECTION ------>\n");
      out.write("<header>\n");
      out.write("    <div class=\"width-100\">\n");
      out.write("      <div class=\"container header\">\n");
      out.write("        <div class=\"width-25\">\n");
      out.write("          <img src=\"img/mainlogo.png\">\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write(" \n");
      out.write("<div class=\"container\">\n");
      out.write("  <form action=\"http://localhost:8080/Job_Portal/reg\" method=\"post\" >\n");
      out.write("    \n");
      out.write("      <center><h1>SIGN UP</h1></center>\n");
      out.write("      <hr>\n");
      out.write("      <label>Firstname:</label>\n");
      out.write("      <input type=\"text\" name=\"firstname\" placeholder=\"Firstname\" required />\n");
      out.write("      <label>Middlename:</label>\n");
      out.write("      <input type=\"text\" name=\"middlename\" placeholder=\"Middlename\" required />\n");
      out.write("      <label>Lastname:</label>\n");
      out.write("      <input type=\"text\" name=\"lastname\" placeholder=\"Lastname\" required />\n");
      out.write("\n");
      out.write("      <label>Email</label>\n");
      out.write("      <input type=\"text\" name=\"email\" placeholder=\"youremail@gmail.com\" required />\n");
      out.write("      <label>Password</label>\n");
      out.write("      <input type=\"text\" name=\"password\" placeholder=\"password\" required />\n");
      out.write("      <label>Confirm Password</label>\n");
      out.write("      <input type=\"text\" name=\"password\" placeholder=\"re-type_password\" required />\n");
      out.write("\n");
      out.write("      <div>\n");
      out.write("        <label>Date of Birth:</label>\n");
      out.write("        <input type=\"date\" id=\"dob\" name=\"dob\" required />\n");
      out.write("      </div>\n");
      out.write("      \n");
      out.write("      <div>\n");
      out.write("        <label>Gender:</label><br>\n");
      out.write("        <input type=\"radio\" value=\"Male\" name=\"gender\" checked> Male\n");
      out.write("        <input type=\"radio\" value=\"Female\" name=\"gender\"> Female\n");
      out.write("        <input type=\"radio\" value=\"Other\" name=\"gender\"> Other\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <label>Phone:</label>\n");
      out.write("      <input type=\"text\" name=\"phoneno\" placeholder=\"phone no\" value=\"+91\" />\n");
      out.write("\n");
      out.write("      <div>\n");
      out.write("        <label>Alternate Phone no.:</label>\n");
      out.write("        <input type=\"text\" name=\"alternatephoneno\" placeholder=\"phone no\" value=\"+91\" />\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div>\n");
      out.write("        <label>Aadhar CARD NO.:</label>\n");
      out.write("        <input type=\"text\" name=\"aadharno\" placeholder=\"0000 0000 0000 0000\" pattern=\"[0-9]{16}\" required />\n");
      out.write("      </div>\n");
      out.write("      \n");
      out.write("\n");
      out.write("      <label>Current Address:</label>\n");
      out.write("      <textarea cols=\"30\" rows=\"5\" name=\"address\" placeholder=\"Current Address\"  required></textarea>\n");
      out.write("      \n");
      out.write("      <div>\n");
      out.write("        <label>Profile picture:</label>\n");
      out.write("        <input type=\"file\" name=\"profilepic\" required />\n");
      out.write("      </div>\n");
      out.write("      <div class=\"checkbox\">\n");
      out.write("                <label>\n");
      out.write("                    <input type=\"checkbox\" name=\"terms\" required> I agree to the <a href=\"terms.jsp\">Terms and Conditions</a>\n");
      out.write("                </label>\n");
      out.write("            </div>\n");
      out.write("      <button type=\"submit\" id=\"submit\" class=\"registerbtn\">Register</button>\n");
      out.write("   \n");
      out.write("  </form>\n");
      out.write("     </div>\n");
      out.write("</header>\n");
      out.write("<footer>\n");
      out.write("    <div class=\"width-100 footer-background\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"width-25\">\n");
      out.write("          <h4>SiteMap</h4>\n");
      out.write("          <ul class=\"footer-list\">\n");
      out.write("            <li>IT JOBS</li>\n");
      out.write("            <li>BPO JOBS</li>\n");
      out.write("            <li>SALES JOB</li>\n");
      out.write("            <li>MANAGEMENT JOB</li>\n");
      out.write("          </ul>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"width-25\">\n");
      out.write("          <h4></h4>\n");
      out.write("          <ul class=\"footer-list\">\n");
      out.write("            <li>Admin Login</li>\n");
      out.write("            <li>USER LOGIN</li>\n");
      out.write("            <li>USER REGISTRATION</li>\n");
      out.write("            <li>TERMS & CONDITIONS</li>\n");
      out.write("          </ul>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"width-25\">\n");
      out.write("          <h4>RESOURCES</h4>\n");
      out.write("          <ul class=\"footer-list\">\n");
      out.write("            <a href=\"\"><li>Home</li></a>\n");
      out.write("            <a href=\"\"><li>Jobs</li></a>\n");
      out.write("            <a href=\"\"><li>Companies</li></a>\n");
      out.write("            <a href=\"\"><li>Contact us</li></a>\n");
      out.write("       \t    <a href=\"\"><li>Any Complain?complain here</li></a>\n");
      out.write("          </ul>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"width-25\">\n");
      out.write("          <h4>GET IN TOUCH</h4>\n");
      out.write("          <ul class=\"get-in-touch\">\n");
      out.write("            <li>\n");
      out.write("              <i class=\"fa fa-envelope-o\" aria-hidden=\"true\"></i>\n");
      out.write("              <p>E-MAIL: info@CareerConnectHub.com</p>\n");
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
      out.write("  <!------FOOTER SECTION FOOTER SECTION FOOTER SECTION ------>\n");
      out.write("\n");
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
