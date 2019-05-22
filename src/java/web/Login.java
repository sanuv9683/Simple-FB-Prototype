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
public class Login extends HttpServlet {

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.sendRedirect("index.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        PrintWriter out = response.getWriter();
        try {
            String email = request.getParameter("email");
            String password = request.getParameter("password");

            if (email == "" || password == "") {
                request.getRequestDispatcher("/index.jsp").forward(request, response);
                return;
            }

            ServletContext appContext = getServletContext();

            ArrayList<User> currentUsers = (ArrayList<User>) appContext.getAttribute("users");
            if (currentUsers == null) {
                request.getRequestDispatcher("/index.jsp").forward(request, response);
                return;
            }
            UserController ctrlUsers = new UserController(currentUsers);
            User user;
            if ((user = ctrlUsers.searchUser(email)) != null) {

                if (user.getPassword().equals(password)) {

                    HttpSession newSession = request.getSession();

                    newSession.setAttribute("user", user);

                    appContext.getRequestDispatcher("/dashBoard.jsp").forward(request, response);
                }

            }
        } finally {
            out.close();
        }

    }

   
}
