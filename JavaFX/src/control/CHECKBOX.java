package control;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.scene.control.CheckBox;
public class CHECKBOX extends Application{
	public void start(Stage primary) {
		Label l=new Label("select your friends");
		CheckBox c1=new CheckBox("sajan");
		CheckBox c2=new CheckBox("deep");
		CheckBox c3=new CheckBox("devraj");
		VBox v=new VBox();
		v.getChildren.addAll(l,c1,c2,c3);
		Scene scene=new Scene(v);
		primary.setScene(scene);
		primary.setWidth(500);
		primary.setHeight(500);
		primary.show();
	}
	public static void main(String [] args) {
		launch();
	}
}