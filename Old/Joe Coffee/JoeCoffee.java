import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Spinner;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class JoeCoffee extends Application {
	@FXML
	private CheckBox chkCream;
	@FXML
	private CheckBox chkSugar;
	@FXML
	private CheckBox chkSweetner;
	@FXML
	private CheckBox chkCinnamon;
	@FXML
	private CheckBox chkCaramel;
	@FXML
	private CheckBox chkCaramels;
	@FXML
	private Spinner<Integer> numMuffins;

	// Main
	public static void main(String[] args) {
		launch(args);
	}

	// Start The Application
	@Override
	public void start(Stage primaryStage) throws IOException {
		// Load Layout
		// FXMLLoader loader = new FXMLLoader();
		// loader.setLocation(getClass().getResource("Layout.fxml"));
		// Load Scene And Display Stage
		// BorderPane pane = loader.<BorderPane>load();
		// Scene scene = new Scene(pane);
		// primaryStage.setScene(scene);
		primaryStage.setTitle("Joe's Coffee House");
		primaryStage.show();
		// System.out.println(numMuffins.getValue());
	}

	// Exit Button Click Handler
	@FXML
	private void btnExitClicked(MouseEvent event) {
		// Close The Application
		System.exit(0);
	}

	// Calculate Button Click Handler
	@FXML
	private void btnCalculateClicked(MouseEvent event) {
		// Iniital Coffe Cost
		double subTotal = 3.00;

		// Count Number Of Toppings
		int numToppings = 0;
		if (chkCream.isSelected())
			numToppings++;
		if (chkSugar.isSelected())
			numToppings++;
		if (chkSweetner.isSelected())
			numToppings++;
		if (chkCinnamon.isSelected())
			numToppings++;
		if (chkCaramel.isSelected())
			numToppings++;

		// Add Topping Cost
		subTotal += 0.25 * numToppings;
		// Add Muffin Cost
		subTotal += 2.25 * numMuffins.getValue();

		// Tax
		double tax = subTotal * 0.07;
		// Total
		double total = tax + subTotal;

		// Display Bill Using Alert Box
		Alert alert = new Alert(Alert.AlertType.INFORMATION);
		alert.setTitle("Order Bill - Joe's Coffee");
		alert.setHeaderText("Order Bill");
		alert.setContentText(String.format("Subtotal: $%.2f\nTax: $%.2f\nTotal: $%.2f",
				subTotal, tax, total));
		alert.showAndWait();
	}
}