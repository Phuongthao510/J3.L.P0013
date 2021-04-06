/*
 * J3.L.P0013
 * Sushi
 *
 *Record of change:
 *DATE                  Version             AUTHOR                  DESCRIPTION
 *2021-02-21             1.0                ThaoHP                First implement
 
 */
package controller;

import dao.Impl.MenuDAOImpl;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import entity.Menu;

/**
 * This class contain method to display menu page
 *
 * @author Nam Ngoc
 */
public class MenuController extends HttpServlet {

    /**
     * This method to load data from database to menu page and perform paging
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
            request.setAttribute("menuBold", "text-bold");
            String page = request.getParameter("page");
            page = (page == null || page.trim().isEmpty() ? "1" : page);
            MenuDAOImpl menuDB = new MenuDAOImpl();
            int totalMenus = menuDB.getTotalMenus();
            //if do not exits any menu, catch exception and request error page
            if (totalMenus <= 0) {
                error = "Not Found!";
                throw new Exception();
            }
            final int pageSize = 3;
            int pageIndex = Integer.parseInt(page);
            int totalPages = (totalMenus % pageSize == 0) ? (totalMenus / pageSize) : (totalMenus / pageSize + 1);
            ArrayList<Menu> menus = menuDB.getMenus(pageIndex, pageSize);
            request.setAttribute("totalPages", totalPages);
            request.setAttribute("menus", menus);
            request.setAttribute("pageIndex", pageIndex);
            request.getRequestDispatcher("menu.jsp").forward(request, response);
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
