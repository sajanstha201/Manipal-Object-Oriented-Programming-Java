package application;
import javafx.application.*;
import javafx.scene.control.Label;
import javafx.stage.*;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.scene.layout.VBox;
import javafx.scene.control.TextField;
import javafx.event.Event;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleButton;
class A implements EventHandler<ActionEvent>{
	public void handle(ActionEvent e) {
		
	}
}
class Arr <T  extends Event>implements EventHandler<T>{
	public void handle(T e) {
		System.out.println("I love debuggin\n");
	}
}
public class button extends Application{
	public void start(Stage primaryStage) {
		ToggleButton g=new ToggleButton("sajan");
		Label l1=new Label("Off");
		g.setOnAction(event->{
			if(g.isSelected())l1.setText("On");
			else l1.setText("Off");
		});
		ToggleGroup group=new ToggleGroup();
		RadioButton r1=new RadioButton("sajan");
		RadioButton r2=new RadioButton("deep");
		r1.setToggleGroup(group);
		r2.setToggleGroup(group);
		Button btn=new Button("Click me");
		A a=new A();
		TextField text=new TextField();
		Label lb=new Label();
		btn.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent e) {
				 lb.setText("sajan");
			}
		});
		btn.setOnAction((e)->{
			lb.setText("shrestha");
		});
		Arr<ActionEvent> xx=new Arr<>();
		btn.setOnAction(xx);
		Button start=new Button("Start");
		start.setOnAction(e->{
			System.out.println("my name is sajan shrestha");
		});
		VBox root=new VBox();
		root.getChildren().addAll(btn,start,lb,r1,r2,g,l1);
		Scene scene=new Scene(root,500,300);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
public static void main(String [] args) {
	launch(args);
}
}
