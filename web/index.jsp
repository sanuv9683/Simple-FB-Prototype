<%-- 
    Document   : index
    Created on : May 22, 2017, 8:36:43 AM
    Author     : Sanu Vithanage
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="model.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<%
    if (!session.isNew() && session.getAttribute("user") != null) {
        response.sendRedirect("dashBoard.jsp");
       
    }
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Facebook-Chat</title>
        <link rel="stylesheet" href="css/Style.css" type="text/css" />
    </head>
    <body class="login">
        <!-- header starts here -->
        <div id="facebook-Bar">
            <div id="facebook-Frame">
                <div id="logo"> <a href="#"><img class="flo" src="Img/ss.PNG"></a> </div>
                <div id="header-main-right">
                    <div id="header-main-right-nav">
                        <form method="post" action="login" id="login_form" name="login_form">
                            <table border="0" style="border:none">
                                <tr>
                                    <td ><input type="text" tabindex="1"  id="email" placeholder="Email or Phone" name="email" class="inputtext radius1" value=""></td>
                                    <td ><input type="password" tabindex="2" id="pass" placeholder="Password" name="password" class="inputtext radius1" ></td>
                                    <td ><input type="submit" class="fbbutton" name="" value="Login" /></td>
                                </tr>
                                <tr>
                                    <td><label><input id="persist_box" type="checkbox"  value="1" checked="1"/><span style="color:#ccc;">Keep me logged in</span></label>
                                    </td>
                                    <td><label><a href="" style="color:#ccc; text-decoration:none">forgot your password?</a></label></td>
                                </tr>
                            </table>
                        </form>
                    </div>
                </div>
            </div>
        </div>
        <div><img class="aaa" src="Img/lofg.png"></div>
       
        <!-- header ends here -->
        <div class="loginbox radius">
            <h2 class="form-head">Create an account</h2>
            <div class="loginboxinner radius">
                <div class="loginheader">
                    <h4 class="title">It's free and always will be.</h4>
                </div><!--loginheader-->

                <div class="loginform">

                    <form id="login" action="register" method="post">
                        <p>
                            <input type="text" id="username" name="firstName" placeholder="First Name" value="" class="radius mini" /> 
                            <input type="text" id="username" name="sirName" placeholder="Last Name" value="" class="radius mini" />
                        </p>
                        <p>
                            <input type="text" id="email" name="email" placeholder="Your Email" value="" class="radius" />
                        </p>
                        <p>
                            <input type="text" id="password" name="emailV" placeholder="Re-enter Email" class="radius" />
                        </p>
                        <p>
                            <input type="password" id="password" name="password" placeholder="New Password" class="radius" />
                        </p>
                        <p>
                            <button class="radius title" name="client_login">Sign Up for Facebook</button>
                        </p>
                    </form>
                </div><!--loginform-->
            </div><!--loginboxinner-->
        </div><!--loginbox-->


    </body>
</html>
