package application;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.VBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.ComboBox;
public class layout extends Application{
	public void start(Stage primarystage) {
		PasswordField pass=new PasswordField();
		pass.setMaxWidth(100);
		VBox x=new VBox();
		ComboBox<String> comb=new ComboBox<String>();
		comb.getItems().add("sajan");
		comb.getItems().add("deep");
		x.getChildren().addAll(pass,comb);
		Button b1=new Button("click me");
		Button b2=new Button("click me");
		Button b3=new Button("click me");
		TextField t1=new TextField("hello");
		TextField t2=new TextField("hello");
		GridPane g=new GridPane();
		g.add(b1, 0, 0);
		g.add(b2, 2,0);
		g.setVgap(30);
		g.setHgap(30);
		VBox v=new VBox();
		v.getChildren().addAll(g,b3,t1);
		BorderPane b=new BorderPane();
		//b.getChildren().add(v);
		b.setCenter(v);
		b.setRight(t2);
		Scene scene=new Scene(x);
		primarystage.setScene(scene);
		primarystage.setWidth(500);
		primarystage.setHeight(500);
		primarystage.setTitle("sajan shrestha");
		primarystage.show();
	}
	public static void main(String [] args) {
		launch();
	}

}
