import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Score extends Application {
    // Main
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        // Answer Starts Here
        ScoreController controller = new ScoreController();
        // Load FXML Layout
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("Score.fxml"));

        // Load FXML Scene And Display
        FlowPane pane = loader.<FlowPane>load();

        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Average Scores");
        primaryStage.show();
        
        // Add Click Handler For Button
        // btn_Calculate.setOnAction(new EventHandler<ActionEvent>() {
        //     @Override
        //     public void handle(ActionEvent e) {
        //         // Fetch Scores From TextBoxes
        //         double score1 = Double.parseDouble(text_Score1.getText());
        //         double score2 = Double.parseDouble(text_Score2.getText());
        //         double score3 = Double.parseDouble(text_Score3.getText());

        //         // Calculate Average
        //         double avg = (score1 + score2 + score3) / 3.0;

        //         // Display Average On Label
        //         label_Avg_Score.setText(String.format("%.2f", avg));
        //     }
        // });
        // System.out.println(text_Score1.getText());
    }
}
