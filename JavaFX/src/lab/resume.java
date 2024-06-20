package lab;
import javafx.application.*;
import javafx.scene.control.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.stage.*;
import javafx.scene.canvas.*;
public class resume extends Application{
public void start(Stage stage) {
	GraphicsContext gc;
	Button btnSubmit=new Button("Submit");
	Label name=new Label("Name: sajan shrestha\n Select the language you can speak");
	CheckBox c1=new CheckBox("English");
	CheckBox c2=new CheckBox("Nepali");
	CheckBox c3=new CheckBox("Hindi");
	CheckBox c4=new CheckBox("chinese");
	Canvas cv=new Canvas(300,500);
	gc=cv.getGraphicsContext2D();
	btnSubmit.setOnAction(event->{
		gc.clearRect(0, 0, 300, 500);
		String str="";
		if(c1.isSelected())
			str+=" English ";
		if(c2.isSelected())
			str+=", Nepali";
		if(c3.isSelected())
			str+=", Hindi";
		if(c4.isSelected())
			str+=", Chinese";
		if(str.equals(""))
			gc.fillText("sajan shrestha speaks None of the above language.",0,50);
		else
			gc.fillText("sajan shrestha speaks "+str+".",2,15);
		
	});
	VBox v=new VBox(name,c1,c2,c3,c4,btnSubmit,cv);
	Scene sc=new Scene(v,700,700);
	stage.setScene(sc);
	stage.show();
}
public static void main(String [] args) {
	launch();
}
}
