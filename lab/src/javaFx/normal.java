package javaFx;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
public class normal extends Application{
	public void start(Stage primarystage) {
		VBox v=new VBox();
		Scene sc=new Scene(v);
		primarystage.setScene(sc);
		primarystage.show();
	}
public static void main(String [] args) {
	launch();
}
}
