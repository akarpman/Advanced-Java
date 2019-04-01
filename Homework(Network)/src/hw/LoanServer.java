//Andrew Karpman
//Networking Homework
//This Creates a Server for receiving and Computing Loans from clients
package hw;

import java.io.*;
import java.net.*;
import java.util.Date;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class LoanServer extends Application {
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		// Text area for displaying contents
		TextArea ta = new TextArea();
		// Create a scene and place it in the stage
		Scene scene = new Scene(new ScrollPane(ta), 450, 200);
		primaryStage.setTitle("Server"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
		new Thread(() -> {
			try  
			{ 
				// Create a server socket
				ServerSocket serverSocket = new ServerSocket(8000);
				
				Platform.runLater(() -> ta.appendText("Server started at " + new Date() + '\n'));
				while (true) {
					
					// Listen for a connection request
					Socket socket = serverSocket.accept();
					// Create data input and output streams
					DataInputStream inputFromClient = new DataInputStream(socket.getInputStream());
					DataOutputStream outputToClient = new DataOutputStream(socket.getOutputStream());
					double annualInterestRate = inputFromClient.readDouble();
					double numberOfYears = inputFromClient.readDouble();
					double loanAmount = inputFromClient.readDouble();

					// Compute payments
					double n = numberOfYears * 12;
					double r = (annualInterestRate / 12) / 100;
					double P = (r * loanAmount) / (1 - Math.pow(1 + r, -n));
					// Send area back to the client
					
					outputToClient.writeDouble(P);
					outputToClient.writeDouble(P * n);
					Platform.runLater(() -> {
						//ta.appendText("User: " + count + '\n');
						ta.appendText("Annual Interest Rate received from client: " + annualInterestRate + '\n');
						ta.appendText("Loan Amount received from client: " + loanAmount + '\n');
						ta.appendText("Number Of Years received from client: " + numberOfYears + '\n');
						ta.appendText("Monthly Payment is: " + P + '\n');
						ta.appendText("Total Payment is: " + P * n + '\n');
					});
					//count++;
				}
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}).start();
	}

	/**
	 * The main method is only needed for the IDE with limited JavaFX support. Not
	 * needed for running from the command line.
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		
		launch(args);
		
	}
}