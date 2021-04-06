/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listener;

import dao.Impl.PageViewDAOImpl;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Web application lifecycle listener.
 *
 * @author Five Swag
 */
public class Listent implements HttpSessionListener {

    @Override
    public void sessionCreated(HttpSessionEvent se) {
//        try {
//            PageViewDAOImpl pageViewDB = new PageViewDAOImpl();
//            int views = pageViewDB.getPageView("pageView");
//            pageViewDB.updatePageView("pageView", ++views);
//            se.getSession().setAttribute("views", views);
//        } catch (Exception ex) {
//            Logger.getLogger(SessionListenerCountView.class.getName()).log(Level.SEVERE, null, ex);
//        }
        try {
            PageViewDAOImpl pageViewDB = new PageViewDAOImpl();
            int views = pageViewDB.getPageView("pageView");
            pageViewDB.updatePageView("pageView",++ views);
            se.getSession().setAttribute("views", views);
        } catch (Exception ex) {
            Logger.getLogger(SessionListenerCountView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
    }
}
