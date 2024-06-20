package application;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.ComboBox;
import javafx.beans.value.ObservableValue;
import javafx.beans.value.ChangeListener;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
public class ListViewAndComboBox extends Application{
	public void start(Stage prime) {
		ListView<String> l=new ListView<String>();
		l.getItems().add("sajan");
		l.getItems().add("deeep");
		l.getItems().add("devraj");
		l.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
			public void changed(ObservableValue <?  extends String> changed,String oldval,String newval) {
				System.out.println(newval);
			}
		});
		
		
		ComboBox<Integer> bx=new ComboBox<>();
		bx.getItems().add(1);
		bx.getItems().add(2);
		bx.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				System.out.println(bx.getValue());
			}
		});
		
		
		Label lb=new Label("my name is sajan");
		VBox b=new VBox();
		b.getChildren().addAll(lb,l,bx);
		Scene sc=new Scene(b,500,500);
		prime.setScene(sc);
		prime.show();
	}
	public static void main(String[] args) {
		launch();
	}
}
