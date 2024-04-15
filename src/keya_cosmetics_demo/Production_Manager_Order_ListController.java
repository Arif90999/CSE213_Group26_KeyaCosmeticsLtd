/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package keya_cosmetics_demo;

import java.io.IOException;
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
public class Production_Manager_Order_ListController implements Initializable {

    @FXML
    private TableView<?> OrderListTable;
    @FXML
    private TableColumn<?, ?> OrderIdTableColumn;
    @FXML
    private TableColumn<?, ?> OrderQuantityColumn;
    @FXML
    private TableColumn<?, ?> TotalPriceColumn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void OrderListButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void ReturnToDashBoardOnClick(ActionEvent event)throws IOException {
    
}
}