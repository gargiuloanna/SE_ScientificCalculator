/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se_scientificcalculator;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

/**
 *
 * @author Anna
 */
public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private TextField addTextfiled;
    @FXML
    private ListView<?> cronologia;
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World hello!!");
        label.setText("Hello World hello hello!!");
        label.setText("prova luigina!!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void prodButton(ActionEvent event) {
    }

    @FXML
    private void subButton(ActionEvent event) {
    }

    @FXML
    private void addButton(ActionEvent event) {
    }

    @FXML
    private void invButton(ActionEvent event) {
    }

    @FXML
    private void sqrtButton(ActionEvent event) {
    }

    @FXML
    private void divButton(ActionEvent event) {
    }

    @FXML
    private void dupButton(ActionEvent event) {
    }

    @FXML
    private void dropButton(ActionEvent event) {
    }

    @FXML
    private void clearButton(ActionEvent event) {
    }

    @FXML
    private void overButton(ActionEvent event) {
    }

    @FXML
    private void swapButton(ActionEvent event) {
    }

    @FXML
    private void addOperand(ActionEvent event) {
    }
    
}
