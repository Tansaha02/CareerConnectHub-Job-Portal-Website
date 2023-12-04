package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class course_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link rel=\"stylesheet\" href=\"course.css\">\n");
      out.write("        <script src=\"https://kit.fontawesome.com/92d70a2fd8.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"header\">\n");
      out.write("            <p class=\"logo\" style=\"width:70%\">\n");
      out.write("          <img src=\"img\\mainlogo.png\">\n");
      out.write("        </p>\n");
      out.write("        <a href=\"home.jsp\"> <p style=\"color:black\" >Home</p></a>\n");
      out.write("\t\t <p style=\"color:black\">Jobs</p>\n");
      out.write("                 <a href=\"feedback.jsp\"> <p style=\"color:black\">Contact us</p></a>\n");
      out.write("                         <div class=\"dropdown\">\n");
      out.write("    <button class=\"dropbtn\"  style=\"color:black\">Services\n");
      out.write("      <i class=\"fa fa-caret-down\"></i>\n");
      out.write("    </button>\n");
      out.write("    <div class=\"dropdown-content\">\n");
      out.write("      <a href=\"it.jsp\">apply for jobs</a>\n");
      out.write("      <a href=\"course.jsp\">trainings</a>\n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("                        \n");
      out.write("            \n");
      out.write("\t\t\t\n");
      out.write("                         <p> <a href=\"http://localhost:8080/Job_Portal/user_profile\"> Welcome");
      out.print(user);
      out.write("</a></p><br>\n");
      out.write("                        <p>        </p>\n");
      out.write("                                    <p><a href=\"http://localhost:8080/Job_Portal/logout\">Logout</a></p>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("<div class=\"width-100 banner-section\">\n");
      out.write("    <div class=\"heading\">\n");
      out.write("      <h1 class=\"banner-heading\" style=\"align:center\">Discover, Learn, Succeed: Find Your Perfect Course Here!</h1>\n");
      out.write("      <p class=\"banner-para\" style=\"align:center\">Master New Skills: Choose from Hundreds of Expert-Led Courses</p>\n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("  \n");
      out.write("  </div>\n");
      out.write("<div class=heading>\n");
      out.write("<h1 style=\"text-align:center\">Courses</h1>\n");
      out.write("</div>\n");
      out.write("        <div class=\"container\">\n");
      out.write("             \n");
      out.write("            <div id=\"root\"></div>\n");
      out.write("            <div class=\"sidebar\">\n");
      out.write("                <div class=\"head\" style=\"color:black\"><p>My Cart</p><div class=\"cart\"><i class=\"fa-solid fa-cart-shopping\"></i><p id=\"count\">0</p></div></div>\n");
      out.write("                <div id=\"cartItem\">Your cart is empty</div>\n");
      out.write("                <div class=\"foot\">\n");
      out.write("                    <h3>Total</h3>\n");
      out.write("                    <h2 id=\"total\"> 0.00</h2>\n");
      out.write("                   <button id=\"rzp-button1\">Pay</button>\n");
      out.write("<script src=\"https://checkout.razorpay.com/v1/checkout.js\"></script>\n");
      out.write("<script>\n");
      out.write("var options = {\n");
      out.write("    \"key\": \"rzp_test_HNVfGiRgUfDmZk\", // Enter the Key ID generated from the Dashboard\n");
      out.write("    \"amount\": \"5000000\", // Amount is in currency subunits. Default currency is INR. Hence, 50000 refers to 50000 paise\n");
      out.write("    \"currency\": \"INR\",\n");
      out.write("    \"name\": \"Acme Corp\", //your business name\n");
      out.write("    \"description\": \"Test Transaction\",\n");
      out.write("    \"image\": \"https://example.com/your_logo\",\n");
      out.write("    \"order_id\": \"order_N1QoOFh2ImTCj2\", //This is a sample Order ID. Pass the `id` obtained in the response of Step 1\n");
      out.write("    \"callback_url\": \"https://eneqd3r9zrjok.x.pipedream.net/\",\n");
      out.write("    \"prefill\": { //We recommend using the prefill parameter to auto-fill customer's contact information especially their phone number\n");
      out.write("        \"name\": \"Gaurav Kumar\", //your customer's name\n");
      out.write("        \"email\": \"gaurav.kumar@example.com\",\n");
      out.write("        \"contact\": \"9000090000\" //Provide the customer's phone number for better conversion rates \n");
      out.write("    },\n");
      out.write("    \"notes\": {\n");
      out.write("        \"address\": \"Razorpay Corporate Office\"\n");
      out.write("    },\n");
      out.write("    \"theme\": {\n");
      out.write("        \"color\": \"#3399cc\"\n");
      out.write("    }\n");
      out.write("};\n");
      out.write("var rzp1 = new Razorpay(options);\n");
      out.write("document.getElementById('rzp-button1').onclick = function(e){\n");
      out.write("    rzp1.open();\n");
      out.write("    e.preventDefault();\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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
      out.write("  <!------FOOTER SECTION FOOTER SECTION FOOTER SECTION ------>\n");
      out.write("        <script src=\"course.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
