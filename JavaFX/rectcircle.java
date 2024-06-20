import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class rectcircle {
public void start(Stage primarystage) {
	Canvas c=new Canvas(100,100);
	GraphicsContext gc=c.getGraphicsContext2D();
	gc.fillRect(10, 10, 100, 20);
	gc.setFill(Color.RED);
	gc.fillText("my name is sajns shdlfjdlfjsldfjlsdfj", 10, 10);
	gc.fillRect(0, 0, 100, 100);
	gc.setFill(Color.BLACK);
	gc.fillOval(0, 0, 20, 20);
	gc.strokeLine(0,0,200,200);

	gc.clearRect(0, 0,200, 200);
	gc.strokeRect(20, 20, 10,10);
}
}
