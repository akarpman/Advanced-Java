package part2;

import javafx.animation.PathTransition;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.util.Duration;

public class FlagRisingAnimation extends Application {
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		
		try {
			// Create a pane
			Pane pane = new Pane();
	
			// Add an image view and add it to pane
			ImageView imageView = new ImageView("image/us.jpg");
		 
			
			imageView.setX(0);
			imageView.setY(400);
			
			pane.getChildren().add(imageView);
	
//			// Create a path transition
//			PathTransition pt = new PathTransition(Duration.millis(10000), new Line(100, 200, 100, 0), imageView);
//			pt.setCycleCount(5);
//			pt.play(); // Start animation

			// Create a scene and place it in the stage
			Scene scene = new Scene(pane, 250, 200);
			primaryStage.setTitle("FlagRisingAnimation"); // Set the stage title
			primaryStage.setScene(scene); // Place the scene in the stage
			primaryStage.show(); // Display the stage		
			//figure out how to stop it
			new Thread( () -> {
				try {
					while (imageView.getY() > 0) {//stops at 0
						// Modify Y value
						Platform.runLater(() -> imageView.setY(imageView.getY() - 5));
						Thread.sleep(10);						
					}
				}
				catch(InterruptedException ex) {
					// Do nothing
					System.out.println("Done Sleeping!");
				}				
			}).start();
			
		}
		catch (Exception ex) {
			ex.printStackTrace();
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