package com.fx.projet_ui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class ConnexionController  {
    @FXML
    private Button btn_connexion;
    @FXML
    private TextField email;
    @FXML
    private PasswordField password;
    @FXML
    private Label message;
    public void onConnexionButtonClick(){
        Stage con = new Stage();
        try {
            Parent fxml = FXMLLoader.load(getClass().getResource("Employe.fxml"));
            Scene scene2 = new Scene(fxml);
            con.setScene(scene2);
            con.setTitle("Employe ");
            con.show();
        }
        catch (IOException e){
            throw new RuntimeException(e);
        }
    }


}
