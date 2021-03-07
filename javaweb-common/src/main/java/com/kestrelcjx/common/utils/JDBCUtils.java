package com.kestrelcjx.common.utils;

import com.kestrelcjx.common.config.DbConfig;

import java.sql.*;

public class JDBCUtils {
    private JDBCUtils() {

    }

    // 驱动注册
    static {
        try {
            Class.forName(DbConfig.driver);
        } catch (ClassNotFoundException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    /**
     * 获取Connection
     *
     * @return
     * @throws SQLException
     */
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DbConfig.url, DbConfig.username, DbConfig.password);
    }

    /**
     * 释放资源
     *
     * @param connection
     * @param st
     * @param rs
     */
    public static void closeResource(Connection connection, Statement st, ResultSet rs) {
        closeResultSet(rs);
        closeStatement(st);
        closeConnection(connection);
    }

    /**
     * 释放结果集ResultSet
     *
     * @param rs
     */
    public static void closeResultSet(ResultSet rs) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        rs = null;
    }

    /**
     * 释放语句执行者Statement
     *
     * @param st
     */
    public static void closeStatement(Statement st) {
        if (st != null) {
            try {
                st.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        st = null;
    }

    /**
     * 释放连接Connection
     *
     * @param connection
     */
    public static void closeConnection(Connection connection) {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        connection = null;
    }
}
