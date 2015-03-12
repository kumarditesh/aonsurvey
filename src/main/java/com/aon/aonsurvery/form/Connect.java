package com.aon.aonsurvery.form;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {

    Connection con = null;

    public static Connection ConnectDB() {
        String dataSourceName = "AonSurvey";
        String dbURL = "jdbc:odbc:" + dataSourceName;
        try {

            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection con = DriverManager.getConnection(dbURL, "", "");
            return con;

        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return null;

        }
    }
}
