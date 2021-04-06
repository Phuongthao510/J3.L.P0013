/*
 * J3.L.P0013
 * Sushi
 *
 *Record of change:
 *DATE                  Version             AUTHOR                  DESCRIPTION
 *2021-02-21             1.0                ThaoHP                First implement
 */
package dao;

import java.util.ArrayList;
import entity.Menu;

/**
 * This class contains method find menu of sushi from Menu table in database The
 * method will throw an object of <code>java.lang.Exception</code> class if
 * there is any error occurring when finding data
 *
 * @author Five Swag
 */
public interface MenuDAO {

    /**
     * get the menus by page from database
     *
     * @param pageIndex
     * @param pageSize
     * @return List of menu
     * @throws Exception Exception when do method
     */
    public ArrayList<Menu> getMenus(int pageIndex, int pageSize) throws Exception;

    /**
     * get total menu in database
     *
     * @return number of menu
     * @throws Exception Exception when do method
     */
    public int getTotalMenus() throws Exception;
}
