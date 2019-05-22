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
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.User;

/**
 *
 * @author Sanu Vithanage
 */
public class RegisterServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // We don't handle HTTP Get request here at all here in this servelt
        resp.sendRedirect("index.jsp");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter out = resp.getWriter();
        try {
            //getting all the input data
            String firstName = req.getParameter("firstName");
            String lastName = req.getParameter("sirName");
            String email = req.getParameter("email");
            String emailv = req.getParameter("emailV");
            String password = req.getParameter("password");
            //geting the exxsisting user list for the context
            ServletContext application = getServletContext();
            ArrayList<User> currentUsers = (ArrayList<User>) application.getAttribute("users");
           
            if (currentUsers == null) {
                currentUsers = new ArrayList<User>();
                application.setAttribute("users", currentUsers);
            }

            UserController userCtrl = new UserController(currentUsers);
            boolean result = userCtrl.registerUser(firstName, lastName, email, password);

            if (result) {         
                HttpSession newSession = req.getSession();
                newSession.setAttribute("user", userCtrl.searchUser(email));

                application.getRequestDispatcher("/dashBoard.jsp").forward(req, resp);
                
            } else {
                resp.sendRedirect("/index.jsp");
            }

        } finally {
            out.close();
        }
    }

}
