/*
 * J3.L.P0013
 * Sushi
 *
 *Record of change:
 *DATE                  Version             AUTHOR                  DESCRIPTION
 *2021-02-21             1.0                ThaoHP                First implement
 */
package dao.Impl;

import dao.PostDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import entity.Post;

/**
 * This class contains method implement from interface class PageViewDAO The
 * method will throw an object of <code>java.lang.Exception</code> class if
 * there is any error occurring when finding data
 *
 * @author Nam Ngoc
 */
public class PostDAOImpl extends BaseDAO implements PostDAO {

    /**
     * This method get the lastest post
     *
     * @return the lastest post
     * @throws Exception Exception when do method
     */
    @Override
    public Post getLatestPost() throws Exception {
        String sql = "SELECT TOP (1) * FROM dbo.Post ORDER BY id DESC";
        Connection con = null;
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            con = getConnection();
            st = con.prepareStatement(sql);
            rs = st.executeQuery();
            //if rs is not latest then get a post
            if (rs.next()) {
                Post p = new Post();
                p.setId(rs.getInt("id"));
                p.setTitle(rs.getString("title"));
                p.setContent(rs.getString("content"));
                p.setDescription(rs.getString("description"));
                p.setImage(getImgPath() + rs.getString("image"));
                return p;
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

    /**
     * This method get the post by id
     *
     * @param id
     * @return the post
     * @throws Exception Exception when do method
     */
    @Override
    public Post getPostByID(int id) throws Exception {
        String sql = "SELECT * FROM dbo.Post WHERE id = ?";
        Connection con = null;
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            con = getConnection();
            st = con.prepareStatement(sql);
            st.setInt(1, id);
            rs = st.executeQuery();
            //if rs is not latest then get a post 
            if (rs.next()) {
                Post p = new Post();
                p.setId(rs.getInt("id"));
                p.setTitle(rs.getString("title"));
                p.setContent(rs.getString("content"));
                p.setDescription(rs.getString("description"));
                p.setImage(getImgPath() + rs.getString("image"));
                return p;
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
