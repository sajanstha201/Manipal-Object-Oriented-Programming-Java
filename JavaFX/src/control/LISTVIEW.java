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
public class LISTVIEW extends Application{
	public void start(Stage primarystage) {
		Canvas c=new Canvas(200,200);
		GraphicsContext gc=c.getGraphicsContext2D();
		GridPane gp=new GridPane();
		ObservableList<String> ob=FXCollections.observableArrayList("circle","rectangle");
		ListView<String> lv=new ListView<>(ob);
		Label lb1=new Label("here");
		lv.getSelectionModel().selectedItemProperty().addListener((observable,oldvalue,newvalue)->{
			lb1.setText("seleceted items is "+newvalue);
		});
		Button btn=new Button("change color");
		btn.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent e) {
				System.out.println("sajan");
				if(Math.random()>0.5)
					gc.setFill(Color.RED);
				else
					gc.setFill(Color.BLUE);	
			}
		});
		
		
		//another way to do it using button
		ListView<String> lv2=new ListView<>();
		lv2.getItems().add("sajan");
		lv2.getItems().add("deep");
		Button b2=new Button("click name");
		Label lb=new Label("heer");
		b2.setOnAction(event->{
			String selectedName=lv2.getSelectionModel().getSelectedItem();
			lb.setText("Selected Name is "+selectedName);
		});
		gp.add(lv, 0, 0);
		gp.add(lb1, 1, 0);
		gp.add(lv2,0,1);
		gp.add(b2,1,1);
		gp.add(lb,2,1);
		
		Scene sc=new Scene(gp,700,700);
		primarystage.setScene(sc);
		primarystage.setTitle("shape");
		primarystage.show();
	}
public static void main(String [] args) {
	launch(args);
}
}

