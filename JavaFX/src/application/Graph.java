package application;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.control.Label;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.layout.StackPane;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
public class Graph extends Application {
	public void start(Stage stage) {
		Canvas mycanvas=new Canvas(100,100);
		GraphicsContext gc=mycanvas.getGraphicsContext2D();
		gc.fillText("sajan shrestha",0,90);
		gc.fillRect(0,70,100,10);
		gc.fillOval(10, 10, 10, 10);
		gc.strokeOval(10, 40, 10, 10);
		gc.setFill(Color.BLUE);
		Rectangle r=new Rectangle();
		r.setX(100);
		r.setY(100);
		r.setWidth(100);
		r.setHeight(200);
		Circle c=new Circle();
		c.setCenterX(100);
		c.setCenterY(100);
		c.setRadius(50);
		Label l=new Label("sajan");
		StackPane v=new StackPane();
		v.getChildren().addAll(mycanvas);
		Scene sc=new Scene(v,600,600);
		stage.setScene(sc);
		stage.show();
	}
public static void main(String [] args) {
	launch();
}
}
