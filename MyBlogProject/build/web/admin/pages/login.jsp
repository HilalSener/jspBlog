<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>Admin Login</title>
        
        <!-- JQUERY -->
        <script src='https://code.jquery.com/jquery-3.2.1.min.js'></script>

        <!-- Bootstrap Core CSS -->
        <link href="../vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

        <!-- MetisMenu CSS -->
        <link href="../vendor/metisMenu/metisMenu.min.css" rel="stylesheet">

        <!-- Custom CSS -->
        <link href="../dist/css/sb-admin-2.css" rel="stylesheet">

        <!-- Custom Fonts -->
        <link href="../vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">

    </head>

    <body>
        <div class="container">
            <div class="row">
                <div class="col-md-4 col-md-offset-4">
                    <div class="login-panel panel panel-default">
                        <div class="panel-heading">
                            <h3 class="panel-title">Please Sign In</h3>
                        </div>
                        <div class="panel-body">
                            <form id="loginForm" >
                                <fieldset>
                                    <div class="form-group">
                                        <input required class="form-control" placeholder="Username" name="uname" type="text" autofocus>
                                    </div>
                                    <div class="form-group">
                                        <input required class="form-control" placeholder="Password" name="password" type="password" value="">
                                    </div>
                                    <div id="mesaj" class="alert alert-danger" role="alert" style="display:none"></div><br/>
                                    <!-- Change this to a button or input when using this as a form -->
                                    <input type="submit" value="Login" class="btn btn-lg btn-success btn-block"/>
                                </fieldset>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        
        <script>
            $("#loginForm").submit(function(e)
            {
                e.preventDefault();
                
                var degerler = $(this).serialize();
                //alert(degerler);
                
                $.post("validation.jsp", degerler, function(data, state)
                {
                    var gelen = $.trim(data);
                    if(gelen == "welcome")
                    {
                        location.href = "forms.jsp";
                    }
                    else
                    {
                        $("#mesaj").html("<center><b>Giriş Bilgileri Hatalı</b></center>");
                        $("#mesaj").slideDown(500);
                    }
                });
                
                return false;
            });
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
