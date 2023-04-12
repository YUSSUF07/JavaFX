package com.fx.projet_ui;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class dbConnection {

    public static Connection connection() {
        try {
            String url = "jdbc:mysql://localhost/3306/java_fx";
            String username = "root";
            String password = "";
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, username, password);
            return con;
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }
}


/*public class dbConnection {

    private static dbConnection instance;
    private Connection connection;
    private String url = "jdbc:mysql://localhost:3306/java_fx";
    private String username = "root";
    private String password = "";

    public dbConnection() throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.connection = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException ex) {
            System.out.println("Database Connection Creation Failed : " + ex.getMessage());
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public static dbConnection getInstance() throws SQLException {
        if (instance == null) {
            instance = new dbConnection();
        } else if (instance.getConnection().isClosed()) {
            instance = new dbConnection();
        }

        return instance;
    }
}*/