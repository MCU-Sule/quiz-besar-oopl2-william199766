package com.william.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author william
 */
public class conutil {

    public static final String URL = "jdbc:mysql//localhost:3306/pbo220182";
    public static final String UserName = "root";
    public static final String PASSWORD = "";

    public static Connection createConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(URL, UserName,
                    PASSWORD);
            return conn;
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(conutil.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
        return null;

    }

}
