/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import controller.UserController;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.User;

/**
 *
 * @author Sanu Vithanage
 */
public class MessageSend extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        try {
            String from = req.getParameter("from");
            String parameter = req.getParameter("tarea");
            String to = req.getParameter("to");

            UserController ctrlUser = new UserController((ArrayList<User>) getServletContext().getAttribute("users"));
            User currentUser = (User) req.getSession(false).getAttribute("user");

            if (currentUser == null) {
                resp.sendRedirect("index.jsp");
                return;
            }

            User toU = ctrlUser.searchUser(to);
            User fromU = ctrlUser.searchUser(from);

            ctrlUser.SendMessage(toU, fromU, from + " : " + parameter);
            RequestDispatcher rd = req.getRequestDispatcher("/dashBoard.jsp");
            rd.forward(req, resp);
            return;

        } finally {
            out.close();
        }
    }

}
