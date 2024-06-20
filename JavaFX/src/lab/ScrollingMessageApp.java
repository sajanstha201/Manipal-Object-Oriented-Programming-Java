package lab;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ScrollingMessageApp extends Application {
    private boolean scrollLeftToRight = true;
    private boolean isScrolling = false;
    private Thread scrollThread;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Scrolling Message");

        Label messageLabel = new Label("This is a scrolling message.");
        messageLabel.setTranslateX(10);

        RadioButton leftToRightRadio = new RadioButton("Left to Right");
        RadioButton rightToLeftRadio = new RadioButton("Right to Left");
        ToggleGroup scrollGroup = new ToggleGroup();
        leftToRightRadio.setToggleGroup(scrollGroup);
        rightToLeftRadio.setToggleGroup(scrollGroup);
        leftToRightRadio.setSelected(true);

        Button startButton = new Button("Start Scrolling");
        startButton.setOnAction(event -> {
            if (!isScrolling) {
                scrollLeftToRight = leftToRightRadio.isSelected();
                isScrolling = true;
                startScrolling(messageLabel);
            }
        });

        VBox layout = new VBox(messageLabel, leftToRightRadio, rightToLeftRadio, startButton);
        Scene scene = new Scene(layout, 400, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void startScrolling(Label messageLabel) {
        scrollThread = new Thread(() -> {
            double speed = scrollLeftToRight ? 1 : -1;
            while (isScrolling) {
                try {
                    Thread.sleep(10); // Adjust the speed by changing the sleep time
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                double currentTranslateX = messageLabel.getTranslateX();
                if (scrollLeftToRight && currentTranslateX >= 400) {
                    isScrolling = false;
                } else if (!scrollLeftToRight && currentTranslateX <= -messageLabel.getWidth()) {
                    isScrolling = false;
                }

                messageLabel.setTranslateX(currentTranslateX + speed);
            }
        });

        scrollThread.start();
    }

    @Override
    public void stop() {
        isScrolling = false;
    }
}
