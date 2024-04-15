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
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class Production_Maneger_dashboardController implements Initializable {

    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void UpdateOrderStatusButtonOnClick(ActionEvent event)  throws IOException {
          // Load the new FXML document{new scene Switch Code}
    FXMLLoader loader = new FXMLLoader(getClass().getResource("Production_Manager_Update_Order_Status.fxml"));
        Object root = loader.load();
    
    // Get the current scene's window (stage)
    Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    
        // Create a new scene with the loaded root
        Scene scene = new Scene((Parent) root);
    
    // Set the stage's scene to the new scene and show it
    stage.setScene(scene);
    stage.show();
        
        
    }

    @FXML
    private void ApplyForLeaveButtonOnClick(ActionEvent event) throws IOException {
         FXMLLoader loader = new FXMLLoader(getClass().getResource("Production_Manager_Apply_For_Leave.fxml"));
        Object root = loader.load();

       
       Stage stage = new Stage();
        Scene scene = new Scene((Parent) root);
       stage.setScene(scene);
       stage.show();
        
        
        
    }

    @FXML
    private void ViewAndPostAnnouncementButtonOnClick(ActionEvent event) throws IOException {
         FXMLLoader loader = new FXMLLoader(getClass().getResource("Production_Manager_Views_And_Post_Announcements.fxml"));
        Object root = loader.load();

       
       Stage stage = new Stage();
        Scene scene = new Scene((Parent) root);
       stage.setScene(scene);
       stage.show();
        
        
        
    }
    @FXML
    private void CurrentProductionButtonOnClick(ActionEvent event) throws IOException {
         FXMLLoader loader = new FXMLLoader(getClass().getResource("Production_Manager_Current_Production_Unit.fxml"));
        Object root = loader.load();

       
       Stage stage = new Stage();
        Scene scene = new Scene((Parent) root);
       stage.setScene(scene);
       stage.show();
        
        
        
    }

    @FXML
    private void ProductionTargetButtonOnClick(ActionEvent event)throws IOException {
         FXMLLoader loader = new FXMLLoader(getClass().getResource("Production_Manager_Production_Target.fxml"));
        Object root = loader.load();

       
       Stage stage = new Stage();
        Scene scene = new Scene((Parent) root);
       stage.setScene(scene);
       stage.show();
        
        
        
    }

    @FXML
    private void OrderListButtonOnClick(ActionEvent event) throws IOException {
         FXMLLoader loader = new FXMLLoader(getClass().getResource("Production_Manager_Order_List.fxml"));
        Object root = loader.load();

       
       Stage stage = new Stage();
        Scene scene = new Scene((Parent) root);
       stage.setScene(scene);
       stage.show();
        
        
        
    }

    @FXML
    private void levelsOfRawMaterialsButtonONClick(ActionEvent event) throws IOException {
         FXMLLoader loader = new FXMLLoader(getClass().getResource("Production_Manager_Levels_Of_Raw_Materials.fxml"));
        Object root = loader.load();

       
       Stage stage = new Stage();
        Scene scene = new Scene((Parent) root);
       stage.setScene(scene);
       stage.show();
        
        
        
    }

    @FXML
    private void ProductionScheduleButtonOnClick(ActionEvent event) throws IOException {
         FXMLLoader loader = new FXMLLoader(getClass().getResource("Production_Manager_Production_Schedule.fxml"));
        Object root = loader.load();

       
       Stage stage = new Stage();
        Scene scene = new Scene((Parent) root);
       stage.setScene(scene);
       stage.show();
        
        
        
    }
    
}
