/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author 672762
 */
public class ShoppingListServlet extends HttpServlet {

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

        getServletContext().getRequestDispatcher("/WEB-INF/register.jsp").forward(request, response);
        doEverything(request, response);

    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doEverything(request, response);
    }

    private void doEverything(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String action = null;
        HttpSession session = request.getSession();
        
        
        //String user = (String) session.getAttribute("user");
        //String user = request.getParameter("user");
        String item = request.getParameter("item");
        //String action = request.getParameter("action");

        if (session.getAttribute("user") == null && action == null) {
            getServletContext().getRequestDispatcher("/WEB-INF/register.jsp").forward(request, response);
            return;
            
        } else if (session.getAttribute("user") != null) {

            request.setAttribute("user", session.getAttribute("user"));
            //request.setAttribute("welcomeMessage", "Welcome " + user + "! " + "<a href='shoppinglist?register'>Log out</a>");
            getServletContext().getRequestDispatcher("/WEB-INF/shoppinglist.jsp").forward(request, response);
        }
        
        if(action.equals("register")) {
            
            String user = request.getParameter("user");
            session.setAttribute("user", user);
            response.sendRedirect("ShoppingList");
            
        } else if (action.equals("logout")) {

            session.invalidate();
            request.setAttribute("message", "Successfully logged out.");
            getServletContext().getRequestDispatcher("/WEB-INF/register.jsp").forward(request, response);
            return;
        }

        if(action != null) {
            
        }
//            if (action.equals("add")){ 
//               
//                request.setAttribute("showItem", "<input type='radio'>" + item);
//            } 
//          else if (action.equals("delete")){ 
//            // to do rest of code..
//        } 
        getServletContext().getRequestDispatcher("/WEB-INF/shoppinglist.jsp").forward(request, response);
    }

}
