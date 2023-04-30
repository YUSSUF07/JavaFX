package com.fx.projet_ui;

import java.sql.*;

public class DBConnection {
    private Connection connection;
    private PreparedStatement preparedStatement;
    private ResultSet resultSet;
    private int succes;

    String url="jdbc:mysql://loclahost:3306/java_fx";
    String user = "root";
    String password="";
    private Connection getConnection()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url,user,password);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return connection;
    }
    public void initPrepar(String sql){
        try {
            getConnection();
            preparedStatement=connection.prepareStatement(sql);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    public ResultSet executeSelect(){
        resultSet = null;
        try{
            resultSet=preparedStatement.executeQuery();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return resultSet;
    }
    public int executeMaj(){
        try{
            succes=preparedStatement.executeUpdate();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return succes;
    }
    public void closeConnection() {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public PreparedStatement getPreparedStatement()
    {
        return preparedStatement;
    }

}

