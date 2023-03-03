import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Pizza extends Application {

	@FXML
	private RadioButton rdoCheesePizza;
	@FXML
	private RadioButton rdoPepperoniPizza;
	@FXML
	private RadioButton rdoVeggiPizza;
	@FXML
	private CheckBox chkExtraCheese;
	@FXML
	private CheckBox chkMushroom;
	@FXML
	private CheckBox chkBacon;
	@FXML
	private TextArea txtBill;

	public static void main(String[] args) {
		launch(args);
	}

	// Start The Application
	@Override
	public void start(Stage primaryStage) throws IOException {
		// Create An FXML Loader
		FXMLLoader loader = new FXMLLoader();
		// Load Layout.FXML
		loader.setLocation(getClass().getResource("Layout.fxml"));
		// Load Pane And Create Scene
		VBox pane = loader.<VBox>load();
		Scene scene = new Scene(pane);
		// Set Scene Of Primary Stage
		primaryStage.setScene(scene);
		// Set Title
		primaryStage.setTitle("Joe's Pizza");
		// Show Stage
		primaryStage.show();
	}

	// Calculate Button Click Handler
	@FXML
	private void btnCalculateClicked(MouseEvent event) {
		// Total Bill
		double total = 0.00;

		// Add Pizza Cost
		if (rdoCheesePizza.isSelected()) {
			total += 10.00;
		} else if (rdoPepperoniPizza.isSelected()) {
			total += 12.00;
		} else if (rdoVeggiPizza.isSelected()) {
			total += 15.00;
		}

		// Add Topping Cost
		if (chkExtraCheese.isSelected()) {
			total += 1.50;
		}

		if (chkBacon.isSelected()) {
			total += 1.50;
		}

		if (chkMushroom.isSelected()) {
			total += 1.50;
		}

		// Display Total Cost
		txtBill.setText(String.format("$%.2f", total));
	}
}