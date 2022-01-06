/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.william.controller;

import com.william.MainApp;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author william
 */
public class LoginformController implements Initializable {

    @FXML
    private GridPane root;
    @FXML
    private TextField textusername;
    @FXML
    private PasswordField txtpasswort;
    private Stage mainSTAGE;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void signinaction(ActionEvent event) {
        if (textusername.getText().trim().equals("william")
                && txtpasswort.getText().equals("1672036")) {
            if (mainSTAGE == null) {
                try {
                    FXMLLoader loader = new FXMLLoader();
                    loader.setLocation(MainApp.class.getResource(
                            "view/MainForm.fxml"));
                    BorderPane pane = loader.load();

                    Scene scene = new Scene(pane);
                    mainSTAGE = new Stage();
                    mainSTAGE.setScene(scene);
                    mainSTAGE.setTitle(" JAVAFX Stage ");
                    ((Stage) root.getScene().getWindow()).close();
                } catch (IOException ex) {
                    Logger.getLogger(LoginformController.class.getName()).
                            log(Level.SEVERE, null, ex);
                }

            }
            mainSTAGE.show();
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("silahkan isi username/passwort yang benar");
            alert.showAndWait();
        }
    }

}
