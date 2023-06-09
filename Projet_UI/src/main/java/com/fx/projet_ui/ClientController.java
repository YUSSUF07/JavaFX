package com.fx.projet_ui;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class ClientController {
    @FXML
    private Button btn_connexion;
    public void onConnexionButtonClick(){
        Stage con = new Stage();
        try {
            Parent fxml = FXMLLoader.load(getClass().getResource("client.fxml"));
            Scene scene2 = new Scene(fxml);
            con.setScene(scene2);
            con.setTitle("Client");
            con.show();
        }
        catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
