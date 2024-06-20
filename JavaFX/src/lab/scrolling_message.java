package lab;
import javafx.application.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;
import javafx.scene.*;
public class scrolling_message extends Application {
	boolean scrollRight=false,scrollLeft=false;
	public void start(Stage stage) {
		Label lb=new Label("choose the scrolling option");
		RadioButton lr=new RadioButton("left -> right");
		RadioButton rl=new RadioButton("right ->left");
		ToggleGroup group=new ToggleGroup();
		lr.setToggleGroup(group);
		rl.setToggleGroup(group);
		Button submit=new Button("Submit");
		Label message=new Label("message");
		message.setTranslateX(200);
		submit.setOnAction(event->{
			if(lr.isSelected())
				scrollRight=true;
			if(rl.isSelected())
				scrollLeft=true;
			Thread t=new Thread(()->{
				while(true) {
				if(scrollRight&&scrollLeft) {
					if(message.getTranslateX()>250)
						scrollRight=false;
					else
						scrollLeft=false;
				}
				if(scrollRight) {
						try {Thread.sleep(10);}catch(Exception e){}
						if(message.getTranslateX()>400)
							scrollRight=false;
						message.setTranslateX(message.getTranslateX()+1);
				}
				if(scrollLeft) {
						try {Thread.sleep(10);}catch(Exception e){}
						if(message.getTranslateX()<0)
							scrollLeft=false;
						message.setTranslateX(message.getTranslateX()-1);
				}
				}
			});
			t.start();
		});

		VBox v=new VBox(lb,lr,rl,submit,message);
		Scene sc=new Scene(v,500,500);
		stage.setScene(sc);
		stage.show();
	}
	public static void main(String [] args) {
		launch();
	}

}
