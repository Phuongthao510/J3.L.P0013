/*
 * J3.L.P0013
 * Sushi
 *
 *Record of change:
 *DATE                  Version             AUTHOR                  DESCRIPTION
 *2021-02-21             1.0                ThaoHP                First implement
 
 */
package controller;

import dao.Impl.PostDAOImpl;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import entity.Post;

/**
 * This class contain method to get detail of menu by id
 *
 * @author Nam Ngoc
 */
public class DetailController extends HttpServlet {

    /**
     * The method to load data from database to detail page
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String error = "Error Occured!";
        try {
            String pid = request.getParameter("id");
            PostDAOImpl postDb = new PostDAOImpl();
            int id = Integer.parseInt(pid);
            Post post = postDb.getPostByID(id);
            //if do not exist any post, catch exception and request error page
            if (post == null) {
                error = "Not Found!";
                throw new Exception();
            }
            request.setAttribute("post", post);
            request.getRequestDispatcher("detail.jsp").forward(request, response);
        } catch (Exception ex) {
            request.setAttribute("error", error);
            request.getRequestDispatcher("error.jsp").forward(request, response);
        }
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
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
