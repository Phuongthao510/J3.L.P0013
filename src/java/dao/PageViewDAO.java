/*
 * J3.L.P0013
 * Sushi
 *
 *Record of change:
 *DATE                  Version             AUTHOR                  DESCRIPTION
 *2021-02-21             1.0                ThaoHP                First implement
 */
package dao;

/**
 * This class contains method find PageView of page from PageView table in
 * database The method will throw an object of <code>java.lang.Exception</code>
 * class if there is any error occurring when finding data
 *
 * @author Five Swag
 */
public interface PageViewDAO {

    /**
     * This method get the page view of page
     *
     * @param name
     * @return number of pageview
     * @throws Exception Exception when do method
     */
    public int getPageView(String name) throws Exception;

    /**
     * This method update the pageview inpage
     *
     * @param name
     * @param value
     * @throws Exception Exception when do method
     */
    public void updatePageView(String name, int value) throws Exception;
}
