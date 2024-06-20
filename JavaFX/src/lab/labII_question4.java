package lab;
import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.canvas.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
public class labII_question4 extends Application{
	student st[]=new student[10];
	GraphicsContext gc;
	public void start(Stage stage) {
		setStudentData();
		ListView<Integer> list=new ListView<>();
		int NoOfStudent=st.length;
		int i;
		for(i=0;i<NoOfStudent;i++) {
			list.getItems().add(st[i].id+1);
		}
		Canvas cv=new Canvas(500,200);
		gc=cv.getGraphicsContext2D();
		list.getSelectionModel().selectedItemProperty().addListener((observable,oldval,newval)->{
			int j;
			String str="";
			for(j=0;j<10;j++) {
				if(st[j].id==newval-1) {
					str+="\nName: "+st[j].name+" \n ID: "+st[j].id;
					gc.clearRect(0, 0,500,200);
					gc.fillText(str,5,20);
				}
			}
		});
		VBox v=new VBox(list,cv);
		Scene sc=new Scene(v);
		stage.setScene(sc);
		stage.show();
	}
	public void setStudentData() {
		int i;
		int max=st.length;
		String str[]= {"sajan","deep","devraj","abhishek","rahul","ashim","anmol","sanjay","ujjwal","ajaya"};
		for(i=0;i<max;i++) {
			st[i]=new student();
			st[i].id=i;
			st[i].name=str[i];
		}

		
	}
public static void main(String [] args) {
	launch();
}
}
class student{
	String name;
	int id;
	student(){
		
	}
	student(String name,int id){
		this.name=name;
		this.id=id;
	}
}
