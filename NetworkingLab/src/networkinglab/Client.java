//Andrew Karpman
//Networking Lab
//Client code for Computing Loan information for a Loan Server application to receive.
package networkinglab;

import java.io.*;
import java.net.*;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Client extends Application {
// IO streams
	DataOutputStream toServer = null;
	DataInputStream fromServer = null;

	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
// Panel p to hold the label and text field	
		BorderPane paneForTextField2 = new BorderPane();
		paneForTextField2.setPadding(new Insets(5, 5, 5, 5));
		paneForTextField2.setStyle("-fx-border-color: green");
		paneForTextField2.setTop(new Label("Enter your Annual Interest Rate: "));
		
		BorderPane paneForTextField3 = new BorderPane();
		paneForTextField3.setPadding(new Insets(5, 5, 5, 5));
		paneForTextField3.setStyle("-fx-border-color: green");
		paneForTextField3.setTop(new Label("Enter the Number of Years: "));
		
		BorderPane paneForTextField4 = new BorderPane();
		paneForTextField4.setPadding(new Insets(5, 5, 5, 5));
		paneForTextField4.setStyle("-fx-border-color: green");
		paneForTextField4.setTop(new Label("Enter Loan Amount: "));
		
		TextField tf2 = new TextField();
		TextField tf3 = new TextField();
		TextField tf4 = new TextField();

		tf2.setAlignment(Pos.BOTTOM_RIGHT);
		tf3.setAlignment(Pos.BOTTOM_RIGHT);
		tf4.setAlignment(Pos.BOTTOM_RIGHT);

		paneForTextField2.setCenter(tf2);
		paneForTextField3.setCenter(tf3);
		paneForTextField4.setCenter(tf4);
		BorderPane mainPane = new BorderPane();
// Text area to display contents
		TextArea ta = new TextArea();
		mainPane.setBottom(new ScrollPane(ta));
		
		mainPane.setCenter(paneForTextField2);
		mainPane.setRight(paneForTextField3);
		mainPane.setLeft(paneForTextField4);
// Create a scene and place it in the stage
		Scene scene = new Scene(mainPane, 550, 200);
		primaryStage.setTitle("Client"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
		tf2.setOnAction(e -> {
			try {
// Get the radius from the text field
				double annualInterestRate = Double.parseDouble(tf2.getText().trim());
				double loanAmount = Double.parseDouble(tf3.getText().trim());
				double numberOfYears = Double.parseDouble(tf4.getText().trim());
// Send the radius to the server
				toServer.writeDouble(annualInterestRate);
				//toServer.flush();
				toServer.writeDouble(loanAmount);
				//toServer.flush();
				toServer.writeDouble(numberOfYears);
				toServer.flush();
// Get area from the server
				double monthlyPayment = fromServer.readDouble();
				double totalPayment = fromServer.readDouble();
// Display to the text area
				ta.appendText("Loan Amount is " + loanAmount + "\n");
				ta.appendText("Annual Interest Rate is " + annualInterestRate + "\n");
				ta.appendText("Length is " + numberOfYears + "\n");
				ta.appendText("Monthly Payment received from the server is " + monthlyPayment + '\n');
				ta.appendText("Total Payment received from the server is " + totalPayment + '\n');
			} catch (IOException ex) {
				System.err.println(ex);
			}
		});
		try {
// Create a socket to connect to the server
			Socket socket = new Socket("localhost", 8000);
// Socket socket = new Socket("130.254.204.36", 8000);
// Socket socket = new Socket("drake.Armstrong.edu", 8000);
// Create an input stream to receive data from the server
			fromServer = new DataInputStream(socket.getInputStream());
// Create an output stream to send data to the server
			toServer = new DataOutputStream(socket.getOutputStream());
		} catch (IOException ex) {
			ta.appendText(ex.toString() + '\n');
		}
	}

	/**
	 * The main method is only needed for the IDE with limited JavaFX support. Not
	 * needed for running from the command line.
	 */
	public static void main(String[] args) {
		launch(args);
	}
}