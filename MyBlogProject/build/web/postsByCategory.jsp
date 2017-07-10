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
            DB db = new DB();
            
            String category = request.getParameter("category");

            try {
                category = new String(request.getParameter("category"));
            } catch (Exception e) {
            }
            
            ResultSet rsPostsByCategory = db.execute("select * from post where category_id ='"+ category +"' order by category_id limit 0, 5");
            
            //rsPostsByCategory.next();
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
                    <% while (rsPostsByCategory.next()) { %>
                    <!-- First Blog Post -->
                    <form role="form" action="post.jsp" method="get">
                        <h2>
                            <a href="post.jsp?title=<%=rsPostsByCategory.getString(2)%>"><%=rsPostsByCategory.getString(2)%></a>
                        </h2>
                        <p><span class="glyphicon glyphicon-time"></span> Posted on <%=rsPostsByCategory.getString(4)%></p>
                        <hr>
                        <img class="img-responsive" src="<%=rsPostsByCategory.getString(5)%>" alt="">
                        <hr>
                        <p><%=rsPostsByCategory.getString(6)%></p>
                        <a href="post.jsp?title=<%=rsPostsByCategory.getString(2)%>" class="btn btn-primary" target="_blank">Read More <span class="glyphicon glyphicon-chevron-right"></span></a> 
                    </form>
                    <hr>
                    <% } %>
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
                        //String cat = "select category from category";
                        ResultSet cat = db.execute("select category_id, category from category order by category asc");
                        //cat.next();
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