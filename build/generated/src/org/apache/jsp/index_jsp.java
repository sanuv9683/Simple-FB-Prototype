package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import model.User;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");

    if (!session.isNew() && session.getAttribute("user") != null) {
        response.sendRedirect("dashBoard.jsp");
       
    }

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Facebook-Chat</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/Style.css\" type=\"text/css\" />\n");
      out.write("    </head>\n");
      out.write("    <body class=\"login\">\n");
      out.write("        <!-- header starts here -->\n");
      out.write("        <div id=\"facebook-Bar\">\n");
      out.write("            <div id=\"facebook-Frame\">\n");
      out.write("                <div id=\"logo\"> <a href=\"#\"><img class=\"flo\" src=\"Img/ss.PNG\"></a> </div>\n");
      out.write("                <div id=\"header-main-right\">\n");
      out.write("                    <div id=\"header-main-right-nav\">\n");
      out.write("                        <form method=\"post\" action=\"login\" id=\"login_form\" name=\"login_form\">\n");
      out.write("                            <table border=\"0\" style=\"border:none\">\n");
      out.write("                                <tr>\n");
      out.write("                                    <td ><input type=\"text\" tabindex=\"1\"  id=\"email\" placeholder=\"Email or Phone\" name=\"email\" class=\"inputtext radius1\" value=\"\"></td>\n");
      out.write("                                    <td ><input type=\"password\" tabindex=\"2\" id=\"pass\" placeholder=\"Password\" name=\"password\" class=\"inputtext radius1\" ></td>\n");
      out.write("                                    <td ><input type=\"submit\" class=\"fbbutton\" name=\"\" value=\"Login\" /></td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td><label><input id=\"persist_box\" type=\"checkbox\"  value=\"1\" checked=\"1\"/><span style=\"color:#ccc;\">Keep me logged in</span></label>\n");
      out.write("                                    </td>\n");
      out.write("                                    <td><label><a href=\"\" style=\"color:#ccc; text-decoration:none\">forgot your password?</a></label></td>\n");
      out.write("                                </tr>\n");
      out.write("                            </table>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div><img class=\"aaa\" src=\"Img/lofg.png\"></div>\n");
      out.write("       \n");
      out.write("        <!-- header ends here -->\n");
      out.write("        <div class=\"loginbox radius\">\n");
      out.write("            <h2 class=\"form-head\">Create an account</h2>\n");
      out.write("            <div class=\"loginboxinner radius\">\n");
      out.write("                <div class=\"loginheader\">\n");
      out.write("                    <h4 class=\"title\">It's free and always will be.</h4>\n");
      out.write("                </div><!--loginheader-->\n");
      out.write("\n");
      out.write("                <div class=\"loginform\">\n");
      out.write("\n");
      out.write("                    <form id=\"login\" action=\"register\" method=\"post\">\n");
      out.write("                        <p>\n");
      out.write("                            <input type=\"text\" id=\"username\" name=\"firstName\" placeholder=\"First Name\" value=\"\" class=\"radius mini\" /> \n");
      out.write("                            <input type=\"text\" id=\"username\" name=\"sirName\" placeholder=\"Last Name\" value=\"\" class=\"radius mini\" />\n");
      out.write("                        </p>\n");
      out.write("                        <p>\n");
      out.write("                            <input type=\"text\" id=\"email\" name=\"email\" placeholder=\"Your Email\" value=\"\" class=\"radius\" />\n");
      out.write("                        </p>\n");
      out.write("                        <p>\n");
      out.write("                            <input type=\"text\" id=\"password\" name=\"emailV\" placeholder=\"Re-enter Email\" class=\"radius\" />\n");
      out.write("                        </p>\n");
      out.write("                        <p>\n");
      out.write("                            <input type=\"password\" id=\"password\" name=\"password\" placeholder=\"New Password\" class=\"radius\" />\n");
      out.write("                        </p>\n");
      out.write("                        <p>\n");
      out.write("                            <button class=\"radius title\" name=\"client_login\">Sign Up for Facebook</button>\n");
      out.write("                        </p>\n");
      out.write("                    </form>\n");
      out.write("                </div><!--loginform-->\n");
      out.write("            </div><!--loginboxinner-->\n");
      out.write("        </div><!--loginbox-->\n");
      out.write("\n");
      out.write("\n");
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
