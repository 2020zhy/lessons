import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.animation.AnimationTimer;

public class Test10 extends Application {
	private BreakoutThread breakoutthread;
     public static void main( String[] args ) {
       launch( args );
     }
     @Override
     public void start( Stage stage ) {
     	stage.setTitle("ALOHA!");
     	Pane pane = new Pane();
     	Scene scene = new Scene(pane);
     	stage.setScene(scene);
     	Canvas canvas = new Canvas(640,480);
     	GraphicsContext gc = canvas.getGraphicsContext2D();
     	pane.getChildren().add(canvas);
     	breakoutthread = new BreakoutThread(gc);
     	breakoutthread.start();
     	stage.show();
     }
 }
 class BreakoutThread extends AnimationTimer {
 	private GraphicsContext gc;
 	private int count;

 	public BreakoutThread(GraphicsContext gc){
 		this.gc = gc;
 		this.count = 0;
 	}
 @Override
 public void handle(lone time) {
 	count++;
 	gc.clearRect(0,0,640,480);
 	gc.setStroke(Color.BLACK);
 	gc.fillText("ALOHA",200,200);
 	gc.fillText("count:"+count,450,450);
 	gc.fillText("time:"+time,450,470);
    }
}
