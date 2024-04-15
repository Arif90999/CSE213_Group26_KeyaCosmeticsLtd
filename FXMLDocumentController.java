/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package customersecuritypg;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

/**
 *
 * @author sadaf
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private Label profileLabel;
    @FXML
    private Label securityLabel;
    @FXML
    private Label cartLabel;
    @FXML
    private PasswordField passwordTextField;
    @FXML
    private TextField usernameTextField;
    @FXML
    private Button applyButton;
    @FXML
    private Button changeUsernameButton;
    @FXML
    private Button changePasswordButton;
    @FXML
    private Button deleteAccountButton;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void returnLabelColor(MouseEvent event) {
    }

    @FXML
    private void blueLabelOnHover(MouseEvent event) {
    }

    @FXML
    private void switchToSecurityScene(MouseEvent event) {
    }

    @FXML
    private void switchToCartSceneFromLabel(MouseEvent event) {
    }

    @FXML
    private void switchToOrderSceneFromLabel(MouseEvent event) {
    }

    @FXML
    private void deleteAccountButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void changeUsername(ActionEvent event) {
    }

    @FXML
    private void changePasswordButtonOnClick(ActionEvent event) {
    }
    
}
