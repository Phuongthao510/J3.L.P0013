/*
 * J3.L.P0013
 * Sushi
 *
 *Record of change:
 *DATE                  Version             AUTHOR                  DESCRIPTION
 *2021-02-21             1.0                ThaoHP                First implement
 */
package listener;

import dao.Impl.PageViewDAOImpl;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * This class contains methods to control when create and destroy a session
 * listener
 *
 * @author Nam Ngoc
 */
public class SessionListenerCountView implements HttpSessionListener {

    /**
     * This class perform count page view
     *
     * @param se
     */
    @Override
    public void sessionCreated(HttpSessionEvent se) {
        try {
            PageViewDAOImpl pageViewDB = new PageViewDAOImpl();
            int views = pageViewDB.getPageView("pageView");
            pageViewDB.updatePageView("pageView", ++views);
            se.getSession().setAttribute("views", views);
        } catch (Exception ex) {
            Logger.getLogger(SessionListenerCountView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
    }
}
