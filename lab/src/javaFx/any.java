package javaFx;
import javafx.scene.canvas.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.application.*;
import javafx.stage.*;
import javafx.collections.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
public class any extends Application{
	public void start(Stage primarystage) {
		TextField t1=new TextField();
		Button btn=new Button("click me");
		TextField t2=new TextField();
		GridPane gp=new GridPane();
		btn.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				t2.setText(t1.getText());
			}
		});
		gp.add(t1, 0, 0);
		gp.add(t2, 1, 0);
		gp.add(btn, 2, 0);
		Scene sc=new Scene(gp,700,700);
		primarystage.setScene(sc);
		primarystage.setTitle("shape");
		primarystage.show();
	}
public static void main(String [] args) {
	launch(args);
}
}

