package lab;
import javafx.application.Application;
import javafx.stage.*;
import javafx.scene.canvas.*;
import javafx.scene.layout.*;
import javafx.scene.*;
import javafx.scene.image.*;
import javafx.scene.control.*;
public class Calculator extends Application{
	GraphicsContext gc;
	public void start(Stage stage) {
		TextField op1=new TextField();
		TextField op2=new TextField();
		ToggleButton btnMul=new ToggleButton("X");
		ToggleButton btnAdd=new ToggleButton("+");
		ToggleButton btnSub=new ToggleButton("-");
		ToggleButton btnDiv=new ToggleButton("/");
		ToggleButton btnMod=new ToggleButton("%");
		ImageView img=new ImageView(new Image(getClass().getResource("equals.png").toExternalForm()));
		img.setFitWidth(10);
		img.setFitHeight(5);
		Button btnEq=new Button();
		btnEq.setGraphic(img);
		Label ans=new Label("");
		GridPane g=new GridPane();
		g.setVgap(10);
		g.setHgap(10);
		g.add(op1, 0, 0);
		g.add(op2, 1, 0);
		g.add(btnAdd, 0, 1);
		g.add(btnSub, 1, 1);
		g.add(btnMul, 0, 2);
		g.add(btnDiv, 1, 2);
		g.add(btnMod, 0, 3);
		g.add(btnEq, 1, 3);
		g.add(ans, 0, 4);
		Scene sc=new Scene(g,150,200);
		stage.setScene(sc);
		stage.show();
		btnEq.setOnAction(event->{
			int a=Integer.parseInt(op1.getText());
			int b=Integer.parseInt(op2.getText());
			if(btnAdd.isSelected()) {
				ans.setText("Answer = "+(a+b));
				btnAdd.setSelected(false);
			}
			if(btnSub.isSelected()) {
				ans.setText("Answer = "+(a-b));
				btnSub.setSelected(false);
			}
			if(btnMul.isSelected()) {
				ans.setText("Answer = "+(a*b));
				btnMul.setSelected(false);
			}
			if(btnDiv.isSelected()) {
				ans.setText("Answer = "+(a/b));
				btnDiv.setSelected(false);
			}
			if(btnMod.isSelected()) {
				ans.setText("Answer = "+(a%b));
				btnMod.setSelected(false);
			}
		});
	}
	public static void main(String [] args) {
		launch();
	}

}
