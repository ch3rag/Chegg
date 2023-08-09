import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ColorController extends Application {
    @FXML
    private Button btn_Show;
    @FXML
    private Label label_MyColor;

    // Main
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        // Answer Starts Here
        // Load FXML Layout
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("Color.fxml"));

        // Load FXML Scene And Display
        VBox pane = loader.<VBox>load();
        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Colors");
        primaryStage.show();
    }

    // Compute Score On Button Clicked
    @FXML
    private void btn_Show_Clicked(MouseEvent event) {
        // My Favourite Color
        String favColor = "Blue";

        // Display Favourite Color on Label
        label_MyColor.setText(favColor);
    }
}