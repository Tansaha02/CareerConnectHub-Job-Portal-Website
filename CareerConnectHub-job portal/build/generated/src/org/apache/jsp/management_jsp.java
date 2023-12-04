package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;

public final class management_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("              <a href=\"#\">Home </a>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("              <a href=\"#\">Jobs </a>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("              <a href=\"#width-100 recent-job\">Companies </a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"dropdown\"><a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">Services <span class=\"caret\"></span></a>\n");
      out.write("        <ul class=\"dropdown-menu\">\n");
      out.write("          <li><a href=\"trainings.html\">industrial trainings</a></li>\n");
      out.write("          <li><a href=\"#\">apply for jobs</a></li>\n");
      out.write("        </ul>\n");
      out.write("            <li>\n");
      out.write("              <a href=\"#\">Contact Us </a>\n");
      out.write("            </li>\n");
      out.write("          </ul>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"width-25\">\n");
      out.write("          <a href=\"#\" class=\"button-job-post\">\n");
      out.write("          \n");
      out.write("                <li><a href=\"#\">Welcome, ");
      out.print(user);
      out.write("</a></li>\n");
      out.write("                \n");
      out.write("          <a href=\"cv.html\" class=\"button-resume\">\n");
      out.write("            <i class=\"fa fa-pencil-square-o\" aria-hidden=\"true\"></i> Create Resume </a>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </header>\n");
      out.write("  <!------SEARCH SECTION SEARCH SECTION SEARCH SECTION ------>\n");
      out.write("<div class=\"width-100 banner-section\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <h1 class=\"banner-heading\">Want to make a successful Career in IT industry</h1>\n");
      out.write("      <p class=\"banner-para\">You are Welcome</p>\n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("<div class=\"width-100 skill-section\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <div class=\"skill-list\">\n");
      out.write("        <div class=\"width-33\">\n");
      out.write("          <img class=\"skill-img\" src=\"https://imgs.search.brave.com/6xaGNkbofupg09j657z2O_JLuQalf3zJkhHy14eLUfg/rs:fit:500:0:0/g:ce/aHR0cHM6Ly9sb2dv/LmNvbS9pbWFnZS1j/ZG4vaW1hZ2VzL2t0/czkyOHBkL3Byb2R1/Y3Rpb24vNWYzOGFk/ZjJiMzdkMTM2MmY0/ODFiMDkwZGFjOTM2/N2NjZTQ3NjlhMi0z/NDR4MzQ1LnBuZz93/PTEwODAmcT03Mg\">\n");
      out.write("        </div>\n");
      out.write("        <div class=\"width-66\">\n");
      out.write("            <a href=\"it.jsp\"><h4>It Sector</h4></a>\n");
      out.write("          <button class=\"view-button\">7,600 jobs</button>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"skill-list\">\n");
      out.write("        <div class=\"width-33\">\n");
      out.write("          <img class=\"skill-img\" src=\"https://imgs.search.brave.com/KSUy4IxuOC4AeiJZ1HVuyyVupqMXlSpIiMq33XsS3Hw/rs:fit:500:0:0/g:ce/aHR0cHM6Ly9pbWFn/ZXMtcGxhdGZvcm0u/OTlzdGF0aWMuY29t/Ly8wTTlWTkh3cXpG/VjdTOFhXZERUQVox/QkFDQ0k9LzI0N3g3/NDoxNzU4eDE1ODUv/Zml0LWluLzUwMHg1/MDAvOTlkZXNpZ25z/LWNvbnRlc3RzLWF0/dGFjaG1lbnRzLzEx/Mi8xMTI2MzIvYXR0/YWNobWVudF8xMTI2/MzIxMjE.jpeg\">\n");
      out.write("        </div>\n");
      out.write("        <div class=\"width-66\">\n");
      out.write("            <a href=\"sales.jsp\"> <h4>Sales</h4></a>\n");
      out.write("          <button class=\"view-button\">5,000 jobs</button>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"skill-list\">\n");
      out.write("        <div class=\"width-33\">\n");
      out.write("          <img class=\"skill-img\" src=\"https://imgs.search.brave.com/w-uYdAJg0fPudnnp6wfoVglW_8DJF7fk9KSkLDqIMbg/rs:fit:500:0:0/g:ce/aHR0cHM6Ly9rbm93/bGVkZ2VuZWVkLmNv/bS93cC1jb250ZW50/L3VwbG9hZHMvMjAy/MS8wOC9QaWNzQXJ0/XzA4LTE4LTA3LjM2/LjA1LTMwMHgyMDAu/anBn\">\n");
      out.write("        </div>\n");
      out.write("        <div class=\"width-66\">\n");
      out.write("            <a href=\"bpo.jsp\"><h4>BPO</h4></a>\n");
      out.write("          <button class=\"view-button\">1,100 jobs</button>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"skill-list\">\n");
      out.write("        <div class=\"width-33\">\n");
      out.write("          <img class=\"skill-img\" src=\"https://imgs.search.brave.com/u79sLdq7rx9Ai8_b8ueA8ciGqOTzhOo76YIqP3T_974/rs:fit:500:0:0/g:ce/aHR0cHM6Ly93d3cu/cHJvZHVjdHBsYW4u/Y29tL3VwbG9hZHMv/MjAxOS8xMC9oaXJp/bmctcHJvZHVjdC1t/YW5hZ2Vycy0xMDI0/eDY4My5qcGVn\">\n");
      out.write("        </div>\n");
      out.write("        <div class=\"width-66\">\n");
      out.write("            <a href=\"management.jsp\"><h4>Management</h4></a>\n");
      out.write("          <button class=\"view-button\">2,345 jobs</button>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <!-----RECENT JOB SECTION RECENT JOB SECTION RECENT JOB SECTION ----->\n");
      out.write("<!-----RECENT JOB SECTION RECENT JOB SECTION RECENT JOB SECTION ----->\n");
      out.write("<div class=\"width-100 recent-job\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <h2 class=\"recent-job-heading\">Management jobs</h2>\n");
      out.write("      <p class=\"recent-job-sub-heading\">Get the list of all management-related jobs</p>\n");
      out.write("      <!-----JOB LIST----->\n");
      out.write("      <div class=\"width-50\">\n");
      out.write("        <div class=\"recent-job-list\">\n");
      out.write("          <div class=\"width-100\">\n");
      out.write("            <h4 class=\"job-title\">Operation Manager</h4>\n");
      out.write("            <p class=\"job-company\"> <i class=\"fa fa-star\" aria-hidden=\"true\"></i> | Tata services </p>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"width-33\">\n");
      out.write("            <i class=\"fa fa-briefcase\" aria-hidden=\"true\"></i> 0-2 Years\n");
      out.write("          </div>\n");
      out.write("          <div class=\"width-33\">\n");
      out.write("            <i class=\"fa fa-inr\" aria-hidden=\"true\"></i>12K-20K/monthly\n");
      out.write("          </div>\n");
      out.write("          <div class=\"width-33\">\n");
      out.write("            <i class=\"fa fa-map-marker\" aria-hidden=\"true\"></i> Bangalore\n");
      out.write("          </div>\n");
      out.write("          <div class=\"width-100\">\n");
      out.write("            <p class=\"job-skill\">\n");
      out.write("              <b>Skills : </b>good communication,fluent english,management \n");
      out.write("            </p>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"width-100\">\n");
      out.write("            <a href=\"#\" class=\"job-apply-button\">Apply Now</a>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <!-----JOB LIST------>\n");
      out.write("      <div class=\"width-50\">\n");
      out.write("        <div class=\"recent-job-list\">\n");
      out.write("          <div class=\"width-100\">\n");
      out.write("            <h4 class=\"job-title\">Document Management Supervisor</h4>\n");
      out.write("            <p class=\"job-company\"><i class=\"fa fa-star\" aria-hidden=\"true\"></i> |CareerConnectHub Group  </p>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"width-33\">\n");
      out.write("            <i class=\"fa fa-briefcase\" aria-hidden=\"true\"></i>1-5 Years\n");
      out.write("          </div>\n");
      out.write("          <div class=\"width-33\">\n");
      out.write("            <i class=\"fa fa-inr\" aria-hidden=\"true\"></i>4k-6k/monthly\n");
      out.write("          </div>\n");
      out.write("          <div class=\"width-33\">\n");
      out.write("            <i class=\"fa fa-map-marker\" aria-hidden=\"true\"></i>kolkata\n");
      out.write("          </div>\n");
      out.write("          <div class=\"width-100\">\n");
      out.write("            <p class=\"job-skill\">\n");
      out.write("              <b>Skills : </b> Data entry,project management,good communication\n");
      out.write("            </p>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"width-100\">\n");
      out.write("            <a href=\"#\" class=\"job-apply-button\">Apply Now</a>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <!-----JOB LIST----->\n");
      out.write("      <div class=\"width-50\">\n");
      out.write("        <div class=\"recent-job-list\">\n");
      out.write("          <div class=\"width-100\">\n");
      out.write("            <h4 class=\"job-title\">Operation Manager</h4>\n");
      out.write("            <p class=\"job-company\"> <i class=\"fa fa-star\" aria-hidden=\"true\"></i> | Tata services </p>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"width-33\">\n");
      out.write("            <i class=\"fa fa-briefcase\" aria-hidden=\"true\"></i> 0-2 Years\n");
      out.write("          </div>\n");
      out.write("          <div class=\"width-33\">\n");
      out.write("            <i class=\"fa fa-inr\" aria-hidden=\"true\"></i>12K-20K/monthly\n");
      out.write("          </div>\n");
      out.write("          <div class=\"width-33\">\n");
      out.write("            <i class=\"fa fa-map-marker\" aria-hidden=\"true\"></i> Bangalore\n");
      out.write("          </div>\n");
      out.write("          <div class=\"width-100\">\n");
      out.write("            <p class=\"job-skill\">\n");
      out.write("              <b>Skills : </b>good communication,fluent english,management \n");
      out.write("            </p>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"width-100\">\n");
      out.write("            <a href=\"#\" class=\"job-apply-button\">Apply Now</a>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      <!-----JOB LIST----->\n");
      out.write("     \n");
      out.write("        </div>\n");
      out.write("          </div>\n");
      out.write("      </div>\n");
      out.write("    <div class=\"width-50\">\n");
      out.write("        <div class=\"recent-job-list\">\n");
      out.write("          <div class=\"width-100\">\n");
      out.write("        ");
 
            try {
                Class.forName("oracle.jdbc.driver.OracleDriver");
                Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "jbweb", "tjas");

                String sql = "SELECT * FROM managementjob_table";
                PreparedStatement pstmt = conn.prepareStatement(sql);
                ResultSet rs = pstmt.executeQuery();

                while (rs.next()) {
        
      out.write("\n");
      out.write("            <h4 class=\"job-title\">");
      out.print(rs.getString("job_title"));
      out.write("</h4>\n");
      out.write("            <p class=\"job-company\">");
      out.print(rs.getString("company"));
      out.write(" <i class=\"fa fa-star\" aria-hidden=\"true\"></i> | 234 Reviews </p>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"width-33\">\n");
      out.write("            <i class=\"fa fa-briefcase\" aria-hidden=\"true\"></i>");
      out.print(rs.getString("experience"));
      out.write("\n");
      out.write("          </div>\n");
      out.write("          <div class=\"width-33\">\n");
      out.write("            <i class=\"fa fa-inr\" aria-hidden=\"true\"></i>");
      out.print(rs.getString("salary"));
      out.write("\n");
      out.write("          </div>\n");
      out.write("          <div class=\"width-33\">\n");
      out.write("            <i class=\"fa fa-map-marker\" aria-hidden=\"true\"></i>");
      out.print(rs.getString("location"));
      out.write("\n");
      out.write("          </div>\n");
      out.write("          <div class=\"width-100\">\n");
      out.write("            <p class=\"job-skill\">\n");
      out.write("              <b>Skills : </b>");
      out.print(rs.getString("skills"));
      out.write("\n");
      out.write("            </p>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"width-100\">\n");
      out.write("            <a href=\"apply.jsp\" class=\"job-apply-button\">Apply Now</a>\n");
      out.write("          \n");
      out.write("        ");
 
                }
                rs.close();
                pstmt.close();
                conn.close();
            } catch (Exception e) {
                e.printStackTrace();
                // Handle errors
            }
        
      out.write("\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("              \n");
      out.write("<footer>\n");
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
