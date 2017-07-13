<%@page import="java.sql.ResultSet"%>
<%@page import="blog.source.DB"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>My Blog</title>

        <!-- Bootstrap Core CSS -->
        <link href="css/bootstrap.min.css" rel="stylesheet">

        <!-- Custom CSS -->
        <link href="css/style.css" rel="stylesheet">

        <!-- Custom Fonts -->
        <link href='https://fonts.googleapis.com/css?family=Montserrat' rel='stylesheet' type='text/css'>
        <link href='https://fonts.googleapis.com/css?family=Poiret+One|Righteous|Limelight|Marcellus+SC&subset=latin,latin-ext' rel='stylesheet' type='text/css'>
    </head>

    <body>
        <%
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
        %>

        <!-- Navigation -->
        <nav class="navbar navbar-default navbar-fixed-top" role="navigation">
            <div class="container">
                <!-- Brand and toggle get grouped for better mobile display -->
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>

                </div>
                <!-- Collect the nav links, forms, and other content for toggling -->
                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                    <ul class="nav navbar-nav">
                        <li>
                            <a href="index.jsp">ANASAYFA</a>
                        </li>
                        <li>
                            <a href="#">HOBİ</a>
                        </li>
                        <li>
                            <a href="#">ETKİNLİK</a>
                        </li>
                    </ul>
                    <form class="navbar-form navbar-right" role="search">
                        <div class="input-group" style="margin:10px">
                            <input type="text" class="form-control" placeholder="Search" name="q">
                            <div class="input-group-btn">
                                <button class="btn btn-default" type="submit"><i class="glyphicon glyphicon-search"></i></button>
                            </div>
                        </div>
                    </form>
                </div>
                <!-- /.navbar-collapse -->
            </div>
            <!-- /.container -->
        </nav>

        <!-- Page Content -->
        <div class="container">

            <h1 class="page-header">
                <a href="#"> Dev Gal
                    <small class="me">Hilal Şener</small></a>
            </h1>

            <div class="row">
                <!-- Blog Entries Column -->
                <div class="col-md-8">
                    <!-- Blog Post Loop Action -->
                    <% while (rsPost.next()) {%>
                    <!-- First Blog Post -->
                    <form role="form" action="post.jsp" method="get">
                        <h2>
                            <a href="post.jsp?title=<%=rsPost.getString(2)%>"><%=rsPost.getString(2)%></a>
                        </h2>
                        <p><span class="glyphicon glyphicon-time"></span> Posted on <%=rsPost.getString(4)%></p>
                        <hr>
                        <img class="img-responsive" src="<%=rsPost.getString(5)%>" alt="">
                        <hr>
                        <!-- <input type="text" maxlength="100" style="border: none;background-color: transparent;box-shadow: none;width: 100%;" value="<%=rsPost.getString(6)%>" readonly /><br/><br/> -->
                        <textarea rows="10" cols="30" style="border: none;background-color: transparent;resize: none;outline: none;width: 100%;height:80px;overflow:hidden;resize:none" readonly><%=rsPost.getString(6)%></textarea> 
                        <a href="post.jsp?title=<%=rsPost.getString(2)%>" class="btn btn-primary" target="_blank">Devamını Oku <span class="glyphicon glyphicon-chevron-right"></span></a> 
                        <!-- <button type="submit" class="btn btn-primary">Read More <span class="glyphicon glyphicon-chevron-right"></span></button> -->
                    </form>
                    <hr>
                    <% }%>
                    <!-- Pager -->
                    <div id="pager" class="col-md-12 text-center" style="margin-top: 20px">
                        <nav aria-label="Page navigation">
                            <ul class="pagination">
                                <% if (once != 0) {%>
                                <li>
                                    <a href="index.jsp?p=<%=once%>" aria-label="Previous">
                                        <span aria-hidden="true">&laquo;</span>
                                    </a>
                                </li>
                                <% } %>
                                <% for (int i = 1; i <= pageCount; i++) {%>
                                <li><a href="index.jsp?p=<%=i%>"><%=i%></a></li>
                                    <% } %>
                                    <% if (sonra != pageCount + 1) {%>
                                <li>
                                    <a href="index.jsp?p=<%=sonra%>" aria-label="Next">
                                        <span aria-hidden="true">&raquo;</span>
                                    </a>
                                </li>
                                <% }%>
                            </ul>
                        </nav>
                    </div>

                </div>

                <!-- Blog Sidebar Widgets Column -->
                <div class="col-md-4">

                    <!-- Blog About Me-->
                    <div class="well">
                        <h4>Hakkımda</h4>
                        <p class="after"></p>
                        <p><img class="img-responsive" src="img/me.jpg" /></p>
                        <p>
                            </br>Teknolojiye meraklı, araştırmacı, paylaşımcı, gelişimi ve değişimi seven, hedefini yüksek tutan, şimdiden hayalini yaşayan ve yaşatan sosyal biri. </p>
                    </div>

                    <!-- Follow Me-->
                    <div class="well">
                        <h4>Beni Takip Et</h4>
                        <p class="after"></p>
                        <div class="social-menu">
                            <ul>
                                <li><a href="http://www.fb.me/hilalsenerr" target="_blank"><img src="img/f.png"/></a></li>
                                <li><a href="http://www.twitter.com/hilalsener_ktu" target="_blank"><img src="img/t.png"/></a></li>
                                <li><a href="http://www.plus.google.com/u/0/+HilalSenerhilalsener" target="_blank"><img src="img/g.png"/></a></li>
                                <li><a href="http://www.youtube.com/user/SenerHilal" target="_blank"><img src="img/y.png"/></a></li>
                                <li><a href="http://www.tr.linkedin.com/in/hilalsener" target="_blank"><img src="img/i.png"/></a></li>
                            </ul>
                        </div>
                    </div>

                    <%
                        //Kategoriler alfabetik sıraya göre getir
                        ResultSet cat = db.execute("select category_id, category from category order by category asc");
                    %>
                    <!-- Follow Me-->
                    <div class="well">
                        <h4>Kategoriler</h4>
                        <p class="after"></p>
                        <div>
                            <ul class="nav" role="tablist">
                                <% while (cat.next()) {%>
                                <li>
                                    <a href="postsByCategory.jsp?category=<%=cat.getString(1)%>"><%=cat.getString(2)%></a>
                                </li>
                                <% }%>
                            </ul>
                        </div>
                    </div>

                    <!-- Tweets Well -->
                    <div class="well">
                        <h4>Tweetler</h4>
                        <p class="after"></p>
                        <a class="twitter-timeline" data-height="800" href="https://twitter.com/HilalSener_KTU">Hilal Şener tarafından gönderilen tweetler</a>
                        <script async src="//platform.twitter.com/widgets.js" charset="utf-8"></script>
                    </div>

                    <!-- Side Widget Well -->
                    <div class="well">
                        <h4>Abone Ol</h4>
                        <p class="after"></p>
                        <p>Blog yazılarımdan güncel olarak haberdar olmak istiyorsanız. Bu kutucuğa e-mail adresinizi yazıp bir
                            tıkla abone olabilir ve e-mail ile bildirim alabilirsiniz.</p>
                        <input class="form-control" type="email" required="required" class="required" placeholder="Email Address" /></br>
                        <input class="btn btn-default" type="button" value="Subscribe" name="" />
                    </div>

                </div>

            </div>
            <!-- /.row -->

            <hr>

            <!-- Footer -->
            <footer>
                <div class="row">
                    <div class="col-lg-12">
                        <p>Copyright &copy; Hilal Şener Website 2016</p>
                    </div>
                    <!-- /.col-lg-12 -->
                </div>
                <!-- /.row -->
            </footer>

        </div>
        <!-- /.container -->

        <!-- jQuery -->
        <script src="js/jquery.js"></script>

        <!-- Bootstrap Core JavaScript -->
        <script src="<?php bloginfo(" stylesheet_directory "); ?>/js/bootstrap.min.js"></script>

        <?php wp_footer(); ?>
    </body>

</html>