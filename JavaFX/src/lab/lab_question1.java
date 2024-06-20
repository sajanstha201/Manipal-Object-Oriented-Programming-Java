package lab;
import javafx.application.Application;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.Scene;
public class lab_question1 extends Application{
	public void start(Stage primaryStage) {
		Label label=new Label("Welcome to JavFX programming");
		label.setTextFill(Color.MAGENTA);
		FlowPane fp=new FlowPane();
		fp.setHgap(10);
		fp.setVgap(10);
		fp.getChildren().addAll(label);
		Scene scene=new Scene(fp,500,200);
		primaryStage.setScene(scene);
		primaryStage.show();
		primaryStage.setTitle("This is the first JavaFX Application");
	}
	public static void main(String [] args) {
		launch();
	}

}
