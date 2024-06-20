package lab;
import javafx.application.Application;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.Scene;
import javafx.stage.Stage;
public class multiplication_table extends Application{
	public void start(Stage stage) {
		Label lb=new Label("Enter the number:");
		TextField text=new TextField();
		Label mul[]=new Label[10];
		int j;
		for(j=0;j<10;j++) {
			mul[j]=new Label("");
		}
		Button btn=new Button("Dispaly");
		Label lb1=new Label("");
		VBox v=new VBox(lb,text,btn,lb1);
		VBox v1=new VBox(mul);
		VBox vmain=new VBox(v,v1);
		Scene sc=new Scene(vmain,500,500);
		stage.setScene(sc);
		stage.show();
		btn.setOnAction(event->{
			int i;
			int data=Integer.parseInt(text.getText());
			lb1.setText("The mutiplication table of "+data+" : ");
			for(i=1;i<=10;i++) {
				mul[i-1].setText((text.getText()+" X "+i+" = "+Integer.parseInt(text.getText())*i));
			}
		});
	}
	public static void main(String [] args) {
		launch();
	}
	
}
