/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.william.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author william
 */
public class BookFromcontroller implements Initializable {

    @FXML
    private TextField txtIsbn;
    @FXML
    private TextField txtTitle;
    @FXML
    private TextField txtAuthor;
    @FXML
    private TextField txtPublisher;
    @FXML
    private TextField txtPublishYear;
    @FXML
    private TextField txtPublishcity;
    @FXML
    private DatePicker txtPublishDate;
    @FXML
    private ComboBox<?> ComboGenre;
    @FXML
    private TableView<?> tablebook;
    @FXML
    private TableColumn<?, ?> col01;
    @FXML
    private TableColumn<?, ?> col02;
    @FXML
    private TableColumn<?, ?> col03;
    @FXML
    private TableColumn<?, ?> col04;
    @FXML
    private TableColumn<?, ?> col05;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void saveAction(ActionEvent event) {
    }

    @FXML
    private void risetAction(ActionEvent event) {
    }

}
