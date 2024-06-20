package lab;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.*;
public class lab_question4 extends Application {
	VBox v=new VBox();
	public void start(Stage stage) {
		Label l=new Label("Click the below button to display");
		Button btn=new Button("Click me");
		Employee e1=new Employee("sajan",001,1000.0,10000.0);
		Employee e2=new Employee("deep",002,1000.0,2000.0);
		v.getChildren().addAll(l,btn);
		Scene sc=new Scene(v,500,500);
		stage.setScene(sc);
		btn.setOnAction(event->{
			add(e1.display());
			add(e2.display());
		});
		stage.show();
	}
	public void add(String str) {
		v.getChildren().addAll(new Label(str));
	}

public static void main(String []args ) {
	launch();
}
}
class Employee {
	int empID;
	double basicPay,DA,HRA,PF,netSalary;
	String name;
	Employee(String name,int empID,double basicPay,double netSalary){
		this.name=name;
		this.empID=empID;
		this.basicPay=basicPay;
		this.netSalary=netSalary;
		this.DA=0.4*basicPay;
		this.HRA=0.15*basicPay;
		this.PF=0.12*basicPay;
	}
	public String display() {
		String str="ID:"+this.empID+"\n Employee Name: "+this.name+"\nDA: "+this.DA;
		String str2="HRA: "+this.HRA+"\nPF: "+this.PF+"\nNet Salary: "+this.netSalary;
		return str+str2;
	}
}


