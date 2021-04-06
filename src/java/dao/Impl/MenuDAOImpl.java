/*
 * J3.L.P0013
 * Sushi
 *
 *Record of change:
 *DATE                  Version             AUTHOR                  DESCRIPTION
 *2021-02-21             1.0                ThaoHP                First implement
 */
package dao.Impl;

import dao.MenuDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import entity.Menu;

/**
 * This class contains method implement from interface class MenuDAO The method
 * will throw an object of <code>java.lang.Exception</code> class if there is
 * any error occurring when finding data
 *
 * @author Nam Ngoc
 */
public class MenuDAOImpl extends BaseDAO implements MenuDAO {

    /**
     * get the menus by page from database
     *
     * @param pageIndex
     * @param pageSize
     * @return List of menu
     * @throws Exception Exception when do method
     */
    @Override
    public ArrayList<Menu> getMenus(int pageIndex, int pageSize) throws Exception {
        ArrayList<Menu> menus = new ArrayList<>();
        String sql = "WITH r AS (\n"
                + "SELECT ROW_NUMBER() OVER (ORDER BY id DESC) rownum, * "
                + "FROM dbo.Menu\n"
                + ")\n"
                + "SELECT * FROM r "
                + "WHERE r.rownum >= (? - 1) * ? + 1 AND r.rownum <= ? * ?";
        Connection con = null;
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            con = getConnection();
            st = con.prepareStatement(sql);
            st.setInt(1, pageIndex);
            st.setInt(2, pageSize);
            st.setInt(3, pageIndex);
            st.setInt(4, pageSize);
            rs = st.executeQuery();
            while (rs.next()) {
                Menu m = new Menu();
                m.setId(rs.getInt("id"));
                m.setName(rs.getString("name"));
                m.setContent(rs.getString("content"));
                m.setDescription(rs.getString("description"));
                m.setPrice(rs.getFloat("price"));
                menus.add(m);
            }
        } catch (Exception ex) {
            throw ex;
        } finally {
            closeResultSet(rs);
            closePreparedStatement(st);
            closeConnection(con);
        }
        return menus;
    }

    /**
     * get total menu in database
     *
     * @return number of menu
     * @throws Exception Exception when do method
     */
    @Override
    public int getTotalMenus() throws Exception {
        String sql = "SELECT COUNT(*) total FROM dbo.Menu";
        Connection con = null;
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            con = getConnection();
            st = con.prepareStatement(sql);
            rs = st.executeQuery();
            return (rs.next() ? rs.getInt("total") : -1);
        } catch (Exception ex) {
            throw ex;
        } finally {
            closeResultSet(rs);
            closePreparedStatement(st);
            closeConnection(con);
        }
    }
}
