package control;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleGroup;
public class RADIOBUTTON extends Application{
	public void start(Stage primarystage) {
		Label lb=new Label("select your friend");
		ToggleGroup t=new ToggleGroup();
		RadioButton r1=new RadioButton("sajan");
		RadioButton r2=new RadioButton("deep");
		RadioButton r3=new RadioButton("devraj");
		r1.setToggleGroup(t);
		r2.setToggleGroup(t);
		r3.setToggleGroup(t);
		HBox h=new HBox(lb,r1,r2,r3);
		Scene scene =new Scene(h);
		primarystage.setScene(scene);
		primarystage.setWidth(500);
		primarystage.setHeight(500);
		primarystage.show();
	}
	public static void main(String [] args) {
		launch();
	}
}
