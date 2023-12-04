package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class aboutus_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("   <link rel=\"stylesheet\" href=\"index.css\">\n");
      out.write("   <meta name=\"robots\" content=\"noindex, nofollow\">\n");
      out.write("   <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("   <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\n");
      out.write("  <style>\n");
      out.write("      .vision {\n");
      out.write("    /* Styles for the vision div */\n");
      out.write("    padding: 20px;\n");
      out.write("    border-radius: 8px;\n");
      out.write("    margin-top: 20px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".vision h2 {\n");
      out.write("    /* Styles for the heading within the vision div */\n");
      out.write("    color: #333;\n");
      out.write("    font-size: 24px;\n");
      out.write("    margin-bottom: 10px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".vision p {\n");
      out.write("    /* Styles for the paragraph within the vision div */\n");
      out.write("    color: #666;\n");
      out.write("    font-size: 16px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/*****BANNER SECTION*****/\n");
      out.write(".banner-section {\n");
      out.write("\tbackground-image: url('img/download.png');\n");
      out.write("\tbackground-repeat: no-repeat;\n");
      out.write("\tbackground-size: cover;\n");
      out.write("\ttext-align: center;\n");
      out.write("\theight: 620px;\n");
      out.write("\tposition: relative;\n");
      out.write("\twidth: 100%;\n");
      out.write("}\n");
      out.write(".banner-heading {\n");
      out.write("\tfont-size: 40px;\n");
      out.write("\tcolor: white;\n");
      out.write("\tpadding-top: 70px\n");
      out.write("}\n");
      out.write(".banner-para {\n");
      out.write("\tfont-size: 15px;\n");
      out.write("\tcolor: #fff;\n");
      out.write("\tpadding-top: 10px;\n");
      out.write("}\n");
      out.write(".team-member-card {\n");
      out.write("    display: flex;\n");
      out.write("    flex-direction: column;\n");
      out.write("    align-items: center;\n");
      out.write("    background-color: #ffffff;\n");
      out.write("    border-radius: 196px;\n");
      out.write("    padding: 34px;\n");
      out.write("    margin-bottom: 34px;\n");
      out.write("    box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1)\n");
      out.write("}\n");
      out.write("\n");
      out.write(".team-member-card img {\n");
      out.write("    width: 150px;\n");
      out.write("    height: 150px;\n");
      out.write("    border-radius: 50%;\n");
      out.write("    object-fit: cover;\n");
      out.write("    margin-bottom: 10px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".team-member-card h3 {\n");
      out.write("    margin: 0;\n");
      out.write("    font-size: 24px;\n");
      out.write("    font-weight: bold;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".team-member-card p {\n");
      out.write("    margin: 0;\n");
      out.write("    font-size: 16px;\n");
      out.write("    line-height: 1.5;\n");
      out.write("}\n");
      out.write("box{\n");
      out.write("    width: 40px;\n");
      out.write("}\n");
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
      out.write("           \n");
      out.write("            <li class=\"dropdown\"><a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">Services <span class=\"caret\"></span></a>\n");
      out.write("        <ul class=\"dropdown-menu\">\n");
      out.write("          <li><a href=\"course.jsp\">industrial trainings</a></li>\n");
      out.write("          <li><a href=\"it.jsp\">apply for jobs</a></li>\n");
      out.write("        </ul>\n");
      out.write("            <li>\n");
      out.write("              <a href=\"#\">Contact Us </a>\n");
      out.write("            </li>\n");
      out.write("          </ul>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"width-25\">\n");
      out.write("          <li><a href=\"http://localhost:8080/Job_Portal/user_profile\">Welcome, ");
      out.print( user );
      out.write("</a></li>\n");
      out.write("                <li><a href=\"http://localhost:8080/Job_Portal/logout\">Logout</a></li>\n");
      out.write("                \n");
      out.write("          <a href=\"resume.jsp\">\n");
      out.write("            <i class=\"fa fa-pencil-square-o\" aria-hidden=\"true\"></i> Create Resume </a>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </header>\n");
      out.write("                <div class=\"width-100 banner-section\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <h1 class=\"banner-heading\" style=\"font-family: 'Gill Sans', 'Gill Sans MT', Calibri, 'Trebuchet MS', sans-serif;\">Unveiling Innovation, Collaboration, and Excellence</h1>\n");
      out.write("      <p class=\"banner-para\" style=\"align:right;font-family: 'Gill Sans', 'Gill Sans MT', Calibri, 'Trebuchet MS', sans-serif\">– Join Us in Crafting Tomorrow's Solutions.</p>\n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("<div id=box>\n");
      out.write("<section class=\"about-us\">\n");
      out.write("    <div class=\"vision\">\n");
      out.write("        <h2 style=\"text-align:center\">Our Vision</h2>\n");
      out.write("        <p style=\"text-align:center\">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus aliquam ligula eu elit feugiat, vitae suscipit justo tincidunt.</p>\n");
      out.write("    </div>\n");
      out.write("</section>\n");
      out.write("</div>\n");
      out.write("  <div id=box>\n");
      out.write("  <div class=\"team-member-card\">\n");
      out.write("    <img src=\"img/Tanmoy.jpeg\" alt=\"Tanmoy's Photo\">\n");
      out.write("    <h3>Tanmoy Saha</h3>\n");
      out.write("    <p> An exceptional tech whiz weaving the project's foundation with skillful precision</p><p> adding innovation and expertise to every line of code</p><p> defining the project's tech brilliance.</p>\n");
      out.write("    \n");
      out.write("\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("  <div=box>\n");
      out.write("  <div class=\"team-member-card\">\n");
      out.write("    <img src=\"img/jyoti.jfif\" alt=\"jyoti's Photo\">\n");
      out.write("    <h3>Jyoti Dhara</h3>\n");
      out.write("    <p> The creative visionary behind our project seamlessly blends eloquent words with captivating designs</p><p> orchestrating impactful narratives that breathe life into every page of our project's story.</p>\n");
      out.write("    \n");
      out.write("\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("<div id=box>\n");
      out.write("  <div class=\"team-member-card\">\n");
      out.write("    <img src=\"img/Subham.jpg\" alt=\"Subham's Photo\">\n");
      out.write("    <h3>Subham Raj</h3>\n");
      out.write("    <p>An ingenious leader spearheading the project's vision</p><p> infusing it with a trailblazing array of innovative concepts</p><p>steering the team toward boundless success</p>\n");
      out.write("    \n");
      out.write("\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("                <footer>\n");
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
