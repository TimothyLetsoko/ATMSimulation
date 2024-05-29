package Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class Login {
    @FXML
    private Label lblErrorMsg;

    @FXML
    private PasswordField pfPIN;

    @FXML
    private TextField tfCardNumber;

    @FXML
    void clearFields() {
        pfPIN.clear();
        tfCardNumber.clear();
    }

    @FXML
    void signIn(ActionEvent event) throws IOException {
        String cardNumber = "1";
        String PIN = "1";

        if(pfPIN.getText().equals(PIN) && tfCardNumber.getText().equals(cardNumber)){
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/Screens/Home.fxml")));
            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setResizable(false);
            stage.setScene(scene);
            stage.setTitle("Welcome");
            stage.show();
        }else{
            lblErrorMsg.setText("Unauthorized User!!!");
        }
    }

}
