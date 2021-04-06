/*
 * J3.L.P0013
 * Sushi
 *
 *Record of change:
 *DATE                  Version             AUTHOR                  DESCRIPTION
 *2021-02-21             1.0                ThaoHP                First implement
 */
package dao.Impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Nam Ngoc
 */
public abstract class BaseDAO {

//    public Connection getConnection() throws Exception {
//        String url = "jdbc:sqlserver://localhost;database=Maria;"
//                + "integratedSecurity=true;";
//        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//        return DriverManager.getConnection(url);
//    }
    public Connection getConnection() throws Exception {
        String user = "sa";
        String pass = "123";
        String url = "jdbc:sqlserver://localhost:1433;databaseName=TestSuShi3";
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        return DriverManager.getConnection(url, user, pass);
    }

    public void closeResultSet(ResultSet rs) throws SQLException {
        if (rs != null && !rs.isClosed()) {
            rs.close();
        }
    }

    public void closePreparedStatement(PreparedStatement st) throws SQLException {
        if (st != null && !st.isClosed()) {
            st.close();
        }
    }

    public void closeConnection(Connection con) throws SQLException {
        if (con != null && !con.isClosed()) {
            con.close();
        }
    }

    public String getImgPath() {
        return "resources/img/";
    }
}
