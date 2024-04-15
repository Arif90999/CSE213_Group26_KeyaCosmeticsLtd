package keya_cosmetics_demo;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 */
public class LoginController implements Initializable {

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    // Arrays storing credentials and respective dashboard paths
    private String[] usernames = {"2030583", "2030584"};
    private String[] passwords = {"hrpass", "pmpass"};
    private String[] dashboardFiles = {"HR_DashBoard.fxml", "Production_Maneger_dashboard.fxml"};

    @FXML
    protected void handleLoginButtonAction(ActionEvent event) {
        String username = usernameField.getText();
        String password = passwordField.getText();

        // Check credentials and load the appropriate dashboard
        for (int i = 0; i < usernames.length; i++) {
            if (usernames[i].equals(username) && passwords[i].equals(password)) {
                loadDashboard(dashboardFiles[i]);
                return;
            }
        }
        
        // If no credentials matched
        showAlert(Alert.AlertType.ERROR, "Login Failed", "Invalid username or password.");
    }

    private void loadDashboard(String fxmlFile) {
        try {
            Parent dashboardRoot = FXMLLoader.load(getClass().getResource(fxmlFile));
            Scene dashboardScene = new Scene(dashboardRoot);
            Stage primaryStage = (Stage) usernameField.getScene().getWindow();
            primaryStage.setScene(dashboardScene);
        } catch (Exception e) {
            e.printStackTrace();
            showAlert(Alert.AlertType.ERROR, "Scene Switch Failed", "Could not load the scene: " + fxmlFile);
        }
    }

    private void showAlert(Alert.AlertType alertType, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Initialization code here, if any
    }
}