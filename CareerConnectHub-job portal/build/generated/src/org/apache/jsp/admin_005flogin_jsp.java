package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_005flogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<style>\n");
      out.write("\n");
      out.write("       \n");
      out.write("    .login-container {\n");
      out.write("        background-color: #fff;\n");
      out.write("        padding: 20px;\n");
      out.write("        border-radius: 8px;\n");
      out.write("        width: 372px;\n");
      out.write("        text-align: center;\n");
      out.write("        margin: auto;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    h2 {\n");
      out.write("        color: #333;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    form {\n");
      out.write("        align-content: center;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .checkbox {\n");
      out.write("        margin-bottom: 15px;\n");
      out.write("        text-align: left;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .checkbox label {\n");
      out.write("        display: block;\n");
      out.write("        margin-top: 10px; /* Adjusted margin for better spacing */\n");
      out.write("        color: #555;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .input-group {\n");
      out.write("        margin-bottom: 15px;\n");
      out.write("        text-align: left;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    label {\n");
      out.write("        display: block;\n");
      out.write("        margin-bottom: 5px;\n");
      out.write("        color: #555;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    input {\n");
      out.write("        width: 100%;\n");
      out.write("        padding: 9px 74px;\n");
      out.write("        box-sizing: border-box;\n");
      out.write("        border: 1px solid #ccc;\n");
      out.write("        border-radius: 4px;\n");
      out.write("        font-size: 14px;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    button {\n");
      out.write("        padding: 10px 15px;\n");
      out.write("        margin-right: 10px;\n");
      out.write("        border: none;\n");
      out.write("        border-radius: 4px;\n");
      out.write("        cursor: pointer;\n");
      out.write("        font-size: 14px;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .btn-login {\n");
      out.write("        background-color: black;\n");
      out.write("        color: #fff;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .btn-reset {\n");
      out.write("        background-color: black;\n");
      out.write("        color: #fff;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .btn-close {\n");
      out.write("        background-color: black;\n");
      out.write("        color: #fff;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .options {\n");
      out.write("        margin-top: 15px;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .option-link {\n");
      out.write("        color: #3498db;\n");
      out.write("        text-decoration: none;\n");
      out.write("        margin-right: 15px;\n");
      out.write("    }\n");
      out.write("</style>\n");
      out.write("\n");
      out.write(" \n");
      out.write("</style>\n");
      out.write("\n");
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
      out.write("  </header>\n");
      out.write("    <body>\n");
      out.write("    <div class=\"login-container\">\n");
      out.write("        <h2>Admin Login</h2>\n");
      out.write("        <form action=\"http://localhost:8080/Job_Portal/admin_login\" method=\"post\">\n");
      out.write("            <div class=\"input-group\">\n");
      out.write("                <label for=\"email\">Enter Username</label>\n");
      out.write("                <input type=\"text\" id=\"username\" name=\"username\" required>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"input-group\">\n");
      out.write("                <label for=\"password\">Password</label>\n");
      out.write("                <input type=\"password\" id=\"password\" name=\"password\" required>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("           \n");
      out.write("\n");
      out.write("            \n");
      out.write("\n");
      out.write("            <button type=\"submit\" class=\"btn btn-login\">Login</button>\n");
      out.write("            \n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("       \n");
      out.write("    </div>\n");
      out.write("      <footer>\n");
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
      out.write("            <a href=\"admin_login.jsp\"<h4>Admin Login</h4>\n");
      out.write("          <ul class=\"footer-list\">\n");
      out.write("            \n");
      out.write("            <a href=\"user_login.jsp\"><li>USER LOGIN</li></a>\n");
      out.write("            <a href=\"reg.jsp\"><li>USER REGISTRATION</li>\n");
      out.write("            <a href=\"terms.jsp\"><li>TERMS & CONDITIONS</li>\n");
      out.write("          </ul>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"width-25\">\n");
      out.write("          <h4>RESOURCES</h4>\n");
      out.write("          <ul class=\"footer-list\">\n");
      out.write("            <a href=\"home.jsp\"><li>Home</li></a>\n");
      out.write("            <a href=\"it.jsp\"><li>Jobs</li></a>\n");
      out.write("            \n");
      out.write("            <a href=\"aboutus.jsp\"><li>About us</li></a>\n");
      out.write("       \t    <a href=\"feedback.jsp\"><li>Any Complain?complain here</li></a>\n");
      out.write("          </ul>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"width-25\">\n");
      out.write("          <h4>GET IN TOUCH</h4>\n");
      out.write("          <ul class=\"get-in-touch\">\n");
      out.write("            <li>\n");
      out.write("              <i class=\"fa fa-envelope-o\" aria-hidden=\"true\"></i>\n");
      out.write("              <p>E-MAIL: info.careerconnecthub2023@gmail.com</p>\n");
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
      out.write("              <img src=\"https://imgs.search.brave.com/0onedxgdJWLsAOrzVTbco23TxXLuDJGb_uBUL74bc7k/rs:fit:500:0:0/g:ce/aHR0cHM6Ly91cGxv/YWQud2lraW1lZGlh/Lm9yZy93aWtpcGVk/aWEvY29tbW9ucy9j/L2NhL0xpbmtlZElu/X2xvZ29faW5pdGlh/bHMucG5n\">\n");
      out.write("            </li>\n");
      out.write("          </ul>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </footer>\n");
      out.write("  <!------FOOTER SECTION FOOTER SECTI");
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
