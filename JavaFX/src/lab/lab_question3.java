package lab;
import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;
import javafx.event.*;
public class lab_question3 extends Application{
	public void start(Stage stage) {
		Label labelWelcome=new Label("Welcome");
		Label labelUserName=new Label("User Name: ");
		TextField textUserName=new TextField();
		textUserName.setMaxWidth(100);
		Label labelPassword=new Label("Password: ");
		PasswordField textPassword=new PasswordField();
		textPassword.setMaxWidth(100);
		Label labelWelcomeUser=new Label("");
		Button singIn=new Button("Sign in");
		singIn.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				labelWelcomeUser.setText("Welcome "+textUserName.getText());
			}
		});
		GridPane g=new GridPane();
		g.setHgap(20);
		g.setVgap(20);
		g.add(labelWelcome, 0, 0);
		g.add(labelUserName, 0, 1);
		g.add(labelPassword, 0, 2);
		g.add(textUserName, 1, 1);
		g.add(textPassword, 1, 2);
		g.add(labelWelcomeUser, 1, 3);
		g.add(singIn, 2, 3);
		Scene sc=new Scene(g);
		stage.setScene(sc);
		stage.show();
	}
	public static void main(String [] args) {
		launch();
	}

}
