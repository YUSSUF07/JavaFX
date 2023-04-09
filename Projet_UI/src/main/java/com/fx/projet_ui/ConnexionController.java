package com.fx.projet_ui;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class ConnexionController {
    @FXML
    private Button btn_connexion;
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
