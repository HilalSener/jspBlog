package org.apache.jsp.admin.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("        <title>Admin Login</title>\n");
      out.write("        \n");
      out.write("        <!-- JQUERY -->\n");
      out.write("        <script src='https://code.jquery.com/jquery-3.2.1.min.js'></script>\n");
      out.write("\n");
      out.write("        <!-- Bootstrap Core CSS -->\n");
      out.write("        <link href=\"../vendor/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- MetisMenu CSS -->\n");
      out.write("        <link href=\"../vendor/metisMenu/metisMenu.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Custom CSS -->\n");
      out.write("        <link href=\"../dist/css/sb-admin-2.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Custom Fonts -->\n");
      out.write("        <link href=\"../vendor/font-awesome/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-4 col-md-offset-4\">\n");
      out.write("                    <div class=\"login-panel panel panel-default\">\n");
      out.write("                        <div class=\"panel-heading\">\n");
      out.write("                            <h3 class=\"panel-title\">Please Sign In</h3>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"panel-body\">\n");
      out.write("                            <form id=\"loginForm\" >\n");
      out.write("                                <fieldset>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <input required class=\"form-control\" placeholder=\"Username\" name=\"uname\" type=\"text\" autofocus>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <input required class=\"form-control\" placeholder=\"Password\" name=\"password\" type=\"password\" value=\"\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div id=\"mesaj\" class=\"alert alert-danger\" role=\"alert\" style=\"display:none\"></div><br/>\n");
      out.write("                                    <!-- Change this to a button or input when using this as a form -->\n");
      out.write("                                    <input type=\"submit\" value=\"Login\" class=\"btn btn-lg btn-success btn-block\"/>\n");
      out.write("                                </fieldset>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <script>\n");
      out.write("            $(\"#loginForm\").submit(function(e)\n");
      out.write("            {\n");
      out.write("                e.preventDefault();\n");
      out.write("                \n");
      out.write("                var degerler = $(this).serialize();\n");
      out.write("                //alert(degerler);\n");
      out.write("                \n");
      out.write("                $.post(\"validation.jsp\", degerler, function(data, state)\n");
      out.write("                {\n");
      out.write("                    var gelen = $.trim(data);\n");
      out.write("                    if(gelen == \"welcome\")\n");
      out.write("                    {\n");
      out.write("                        location.href = \"forms.jsp\";\n");
      out.write("                    }\n");
      out.write("                    else\n");
      out.write("                    {\n");
      out.write("                        $(\"#mesaj\").html(\"<center><b>Giriş Bilgileri Hatalı</b></center>\");\n");
      out.write("                        $(\"#mesaj\").slideDown(500);\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("                \n");
      out.write("                return false;\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("        <!-- jQuery -->\n");
      out.write("        <script src=\"../vendor/jquery/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Bootstrap Core JavaScript -->\n");
      out.write("        <script src=\"../vendor/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Metis Menu Plugin JavaScript -->\n");
      out.write("        <script src=\"../vendor/metisMenu/metisMenu.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Custom Theme JavaScript -->\n");
      out.write("        <script src=\"../dist/js/sb-admin-2.js\"></script>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("\n");
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
