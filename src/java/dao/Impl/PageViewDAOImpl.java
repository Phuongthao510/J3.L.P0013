/*
 * J3.L.P0013
 * Sushi
 *
 *Record of change:
 *DATE                  Version             AUTHOR                  DESCRIPTION
 *2021-02-21             1.0                ThaoHP                First implement
 */
package dao.Impl;

import dao.PageViewDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * This class contains method implement from interface class PageViewDAO The
 * method will throw an object of <code>java.lang.Exception</code> class if
 * there is any error occurring when finding data
 *
 * @author Nam Ngoc
 */
public class PageViewDAOImpl extends BaseDAO implements PageViewDAO {

    /**
     * This method get the page view of page
     *
     * @param name
     * @return number of pageview
     * @throws Exception Exception when do method
     */
    @Override
    public int getPageView(String name) throws Exception {
        String sql = "Select * from viewcount where name=?";
        Connection con = null;
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            con = getConnection();
            st = con.prepareStatement(sql);
            st.setString(1, name);
            rs = st.executeQuery();
            return (rs.next() ? rs.getInt("value") : -1);
        } catch (Exception ex) {
            throw ex;
        } finally {
            closeConnection(con);
            closePreparedStatement(st);
            closeConnection(con);
        }
    }

    /**
     * This method update the pageview inpage
     *
     * @param name
     * @param value
     * @throws Exception Exception when do method
     */
    @Override
    public void updatePageView(String name, int value) throws Exception {
        String sql = "UPDATE dbo.ViewCount\n"
                + "SET value = ?\n"
                + "WHERE name = ?";
        Connection con = null;
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            con = getConnection();
            st = con.prepareStatement(sql);
            st.setInt(1, value);
            st.setString(2, name);
            st.executeUpdate();
        } catch (Exception ex) {
            throw ex;
        } finally {
            closeResultSet(rs);
            closePreparedStatement(st);
            closeConnection(con);
        }
    }

}
