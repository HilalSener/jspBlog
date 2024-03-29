<%
    //Eğer bağlana istemci için username bilgisi yoksa
    if (session.getAttribute("username") == null) {
        //session u yok et
        session.invalidate();
        //kullanıcıyı login.jsp ye yönlendir
        response.sendRedirect("login.jsp");
        return;
    }
%>
<%@page import="java.sql.ResultSet"%>
<%@page import="blog.source.DB"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>SB Admin 2 - Bootstrap Admin Theme</title>

        <!-- Bootstrap Core CSS -->
        <link href="../vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

        <!-- MetisMenu CSS -->
        <link href="../vendor/metisMenu/metisMenu.min.css" rel="stylesheet">

        <!-- Custom CSS -->
        <link href="../dist/css/sb-admin-2.css" rel="stylesheet">

        <!-- Custom Fonts -->
        <link href="../vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">

        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

    </head>

    <body>
        <div id="container">

            <!-- Navigation -->
            <nav class="navbar navbar-default navbar-static-top" role="navigation" style="margin-bottom: 0">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="index.html">SB Admin v2.0</a>
                </div>
                <!-- /.navbar-header -->

                <ul class="nav navbar-top-links navbar-right">
                    <li>
                        <a href="logout.jsp"><i class="fa fa-sign-out fa-fw"></i> Logout</a>
                    </li>
                </ul>
                <!-- /.navbar-top-links -->

                <div class="navbar-default sidebar" role="navigation">
                    <div class="sidebar-nav navbar-collapse">
                        <ul class="nav" id="side-menu">
                            <li>
                                <a href="forms.jsp"><i class="fa fa-edit fa-fw"></i> Add Post</a>
                            </li>
                            <li>
                                <a href="editPost.jsp"><i class="fa fa-edit fa-fw"></i> Edit Post</a>
                            </li>
                            <li>
                                <a href="category.jsp"><i class="fa fa-edit fa-fw"></i> Category</a>
                            </li>
                        </ul>
                    </div>
                    <!-- /.sidebar-collapse -->
                </div>
                <!-- /.navbar-static-side -->
            </nav>

            <div id="page-wrapper">
                <div class="row">
                    <div class="col-lg-12">
                        <h1 class="page-header">Categories</h1>
                    </div>
                    <!-- /.col-lg-12 -->
                </div>
                <!-- /.row -->
                <div class="row">
                    <div class="col-lg-12">
                        <div class="row">
                            <div class="col-lg-4">
                                <!-- <form role="form" action="addCategory.jsp" method="post"> -->
                                <%
                                    DB db = new DB();
                                    ResultSet rs = db.execute("select category_id, category from category order by category_id");
                                %>
                                <table id="mytable" class="table table-bordred table-striped">
                                    <thead>
                                    <th>Category ID</th>
                                    <th>Category</th>
                                    </thead>
                                    <tbody>
                                        <% while (rs.next()) {%>
                                        <tr>
                                            <td><input type="text" id="category_id" class="form-control" style="border: 0px;box-shadow: none;background-color: transparent" value="<%=rs.getString(1)%>"></td>
                                            <td><input type="text" class="form-control" style="border: 0px;box-shadow: none;background-color: transparent" value="<%=rs.getString(2)%>"></td>
                                            <td>&emsp;&emsp;&emsp;</td>
                                            <td>&emsp;&emsp;&emsp;</td>
                                            <td><p data-placement="top" data-toggle="tooltip" title="Edit"><button class="btn_edit btn btn-primary btn-xs" rec_id="<%=rs.getString(1)%>" data-title="Edit" data-toggle="modal" data-target="#edit" onclick="copyCategory()"><span class="glyphicon glyphicon-pencil"></span></button></p></td>
                                            <td><p data-placement="top" data-toggle="tooltip" title="Delete"><a href="deleteCategory.jsp?cat=<%=rs.getString(2)%>" class="btn btn-danger btn-xs" data-title="Delete"><span class="glyphicon glyphicon-trash"></span></a></p></td>
                                        </tr>
                                        <% }%>
                                </table>
                                <form action="addCategory.jsp" method="get">
                                    <div class="form-group">
                                        <label>Add new category</label>
                                        <input class="form-control" name="cat">
                                    </div>
                                    <button type="submit" class="btn btn-primary" name="add">Add</button>
                                </form>
                            </div>
                        </div>
                        <!-- /.row (nested) -->
                    </div>
                    <!-- /.col-lg-12 -->
                </div>
                <!-- /.row -->
            </div>
            <!-- /#page-wrapper -->
        </div>
        <!-- /#wrapper -->

        <div class="modal fade" id="edit" tabindex="-1" role="dialog" aria-labelledby="edit" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true"><span class="glyphicon glyphicon-remove" aria-hidden="true"></span></button>
                        <h4 class="modal-title custom_align" id="Heading">Edit Your Category</h4>
                    </div>
                    <form action="updateCategory.jsp" method="get">
                        <div class="modal-body">
                            <div class="form-group">
                                <input class="form-control" type="text" id="category_id2" name="cat_id" readonly>
                            </div>
                            <div class="form-group">
                                <input class="form-control " type="text" placeholder="Category" name="cat">
                            </div>
                        </div>
                        <div class="modal-footer ">
                            <button type="submit" class="btn btn-warning btn-lg" style="width: 100%;"><span class="glyphicon glyphicon-ok-sign"></span> Update</button> 
                        </div>
                    </form>
                </div>
                <!-- /.modal-content --> 
            </div>
            <!-- /.modal-dialog --> 
        </div>

        <script>
            $(".btn_edit").click(function ()
            {
                var id = $(this).attr('rec_id');
                //alert('Secilen : '+id);
                $("#category_id2").val(id);

            });
            function copyCategory()
            {
                //document.getElementById("category_id2").value = document.getElementById("category_id").value;
                //alert(document.getElementById("category_id").value);
            }
        </script>

        <!-- jQuery -->
        <script src="../vendor/jquery/jquery.min.js"></script>

        <!-- Bootstrap Core JavaScript -->
        <script src="../vendor/bootstrap/js/bootstrap.min.js"></script>

        <!-- Metis Menu Plugin JavaScript -->
        <script src="../vendor/metisMenu/metisMenu.min.js"></script>

        <!-- Custom Theme JavaScript -->
        <script src="../dist/js/sb-admin-2.js"></script>

    </body>

</html>
