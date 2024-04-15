/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package keya_cosmetics_demo;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class Production_Manager_Levels_Of_Raw_MaterialsController implements Initializable {

    @FXML
    private TableView<?> RawMaterialsTable;
    @FXML
    private TableColumn<?, ?> ItemIdColumn;
    @FXML
    private TableColumn<?, ?> ItemNameColumn;
    @FXML
    private TableColumn<?, ?> ItemCostColumn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void ReturnToDashboardButtonOnClick(ActionEvent event) {
    }
    
}
