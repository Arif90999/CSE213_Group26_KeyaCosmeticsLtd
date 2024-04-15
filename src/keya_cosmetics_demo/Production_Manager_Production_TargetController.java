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
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class Production_Manager_Production_TargetController implements Initializable {

    @FXML
    private TableView<?> ProductionTable;
    @FXML
    private TableColumn<?, ?> ProductNameColumn;
    @FXML
    private TableColumn<?, ?> ProductionTargetColumn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void ViewProductionButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void ReturnToDashBoardBUttonOnClick(ActionEvent event) throws IOException {
         FXMLLoader loader = new FXMLLoader(getClass().getResource("Production_Maneger_dashboard.fxml"));
        Object root = loader.load();

       
       Stage stage = new Stage();
        Scene scene = new Scene((javafx.scene.Parent) root);
       stage.setScene(scene);
       stage.show();
        
        
        
   
    }
    
}
