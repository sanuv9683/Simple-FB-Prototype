<%-- 
    Document   : dashBoard
    Created on : May 22, 2017, 10:50:15 AM
    Author     : Sanu Vithanage
--%>

<%@page import="model.Messages"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.User"%>
<%
    String clikedEmail = "";
    String mail = (String) request.getAttribute("mail");
    if (mail != null) {
        clikedEmail = mail;
    }

    ArrayList<User> currentUsers = (ArrayList<User>) application.getAttribute("users");

    if (currentUsers == null) {
        response.sendRedirect("index.jsp");
        return;
    }

    HttpSession currentSession = request.getSession(false);

    if (currentSession.isNew()) {
        response.sendRedirect("index.jsp");
        return;
    }

    User user = (User) currentSession.getAttribute("user");
    if (user == null) {
        response.sendRedirect("index.jsp");
        return;
    }

%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sanu-FB-Prototype</title>
        <link rel="stylesheet" type="text/css" href="css/boostrap.css">
        <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="css/bootstrap-theme.css">
        <link rel="stylesheet" type="text/css" href="css/bootstrap-theme.min.css">
        <link rel="stylesheet" href="css/Style.css" type="text/css" />
    </head>
    <body>
        <%            String messageSender = null;
        %>
        <div id="facebook-Bar">
            <div id="home-top">
                <div id="logo"> <a href="#"><img class="dfd" src="Img/ss.PNG"></a> </div>

                <div id="header-main-right">

                </div>
            </div>
        </div>
        <div>

            <img class="noti" id="dsds"  src="Img/man-and-woman-avatar.png">
        </div>

        <div class="row">

            <div class="container-fluid">
                <div class="col-md-10 ssf bo">
                    <div class="row">
                        <div class="col-md-3 borderq">
                            <h3 id="opo" style="text-align: left;color: white;font-size: 20px">Your Friends</h3>

                            <%
                                for (User tempUser : user.getFriends()) {
                                    out.print("<li id='avF'><a id='pop' href='chat?to=" + tempUser.getEmail() + "'>" + tempUser.getFirstName() + " " + tempUser.getSurName() + "</a></li>");

                                }
                            %>

                        </div>

                        <div class="col-md-9">
                            <div class="userW"></div>
                            <img src="Img/camera.png" class="uploadI">
                            <div class="dp">
                                <img src="Img/user-icon-6.png" style="height: 140px;width: 140px;margin-left: 20px;margin-top: 20px" >
                                <img src="Img/camera.png" class="uploadI2">
                            </div>

                            <div class="userN">
                                <%
                                    out.print("<h2 id='userNa'>" + user.getFirstName() + " " + user.getSurName() + "</h2>");
                                %>
                            </div>
                            <div class="userW2"></div>
                        </div>
                    </div>
                </div>

                <div class="col-md-3 floatW" id="fwin" style="display: none">
                    <h1 style="font-size: 25px;"><u>Friend Requests</u></h1>

                    <%
                        for (User tempUser : user.getPendingRequests()) {
                            out.print("<li><a id='reqq' href=\"friend?type=accept&mail=" + tempUser.getEmail() + "\">" + tempUser.getFirstName() + " " + tempUser.getSurName() + "</a></li>");
                        }

                    %>

                </div>                   

                <div class="col-md-2 bo frd">
                    <h3 id="tsp" style="text-align: center;font-size:20px"><u>Registerd Users</u></h3>

                    <%                        for (User tempUser : currentUsers) {
                            if (!tempUser.equals(user)) {
                                out.print("<li id='rusers'><a id='rlist' href=\"friend?type=request&mail=" + tempUser.getEmail() + "\">" + tempUser.getFirstName() + " " + tempUser.getSurName() + "</a></li>");
                                messageSender = tempUser.getEmail();

                            }
                        }
                    %>

                </div>

                <div class="col-md-2" id="message">
                    <h3 id="tsp" style="text-align: left;font-size:25px"><u>Messages </u>&nbsp;  &nbsp;  &nbsp;  &nbsp;  &nbsp;  &nbsp;  &nbsp;  &nbsp;  &nbsp;
                        <span class="glyphicon glyphicon-envelope" style="font-size: 30px;"></span></h3>
                    <div class="form-group">
                        <form action="message">
                            <textarea class="form-control" id="tt" name="" >
                                <%
                                    for (Messages m : user.getMessageList()) {
                                        if (m.getFrom().equals(clikedEmail)) {
                                            for (String ss : m.getMessages()) {
                                                out.println(ss);
                                            }

                                        }
                                        if (m.getTo().equals(clikedEmail)) {
                                            for (String ss : m.getMessages()) {
                                                out.println(ss);
                                            }

                                        }

                                    }
                                %>
                            </textarea>
                        </form>
                    </div>
                    <form class="form-inline" action="message">
                        <div class="form-group">
                            <input type="text" name="from" value="<%=user.getEmail()%>" style="display: none">
                            <input type="text" name="to" value="<%=clikedEmail%>" style="display: none">
                            <input id="snd" class="form-control" name="tarea">
                            <input class="btn btn-primary" type="submit" value="Send">
                        </div>
                    </form>
                </div>


            </div>
        </div>
        <script src="js/jquery.js"></script>
        <script src="js/MyS.js"></script>
    </body>
</html>
