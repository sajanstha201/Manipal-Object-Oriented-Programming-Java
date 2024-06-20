package javaFx;
import javafx.scene.control.*;
import javafx.stage.*;
import javafx.application.*;
import javafx.scene.layout.*;
import javafx.scene.*;
class Account{
	int acno,pass,amount;
	Account(int acno,int pass,int amount){
		this.acno=acno;
		this.pass=pass;
		this.amount=amount;
	}
}
public class AccountATM extends Application{
	public void start(Stage prime) {
		GridPane gp=new GridPane();
		Label l1=new Label("Account Operation");
		Label l2=new Label("Enter Account No");
		TextField t1=new TextField();
		t1.setMinWidth(100);
		Label l3=new Label("Enter your Pin");
		PasswordField p1=new PasswordField();
		p1.setMinWidth(100);
		Label l4=new Label("Select Operation");
		ToggleGroup tg=new ToggleGroup();
		RadioButton r1=new RadioButton("Deposit");
		RadioButton r2=new RadioButton("WithDraw");
		r1.setToggleGroup(tg);
		r2.setToggleGroup(tg);
		Label l5=new Label("Enter Amount: ");
		TextField t2=new TextField();
		t2.setMinWidth(100);
		Button btn=new Button("SUbmit");
		Label l6=new Label("");
		gp.add(l1, 0, 0);
		gp.add(l2, 1, 0);
		gp.add(t1, 1, 1);
		gp.add(l3, 2, 0);
		gp.add(p1, 2, 1);
		gp.add(l4, 3, 0);
		gp.add(r1, 3, 1);
		gp.add(r2, 3, 3);
		gp.add(l5, 4, 0);
		gp.add(t2, 4, 1);
		gp.add(btn, 5, 1);
		gp.add(l6, 6, 0);
		Scene sc=new Scene(gp,500,500);
		prime.setScene(sc);
		prime.show();
	}
public static void main(String [] args) {
	Account sajan=new Account(01,1234,500);
	Account deep=new Account(02,1234,1000);
	Account devraj=new Account(03,4321,10);
	launch(args);
}
}
