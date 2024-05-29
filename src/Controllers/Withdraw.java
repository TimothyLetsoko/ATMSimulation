package Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;
import java.util.ResourceBundle;

public class Withdraw implements Initializable {
    @FXML
    private Label lblDate;

    @FXML
    private Label lblResponse;

    @FXML
    private TextField tfWithdrawalAmount;

    @FXML
    void backToWelcomeScreen(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/Screens/Home.fxml")));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setResizable(false);
        stage.setScene(scene);
        stage.setTitle("Welcome");
        stage.show();
    }

    @FXML
    void clearWithdrawalAmount() {
        lblResponse.setText("");
        tfWithdrawalAmount.clear();
        tfWithdrawalAmount.setPromptText("R 100.00");
    }

    @FXML
    void hideResponseMsg() {
        lblResponse.setText("");
    }

    @FXML
    void withdrawMoney() {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        lblDate.setText(localDateTime.format(dateTimeFormatter));
    }
}
