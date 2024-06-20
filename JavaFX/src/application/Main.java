package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Button;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		Button btn=new Button("Click me");
		btn.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				System.out.println("sajan shrestha");
			}
		});
		StackPane root=new StackPane();
		root.getChildren().add(btn);
		Scene scene=new Scene(root,500,300);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
