package com.fx.projet_ui;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class AcceuilController {
    @FXML
    private Button btn_client;
    @FXML
    private Button btn_employe;


    public void onConnexionButtonClick()
    {
        Stage employe = new Stage();
        try{
            Parent fxml = FXMLLoader.load(getClass().getResource("Connexion.fxml"));
            Scene scene1 = new Scene(fxml);
            employe.setScene(scene1);
            employe.setTitle("Employe");
            employe.show();
        }
        catch (IOException e){
            throw new RuntimeException(e);
        }
    }
    public void onClientButtonClick(){
        Stage client = new Stage();
        try{
            Parent fxml = FXMLLoader.load(getClass().getResource("Client.fxml"));
            Scene scene1 = new Scene(fxml);
            client.setScene(scene1);
            client.setTitle("Employe");
            client.show();
        }
        catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
