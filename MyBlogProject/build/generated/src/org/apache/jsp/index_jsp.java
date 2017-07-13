package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import blog.source.DB;

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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("        <meta name=\"description\" content=\"\">\r\n");
      out.write("        <meta name=\"author\" content=\"\">\r\n");
      out.write("\r\n");
      out.write("        <title>My Blog</title>\r\n");
      out.write("\r\n");
      out.write("        <!-- Bootstrap Core CSS -->\r\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Custom CSS -->\r\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Custom Fonts -->\r\n");
      out.write("        <link href='https://fonts.googleapis.com/css?family=Montserrat' rel='stylesheet' type='text/css'>\r\n");
      out.write("        <link href='https://fonts.googleapis.com/css?family=Poiret+One|Righteous|Limelight|Marcellus+SC&subset=latin,latin-ext' rel='stylesheet' type='text/css'>\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("        ");

            int p = 0;

            int once = 0, sonra = 0;
            try {
                once = new Integer(request.getParameter("p")) - 1;
                sonra = new Integer(request.getParameter("p")) + 1;
                p = new Integer(request.getParameter("p")) - 1;
            } catch (Exception e) {
            }

            DB db = new DB();
            int basla = p * 5;
            int bitis = 5;

            ResultSet rs = db.execute("select ceil (count(*)/5) as 'pgcnt' from post;");
            rs.next();
            int pageCount = rs.getInt(1);

            rs.close();

            ResultSet rsPost = db.execute("select * from post limit " + basla + ", " + bitis);
        
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- Navigation -->\r\n");
      out.write("        <nav class=\"navbar navbar-default navbar-fixed-top\" role=\"navigation\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <!-- Brand and toggle get grouped for better mobile display -->\r\n");
      out.write("                <div class=\"navbar-header\">\r\n");
      out.write("                    <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\">\r\n");
      out.write("                        <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("                        <span class=\"icon-bar\"></span>\r\n");
      out.write("                        <span class=\"icon-bar\"></span>\r\n");
      out.write("                        <span class=\"icon-bar\"></span>\r\n");
      out.write("                    </button>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- Collect the nav links, forms, and other content for toggling -->\r\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\r\n");
      out.write("                    <ul class=\"nav navbar-nav\">\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"index.jsp\">ANASAYFA</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#\">HOBİ</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#\">ETKİNLİK</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- /.navbar-collapse -->\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- /.container -->\r\n");
      out.write("        </nav>\r\n");
      out.write("\r\n");
      out.write("        <!-- Page Content -->\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("            <h1 class=\"page-header\">\r\n");
      out.write("                <a href=\"#\"> Dev Gal\r\n");
      out.write("                    <small class=\"me\">Hilal Şener</small></a>\r\n");
      out.write("            </h1>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <!-- Blog Entries Column -->\r\n");
      out.write("                <div class=\"col-md-8\">\r\n");
      out.write("                    <!-- Blog Post Loop Action -->\r\n");
      out.write("                    ");
 while (rsPost.next()) {
      out.write("\r\n");
      out.write("                    <!-- First Blog Post -->\r\n");
      out.write("                    <form role=\"form\" action=\"post.jsp\" method=\"get\">\r\n");
      out.write("                        <h2>\r\n");
      out.write("                            <a href=\"post.jsp?title=");
      out.print(rsPost.getString(2));
      out.write('"');
      out.write('>');
      out.print(rsPost.getString(2));
      out.write("</a>\r\n");
      out.write("                        </h2>\r\n");
      out.write("                        <p><span class=\"glyphicon glyphicon-time\"></span> Posted on ");
      out.print(rsPost.getString(4));
      out.write("</p>\r\n");
      out.write("                        <hr>\r\n");
      out.write("                        <img class=\"img-responsive\" src=\"");
      out.print(rsPost.getString(5));
      out.write("\" alt=\"\">\r\n");
      out.write("                        <hr>\r\n");
      out.write("                        <input type=\"text\" maxlength=\"10\" style=\"border: none;background-color: transparent;box-shadow: none;\" readonly>");
      out.print(rsPost.getString(6));
      out.write("/>\r\n");
      out.write("                        <a href=\"post.jsp?title=");
      out.print(rsPost.getString(2));
      out.write("\" class=\"btn btn-primary\" target=\"_blank\">Read More <span class=\"glyphicon glyphicon-chevron-right\"></span></a> \r\n");
      out.write("                        <!-- <button type=\"submit\" class=\"btn btn-primary\">Read More <span class=\"glyphicon glyphicon-chevron-right\"></span></button> -->\r\n");
      out.write("                    </form>\r\n");
      out.write("                    <hr>\r\n");
      out.write("                    ");
 }
      out.write("\r\n");
      out.write("                    <!-- Pager -->\r\n");
      out.write("                    <div id=\"pager\" class=\"col-md-12 text-center\" style=\"margin-top: 20px\">\r\n");
      out.write("                        <nav aria-label=\"Page navigation\">\r\n");
      out.write("                            <ul class=\"pagination\">\r\n");
      out.write("                                ");
 if (once != 0) {
      out.write("\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <a href=\"index.jsp?p=");
      out.print(once);
      out.write("\" aria-label=\"Previous\">\r\n");
      out.write("                                        <span aria-hidden=\"true\">&laquo;</span>\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                ");
 } 
      out.write("\r\n");
      out.write("                                ");
 for (int i = 1; i <= pageCount; i++) {
      out.write("\r\n");
      out.write("                                <li><a href=\"index.jsp?p=");
      out.print(i);
      out.write('"');
      out.write('>');
      out.print(i);
      out.write("</a></li>\r\n");
      out.write("                                    ");
 } 
      out.write("\r\n");
      out.write("                                    ");
 if (sonra != pageCount + 1) {
      out.write("\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <a href=\"index.jsp?p=");
      out.print(sonra);
      out.write("\" aria-label=\"Next\">\r\n");
      out.write("                                        <span aria-hidden=\"true\">&raquo;</span>\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                ");
 }
      out.write("\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </nav>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <!-- Blog Sidebar Widgets Column -->\r\n");
      out.write("                <div class=\"col-md-4\">\r\n");
      out.write("\r\n");
      out.write("                    <!-- Blog About Me-->\r\n");
      out.write("                    <div class=\"well\">\r\n");
      out.write("                        <h4>Hakkımda</h4>\r\n");
      out.write("                        <p class=\"after\"></p>\r\n");
      out.write("                        <p><img class=\"img-responsive\" src=\"img/me.jpg\" /></p>\r\n");
      out.write("                        <p>\r\n");
      out.write("                            </br>Teknolojiye meraklı, araştırmacı, paylaşımcı, gelişimi ve değişimi seven, hedefini yüksek tutan, şimdiden hayalini yaşayan ve yaşatan sosyal biri. </p>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <!-- Follow Me-->\r\n");
      out.write("                    <div class=\"well\">\r\n");
      out.write("                        <h4>Beni Takip Et</h4>\r\n");
      out.write("                        <p class=\"after\"></p>\r\n");
      out.write("                        <div class=\"social-menu\">\r\n");
      out.write("                            <ul>\r\n");
      out.write("                                <li><a href=\"http://www.fb.me/hilalsenerr\" target=\"_blank\"><img src=\"img/f.png\"/></a></li>\r\n");
      out.write("                                <li><a href=\"http://www.twitter.com/hilalsener_ktu\" target=\"_blank\"><img src=\"img/t.png\"/></a></li>\r\n");
      out.write("                                <li><a href=\"http://www.plus.google.com/u/0/+HilalSenerhilalsener\" target=\"_blank\"><img src=\"img/g.png\"/></a></li>\r\n");
      out.write("                                <li><a href=\"http://www.youtube.com/user/SenerHilal\" target=\"_blank\"><img src=\"img/y.png\"/></a></li>\r\n");
      out.write("                                <li><a href=\"http://www.tr.linkedin.com/in/hilalsener\" target=\"_blank\"><img src=\"img/i.png\"/></a></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    ");

                        //String cat = "select category from category";
                        ResultSet cat = db.execute("select category_id, category from category order by category asc");
                       // cat.next();
                    
      out.write("\r\n");
      out.write("                    <!-- Follow Me-->\r\n");
      out.write("                    <div class=\"well\">\r\n");
      out.write("                        <h4>Kategoriler</h4>\r\n");
      out.write("                        <p class=\"after\"></p>\r\n");
      out.write("                        <div>\r\n");
      out.write("                            <ul class=\"nav\" role=\"tablist\">\r\n");
      out.write("                                ");
 while (cat.next()) {
      out.write("\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <a href=\"postsByCategory.jsp?category=");
      out.print(cat.getString(1));
      out.write('"');
      out.write('>');
      out.print(cat.getString(2));
      out.write("</a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                ");
 }
      out.write("\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <!-- Tweets Well -->\r\n");
      out.write("                    <div class=\"well\">\r\n");
      out.write("                        <h4>Tweetler</h4>\r\n");
      out.write("                        <p class=\"after\"></p>\r\n");
      out.write("                        <a class=\"twitter-timeline\" data-height=\"800\" href=\"https://twitter.com/HilalSener_KTU\">Hilal Şener tarafından gönderilen tweetler</a>\r\n");
      out.write("                        <script async src=\"//platform.twitter.com/widgets.js\" charset=\"utf-8\"></script>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <!-- Side Widget Well -->\r\n");
      out.write("                    <div class=\"well\">\r\n");
      out.write("                        <h4>Abone Ol</h4>\r\n");
      out.write("                        <p class=\"after\"></p>\r\n");
      out.write("                        <p>Blog yazılarımdan güncel olarak haberdar olmak istiyorsanız. Bu kutucuğa e-mail adresinizi yazıp bir\r\n");
      out.write("                            tıkla abone olabilir ve e-mail ile bildirim alabilirsiniz.</p>\r\n");
      out.write("                        <input class=\"form-control\" type=\"email\" required=\"required\" class=\"required\" placeholder=\"Email Address\" /></br>\r\n");
      out.write("                        <input class=\"btn btn-default\" type=\"button\" value=\"Subscribe\" name=\"\" />\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- /.row -->\r\n");
      out.write("\r\n");
      out.write("            <hr>\r\n");
      out.write("\r\n");
      out.write("            <!-- Footer -->\r\n");
      out.write("            <footer>\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-lg-12\">\r\n");
      out.write("                        <p>Copyright &copy; Hilal Şener Website 2016</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!-- /.col-lg-12 -->\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- /.row -->\r\n");
      out.write("            </footer>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- /.container -->\r\n");
      out.write("\r\n");
      out.write("        <!-- jQuery -->\r\n");
      out.write("        <script src=\"js/jquery.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <!-- Bootstrap Core JavaScript -->\r\n");
      out.write("        <script src=\"<?php bloginfo(\" stylesheet_directory \"); ?>/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <?php wp_footer(); ?>\r\n");
      out.write("    </body>\r\n");
      out.write("\r\n");
      out.write("</html>");
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
