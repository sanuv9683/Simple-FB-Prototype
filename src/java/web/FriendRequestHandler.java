/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import controller.UserController;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.DispatcherType;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import jdk.nashorn.internal.ir.RuntimeNode;
import model.User;

/**
 *
 * @author Sanu Vithanage
 */
public class FriendRequestHandler extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        UserController ctrlUser = new UserController((ArrayList<User>) getServletContext().getAttribute("users"));
        User currentUser = (User) req.getSession(false).getAttribute("user");

        if (currentUser == null) {
            resp.sendRedirect("index.jsp");
            return;
        }

        switch (req.getParameter("type")) {

            case "request":
                User user = ctrlUser.searchUser(req.getParameter("mail"));
                user = ctrlUser.searchUser(req.getParameter("mail"));
                ctrlUser.sendFriendRequest(user, currentUser);

                resp.sendRedirect("dashBoard.jsp");
                return;

            case "accept":

                user = ctrlUser.searchUser(req.getParameter("mail"));
                ctrlUser.accepetFriendRequest(currentUser, user);
                resp.sendRedirect("dashBoard.jsp");
                return;
        }

    }

}
