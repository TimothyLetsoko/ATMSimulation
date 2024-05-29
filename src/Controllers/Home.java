package Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;
import java.util.ResourceBundle;

public class Home implements Initializable {
    Parent root;
    Stage stage;
    Scene scene;
    @FXML
    private Label lblDate;

    @FXML
    void deposit() {

    }

    @FXML
    void exit(ActionEvent event) throws IOException {
        operations(event, "Login","ATM Simulation");
    }

    @FXML
    void options() {

    }

    @FXML
    void printStatement() {

    }

    @FXML
    void showBalance() {

    }

    @FXML
    void withdraw(ActionEvent event) throws IOException {
        operations(event,"withdraw","Withdraw");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        lblDate.setText(localDateTime.format(dateTimeFormatter));
    }
    void operations(ActionEvent event, String screen, String screenTitle) throws IOException {
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/Screens/"+screen+".fxml")));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setResizable(false);
        stage.setScene(scene);
        stage.setTitle(screenTitle);
        stage.show();
    }
}
