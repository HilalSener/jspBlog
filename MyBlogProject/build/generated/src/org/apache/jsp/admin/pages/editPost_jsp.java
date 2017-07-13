package org.apache.jsp.admin.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import blog.source.DB;

public final class editPost_jsp extends org.apache.jasper.runtime.HttpJspBase
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


    //Eğer bağlana istemci için username bilgisi yoksa
    if(session.getAttribute("username") == null)
    {
        //session u yok et
        session.invalidate();
        //kullanıcıyı login.jsp ye yönlendir
        response.sendRedirect("login.jsp");
        return;
    }

      out.write("\n");
      out.write("\n");
      out.write("\n");
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
      out.write("        <title>SB Admin 2 - Bootstrap Admin Theme</title>\n");
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
      out.write("\n");
      out.write("        <div id=\"wrapper\">\n");
      out.write("\n");
      out.write("            <!-- Navigation -->\n");
      out.write("            <nav class=\"navbar navbar-default navbar-static-top\" role=\"navigation\" style=\"margin-bottom: 0\">\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">\n");
      out.write("                        <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                    </button>\n");
      out.write("                    <a class=\"navbar-brand\" href=\"index.html\">SB Admin v2.0</a>\n");
      out.write("                </div>\n");
      out.write("                <!-- /.navbar-header -->\n");
      out.write("\n");
      out.write("                <ul class=\"nav navbar-top-links navbar-right\">\n");
      out.write("                    <li class=\"dropdown\">\n");
      out.write("                        <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">\n");
      out.write("                            <i class=\"fa fa-envelope fa-fw\"></i> <i class=\"fa fa-caret-down\"></i>\n");
      out.write("                        </a>\n");
      out.write("                        <ul class=\"dropdown-menu dropdown-messages\">\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\">\n");
      out.write("                                    <div>\n");
      out.write("                                        <strong>John Smith</strong>\n");
      out.write("                                        <span class=\"pull-right text-muted\">\n");
      out.write("                                            <em>Yesterday</em>\n");
      out.write("                                        </span>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque eleifend...</div>\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"divider\"></li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\">\n");
      out.write("                                    <div>\n");
      out.write("                                        <strong>John Smith</strong>\n");
      out.write("                                        <span class=\"pull-right text-muted\">\n");
      out.write("                                            <em>Yesterday</em>\n");
      out.write("                                        </span>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque eleifend...</div>\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"divider\"></li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\">\n");
      out.write("                                    <div>\n");
      out.write("                                        <strong>John Smith</strong>\n");
      out.write("                                        <span class=\"pull-right text-muted\">\n");
      out.write("                                            <em>Yesterday</em>\n");
      out.write("                                        </span>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque eleifend...</div>\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"divider\"></li>\n");
      out.write("                            <li>\n");
      out.write("                                <a class=\"text-center\" href=\"#\">\n");
      out.write("                                    <strong>Read All Messages</strong>\n");
      out.write("                                    <i class=\"fa fa-angle-right\"></i>\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                        <!-- /.dropdown-messages -->\n");
      out.write("                    </li>\n");
      out.write("                    <!-- /.dropdown -->\n");
      out.write("                    <li class=\"dropdown\">\n");
      out.write("                        <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">\n");
      out.write("                            <i class=\"fa fa-tasks fa-fw\"></i> <i class=\"fa fa-caret-down\"></i>\n");
      out.write("                        </a>\n");
      out.write("                        <ul class=\"dropdown-menu dropdown-tasks\">\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\">\n");
      out.write("                                    <div>\n");
      out.write("                                        <p>\n");
      out.write("                                            <strong>Task 1</strong>\n");
      out.write("                                            <span class=\"pull-right text-muted\">40% Complete</span>\n");
      out.write("                                        </p>\n");
      out.write("                                        <div class=\"progress progress-striped active\">\n");
      out.write("                                            <div class=\"progress-bar progress-bar-success\" role=\"progressbar\" aria-valuenow=\"40\" aria-valuemin=\"0\" aria-valuemax=\"100\" style=\"width: 40%\">\n");
      out.write("                                                <span class=\"sr-only\">40% Complete (success)</span>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"divider\"></li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\">\n");
      out.write("                                    <div>\n");
      out.write("                                        <p>\n");
      out.write("                                            <strong>Task 2</strong>\n");
      out.write("                                            <span class=\"pull-right text-muted\">20% Complete</span>\n");
      out.write("                                        </p>\n");
      out.write("                                        <div class=\"progress progress-striped active\">\n");
      out.write("                                            <div class=\"progress-bar progress-bar-info\" role=\"progressbar\" aria-valuenow=\"20\" aria-valuemin=\"0\" aria-valuemax=\"100\" style=\"width: 20%\">\n");
      out.write("                                                <span class=\"sr-only\">20% Complete</span>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"divider\"></li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\">\n");
      out.write("                                    <div>\n");
      out.write("                                        <p>\n");
      out.write("                                            <strong>Task 3</strong>\n");
      out.write("                                            <span class=\"pull-right text-muted\">60% Complete</span>\n");
      out.write("                                        </p>\n");
      out.write("                                        <div class=\"progress progress-striped active\">\n");
      out.write("                                            <div class=\"progress-bar progress-bar-warning\" role=\"progressbar\" aria-valuenow=\"60\" aria-valuemin=\"0\" aria-valuemax=\"100\" style=\"width: 60%\">\n");
      out.write("                                                <span class=\"sr-only\">60% Complete (warning)</span>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"divider\"></li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\">\n");
      out.write("                                    <div>\n");
      out.write("                                        <p>\n");
      out.write("                                            <strong>Task 4</strong>\n");
      out.write("                                            <span class=\"pull-right text-muted\">80% Complete</span>\n");
      out.write("                                        </p>\n");
      out.write("                                        <div class=\"progress progress-striped active\">\n");
      out.write("                                            <div class=\"progress-bar progress-bar-danger\" role=\"progressbar\" aria-valuenow=\"80\" aria-valuemin=\"0\" aria-valuemax=\"100\" style=\"width: 80%\">\n");
      out.write("                                                <span class=\"sr-only\">80% Complete (danger)</span>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"divider\"></li>\n");
      out.write("                            <li>\n");
      out.write("                                <a class=\"text-center\" href=\"#\">\n");
      out.write("                                    <strong>See All Tasks</strong>\n");
      out.write("                                    <i class=\"fa fa-angle-right\"></i>\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                        <!-- /.dropdown-tasks -->\n");
      out.write("                    </li>\n");
      out.write("                    <!-- /.dropdown -->\n");
      out.write("                    <li class=\"dropdown\">\n");
      out.write("                        <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">\n");
      out.write("                            <i class=\"fa fa-bell fa-fw\"></i> <i class=\"fa fa-caret-down\"></i>\n");
      out.write("                        </a>\n");
      out.write("                        <ul class=\"dropdown-menu dropdown-alerts\">\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\">\n");
      out.write("                                    <div>\n");
      out.write("                                        <i class=\"fa fa-comment fa-fw\"></i> New Comment\n");
      out.write("                                        <span class=\"pull-right text-muted small\">4 minutes ago</span>\n");
      out.write("                                    </div>\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"divider\"></li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\">\n");
      out.write("                                    <div>\n");
      out.write("                                        <i class=\"fa fa-twitter fa-fw\"></i> 3 New Followers\n");
      out.write("                                        <span class=\"pull-right text-muted small\">12 minutes ago</span>\n");
      out.write("                                    </div>\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"divider\"></li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\">\n");
      out.write("                                    <div>\n");
      out.write("                                        <i class=\"fa fa-envelope fa-fw\"></i> Message Sent\n");
      out.write("                                        <span class=\"pull-right text-muted small\">4 minutes ago</span>\n");
      out.write("                                    </div>\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"divider\"></li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\">\n");
      out.write("                                    <div>\n");
      out.write("                                        <i class=\"fa fa-tasks fa-fw\"></i> New Task\n");
      out.write("                                        <span class=\"pull-right text-muted small\">4 minutes ago</span>\n");
      out.write("                                    </div>\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"divider\"></li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\">\n");
      out.write("                                    <div>\n");
      out.write("                                        <i class=\"fa fa-upload fa-fw\"></i> Server Rebooted\n");
      out.write("                                        <span class=\"pull-right text-muted small\">4 minutes ago</span>\n");
      out.write("                                    </div>\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"divider\"></li>\n");
      out.write("                            <li>\n");
      out.write("                                <a class=\"text-center\" href=\"#\">\n");
      out.write("                                    <strong>See All Alerts</strong>\n");
      out.write("                                    <i class=\"fa fa-angle-right\"></i>\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                        <!-- /.dropdown-alerts -->\n");
      out.write("                    </li>\n");
      out.write("                    <!-- /.dropdown -->\n");
      out.write("                    <li class=\"dropdown\">\n");
      out.write("                        <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">\n");
      out.write("                            <i class=\"fa fa-user fa-fw\"></i> <i class=\"fa fa-caret-down\"></i>\n");
      out.write("                        </a>\n");
      out.write("                        <ul class=\"dropdown-menu dropdown-user\">\n");
      out.write("                            <li><a href=\"#\"><i class=\"fa fa-user fa-fw\"></i> User Profile</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li><a href=\"#\"><i class=\"fa fa-gear fa-fw\"></i> Settings</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"divider\"></li>\n");
      out.write("                            <li><a href=\"login.html\"><i class=\"fa fa-sign-out fa-fw\"></i> Logout</a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                        <!-- /.dropdown-user -->\n");
      out.write("                    </li>\n");
      out.write("                    <!-- /.dropdown -->\n");
      out.write("                </ul>\n");
      out.write("                <!-- /.navbar-top-links -->\n");
      out.write("\n");
      out.write("                <div class=\"navbar-default sidebar\" role=\"navigation\">\n");
      out.write("                    <div class=\"sidebar-nav navbar-collapse\">\n");
      out.write("                        <ul class=\"nav\" id=\"side-menu\">\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"forms.jsp\"><i class=\"fa fa-edit fa-fw\"></i> Add Post</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"editPost.jsp\"><i class=\"fa fa-edit fa-fw\"></i> Edit Post</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"category.jsp\"><i class=\"fa fa-edit fa-fw\"></i> Category</a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- /.sidebar-collapse -->\n");
      out.write("                </div>\n");
      out.write("                <!-- /.navbar-static-side -->\n");
      out.write("            </nav>\n");
      out.write("\n");
      out.write("            <div id=\"page-wrapper\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-12\">\n");
      out.write("                        <h1 class=\"page-header\">Create Your Blog Post</h1>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- /.col-lg-12 -->\n");
      out.write("                </div>\n");
      out.write("                <!-- /.row -->\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-12\">\n");
      out.write("                        <div class=\"panel-body\">\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                               <div class=\"col-lg-12\">\n");
      out.write("                                    ");

                                        DB db = new DB();
                                        ResultSet rsPost = db.execute("select * from post order by post_id");
                                        rsPost.getRowId("comments_enabled");
                                        String comment = rsPost.getString(7);
                                        if(comment == "1")
                                            comment = "Yes";
                                        else
                                            comment = "No";
                                    
      out.write("\n");
      out.write("                                    <table id=\"mytable\" class=\"table table-bordred table-striped\" style=\"width: 100%\">\n");
      out.write("                                        <thead>\n");
      out.write("                                        <th>Title</th>\n");
      out.write("                                        <th>Date</th>\n");
      out.write("                                        <th>Image</th>\n");
      out.write("                                        <th>Post</th>\n");
      out.write("                                        <th>Comments</th>\n");
      out.write("                                        </thead>\n");
      out.write("                                        <tbody>\n");
      out.write("                                            ");
 while (rsPost.next()) {
      out.write("\n");
      out.write("                                            <tr>\n");
      out.write("                                                <td><input type=\"text\" class=\"form-control\" style=\"border: 0px;box-shadow: none;background-color: transparent\" value=\"");
      out.print(rsPost.getString(2));
      out.write("\" readonly></td>\n");
      out.write("                                                <td><input type=\"text\" class=\"form-control\" style=\"border: 0px;box-shadow: none;background-color: transparent\" value=\"");
      out.print(rsPost.getString(4));
      out.write("\" readonly></td>\n");
      out.write("                                                <td><input type=\"text\" class=\"form-control\" style=\"border: 0px;box-shadow: none;background-color: transparent\" value=\"");
      out.print(rsPost.getString(5));
      out.write("\" readonly></td>\n");
      out.write("                                                <td><input type=\"text\" class=\"form-control\" style=\"border: 0px;box-shadow: none;background-color: transparent\" value=\"");
      out.print(rsPost.getString(6));
      out.write("\" readonly></td>\n");
      out.write("                                                <td><input type=\"text\" class=\"form-control\" style=\"border: 0px;box-shadow: none;background-color: transparent\" value=\"");
      out.print(rsPost.getString(7));
      out.write("\" readonly></td>\n");
      out.write("                                                <td><p data-placement=\"top\" data-toggle=\"tooltip\" title=\"Edit\"><button class=\"btn btn-primary btn-xs\" data-title=\"Edit\" data-toggle=\"modal\" data-target=\"#edit\" onclick=\"copyCategory()\"><span class=\"glyphicon glyphicon-pencil\"></span></button></p></td>\n");
      out.write("                                                <td><p data-placement=\"top\" data-toggle=\"tooltip\" title=\"Delete\"><a href=\"deletePost.jsp?del=");
      out.print(rsPost.getString(2));
      out.write("\" class=\"btn btn-danger btn-xs\" data-title=\"Delete\"><span class=\"glyphicon glyphicon-trash\"></span></a></p></td>\n");
      out.write("                                            </tr>\n");
      out.write("                                            ");
 }
      out.write("\n");
      out.write("                                    </table>\n");
      out.write("                                </div> \n");
      out.write("                            </div>\n");
      out.write("                            <!-- /.row (nested) -->\n");
      out.write("                        </div>\n");
      out.write("                        <!-- /.panel -->\n");
      out.write("                    </div>\n");
      out.write("                    <!-- /.col-lg-12 -->\n");
      out.write("                </div>\n");
      out.write("                <!-- /.row -->\n");
      out.write("            </div>\n");
      out.write("            <!-- /#page-wrapper -->\n");
      out.write("\n");
      out.write("            <div class=\"modal fade\" id=\"edit\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"edit\" aria-hidden=\"true\">\n");
      out.write("            <div class=\"modal-dialog\">\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                    <div class=\"modal-header\">\n");
      out.write("                        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\"><span class=\"glyphicon glyphicon-remove\" aria-hidden=\"true\"></span></button>\n");
      out.write("                        <h4 class=\"modal-title custom_align\" id=\"Heading\">Edit Your Category</h4>\n");
      out.write("                    </div>\n");
      out.write("                    <form action=\"updateCategory.jsp\" method=\"get\">\n");
      out.write("                        <div class=\"modal-body\">\n");
      out.write("\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <input class=\"form-control\" type=\"text\" id=\"category_id2\" name=\"cat_id\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <input class=\"form-control \" type=\"text\" placeholder=\"Category\" name=\"cat\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"modal-footer \">\n");
      out.write("                            <button type=\"submit\" class=\"btn btn-warning btn-lg\" style=\"width: 100%;\"><span class=\"glyphicon glyphicon-ok-sign\"></span> Update</button> \n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("                <!-- /.modal-content --> \n");
      out.write("            </div>\n");
      out.write("            <!-- /.modal-dialog --> \n");
      out.write("        </div>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        <!-- /#wrapper -->\n");
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