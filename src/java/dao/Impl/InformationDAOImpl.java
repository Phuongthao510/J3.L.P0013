/*
 * J3.L.P0013
 * Sushi
 *
 *Record of change:
 *DATE                  Version             AUTHOR                  DESCRIPTION
 *2021-02-21             1.0                ThaoHP                First implement
 */
package dao.Impl;

import dao.InformationDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import entity.Information;

/**
 * This class contains method implement from interface class InformationDAO The
 * method will throw an object of <code>java.lang.Exception</code> class if
 * there is any error occurring when finding data
 *
 * @author Nam Ngoc
 */
public class InformationDAOImpl extends BaseDAO implements InformationDAO {

    /**
     * This method get Information from database
     *
     * @return Information
     * @throws Exception Exception when do method
     */
    @Override
    public Information getInformation() throws Exception {
        String sql = "SELECT * FROM dbo.Information";
        Connection con = null;
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            con = getConnection();
            st = con.prepareStatement(sql);
            rs = st.executeQuery();
            if (rs.next()) {
                Information i = new Information();
                i.setDescription(rs.getString("description"));
                i.setAddress(rs.getString("address"));
                i.setEmail(rs.getString("email"));
                i.setPhone(rs.getString("phone"));
                i.setOpenHours(rs.getString("openingHours"));
                return i;
            }
        } catch (Exception ex) {
            throw ex;
        } finally {
            closeResultSet(rs);
            closePreparedStatement(st);
            closeConnection(con);
        }
        return null;
    }
}
