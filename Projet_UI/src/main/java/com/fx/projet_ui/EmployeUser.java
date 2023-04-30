package com.fx.projet_ui;

import com.fx.projet_ui.Modeles.EMPLOYE;

import java.sql.ResultSet;

public class EmployeUser implements IUser{
private DBConnection dbConnection = new DBConnection();

    @Override
    public EMPLOYE seConnecter(String code_user, String password) {
        EMPLOYE employe = null;
        String sql = "SELECT code_user, password FROM EMPLOYE WHERE code_user=? AND password=?";
        try{
            dbConnection.initPrepar(sql);
            dbConnection.getPreparedStatement().setString(1, code_user);
            dbConnection.getPreparedStatement().setString(2,password);
            ResultSet resultSet = dbConnection.executeSelect();
            if(resultSet.next()){
                employe = new EMPLOYE();
                employe.setCode_user(resultSet.getString("code_user"));
                employe.setPassword(resultSet.getString("password"));
            }
            dbConnection.closeConnection();
        }catch (Exception e){
            e.printStackTrace();
        }
        return employe;
    }
}
