package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"UTF-8\">\n");
      out.write("  <title>Admin Panel</title>\n");
      out.write("<style>\n");
      out.write("body {\n");
      out.write("  margin: 0;\n");
      out.write("  padding: 0;\n");
      out.write("  font-family: Arial, sans-serif;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".admin-panel {\n");
      out.write("  display: flex;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".sidebar {\n");
      out.write("  width: 250px;\n");
      out.write("  background-color: #000;\n");
      out.write("  color: #fff;\n");
      out.write("  padding: 20px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".sidebar h2 {\n");
      out.write("  margin-bottom: 20px;\n");
      out.write("  text-align: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".sidebar ul {\n");
      out.write("  list-style: none;\n");
      out.write("  padding: 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".sidebar ul li {\n");
      out.write("  margin-bottom: 79px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".sidebar ul li a {\n");
      out.write("  text-decoration: none;\n");
      out.write("  color: #fff;\n");
      out.write("}\n");
      out.write(".banner-section {\n");
      out.write("\tbackground-image: url('https://imgs.search.brave.com/P2FlIlrXxhqDXxvd0fyQx8XHtMWjDiOvCzH7i6PnDhw/rs:fit:500:0:0/g:ce/aHR0cHM6Ly93d3cu/YmFubmVyaGVhbHRo/LmNvbS8tL21lZGlh/L2ltYWdlcy9wcm9q/ZWN0L2JoL2hlcm8t/aW1hZ2VzL2Zvci1l/bXBsb3llZXMvZW1w/bG95ZWVzLWhlcm8u/YXNoeD9oPTQ2MSZ3/PTE5MjAmaGFzaD1D/QTEyQUVBMEU3ODdE/QjY4RTY5MUREOERF/QjMxNjNFMg');\n");
      out.write("\tbackground-repeat: no-repeat;\n");
      out.write("\tbackground-size: cover;\n");
      out.write("\ttext-align: center;\n");
      out.write("\theight: 450px;\n");
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
      out.write("\n");
      out.write(".content {\n");
      out.write("  flex: 1;\n");
      out.write("  padding: 20px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".info-box {\n");
      out.write("  background-color: #f0f0f0;\n");
      out.write("  padding: 20px;\n");
      out.write("  border-radius: 5px;\n");
      out.write("  box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\n");
      out.write("}\n");
      out.write(".info-box h2,p{\n");
      out.write(" text-align:center;\n");
      out.write("}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("  <div class=\"admin-panel\">\n");
      out.write("    <div class=\"sidebar\">\n");
      out.write("      <h2>Dashboard</h2>\n");
      out.write("      <ul>\n");
      out.write("        \n");
      out.write("        <li><a href=\"userdisplayer.jsp\">User Details Table</a></li>\n");
      out.write("         <li><a href=\"applicationdisplayer.jsp\">Application_Details Table</a></li>\n");
      out.write("          <li><a href=\"feedbackdisplayer.jsp\">Feedback Table</a></li>\n");
      out.write("        \t<li><a href=\"itdisplayer.jsp\">IT jobs table</a></li>\n");
      out.write("\t\t<li><a href=\"bpodisplayer.jsp\">BPO jobs table</a></li>\n");
      out.write("\t\t<li><a href=\"salesdisplayer.jsp\">SALES jobs table</a></li>\n");
      out.write("\t\t<li><a href=\"managementdisplayer.jsp\">Management jobs table</a></li>\n");
      out.write("        <!-- Add more sidebar options -->\n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"content\">\n");
      out.write("     <div class=\"content\">\n");
      out.write("      <div class=\"info-box\">\n");
      out.write("        <h2>Welcome, Admin!</h2>\n");
      out.write("        <p>This is the admin panel. Explore the sidebar options for more.</p>\n");
      out.write("      </div>\n");
      out.write("<div class=\"width-100 banner-section\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      \n");
      out.write("      <h1 class=\"banner-heading\">WELCOME TO THE FUTURE OF JOB PORTALS</h1>\n");
      out.write("      \n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("      <div class=\"info-box\">\n");
      out.write("        <h2>To add job in homepage recent section</h2>\n");
      out.write("        <p> <a href =\"addjob1.jsp\">click here</a></p>\n");
      out.write("\t <h2>To Delete job in homepage recent section</h2>\n");
      out.write("        <p> <a href =\"deletejob.jsp\">click here</a></p>\n");
      out.write("      </div>\n");
      out.write("      \n");
      out.write("      <div class=\"content\">\n");
      out.write("      <div class=\"info-box\">\n");
      out.write("        <h2>To add job in IT  section</h2>\n");
      out.write("        <p> <a href =\"addjobit.jsp\">click here</a></p>\n");
      out.write("\t <h2>To Delete job in IT section</h2>\n");
      out.write("        <p> <a href =\"deletejobit.jsp\">click here</a></p>\n");
      out.write("      </div>\n");
      out.write("     <div class=\"content\">\n");
      out.write("      <div class=\"info-box\">\n");
      out.write("        <h2>To add job in BPO section</h2>\n");
      out.write("        <p> <a href =\"addjobbpo.jsp\">click here</a></p>\n");
      out.write("\t <h2>To Delete job in BPO section</h2>\n");
      out.write("        <p> <a href =\"deletejobbpo.jsp\">click here</a></p>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"content\">\n");
      out.write("      <div class=\"info-box\">\n");
      out.write("       <h2>To add job in Sales section</h2>\n");
      out.write("        <p> <a href =\"addjobsales.jsp\">click here</a></p>\n");
      out.write("\t <h2>To Delete job in Sales section</h2>\n");
      out.write("        <p> <a href =\"deletejobsales.jsp\">click here</a></p>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"content\">\n");
      out.write("      <div class=\"info-box\">\n");
      out.write("        <h2>To add job in Management  section</h2>\n");
      out.write("        <p> <a href =\"addjobmanagement.jsp\">click here</a></p>\n");
      out.write("\t <h2>To Delete job in Management  section</h2>\n");
      out.write("        <p> <a href =\"deletemanagement.jsp\">click here</a></p>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</body>\n");
      out.write("</html> ");
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
