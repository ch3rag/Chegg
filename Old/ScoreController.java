import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ScoreController extends Application {
    @FXML
    private Button btn_Calculate;
    @FXML
    private TextField text_Score1;
    @FXML
    private TextField text_Score2;
    @FXML
    private TextField text_Score3;
    @FXML
    private Label label_Avg_Score;

    // Main
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        // Answer Starts Here
        // Load FXML Layout
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("Score.fxml"));

        // Load FXML Scene And Display
        FlowPane pane = loader.<FlowPane>load();
        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Average Scores");
        primaryStage.show();
    }

    // Compute Score On Button Clicked
    @FXML
    private void btn_Calculate_Clicked(MouseEvent event) {
        // Fetch Scores From TextBoxes
        double score1 = Double.parseDouble(text_Score1.getText());
        double score2 = Double.parseDouble(text_Score2.getText());
        double score3 = Double.parseDouble(text_Score3.getText());

        // Calculate Average
        double avg = (score1 + score2 + score3) / 3.0;

        // Display Average On Label
        label_Avg_Score.setText(String.format("%.2f", avg));
    }
}