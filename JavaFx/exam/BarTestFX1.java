import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.animation.AnimationTimer;
import javafx.scene.input.KeyEvent;
import javafx.event.EventHandler;

public class BarTestFX extends Application {
    BreakoutThread breakoutthread;
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage stage) {
		Key key = new Key()
		stage.setTitle();
		Pane pane = new Pane();
		Scene scene = new Scene(pane);
		stage.setScene(scene);

		scene.setOnKeyPressed(
			new EventHandler<KeyEvent>(){
				public void handle(KeyEvent e){
					key.keyPressed(e)
				}
			}
		); 
		scene.setOnKeyReleased(
			new EventHandler<KeyEvent>(){
				public void handle(KeyEvent e){
					key.keyReleased(e)
				}
			}
		);
		Canvas canvas = new Canvas(640,48);
		GraphicsContext gc = canvas.getGraphicsContext2D();
		pane.getChildren().add(canvas);
		breakoutthread = new BreakoutThread(gc);
		breakoutthread.start();
		stage.show();
	}
}
class BreakoutThread extends AnimationTimer {
	private GraphicsContext gc;
	private Ball ball;
	private Bar bar;
	public BreakoutThread(GraphicsContext gc,Key key) {
		this.gc = gc;
		ball = new Ball();
		bar = new Bar(key);
	}
	@Override
	public void handle(long time) {
		gc.clearRect(0,0,640,480);
		ball move();
		ball.draw(gc);
		bar.move();
		bar.draw(gc);
	}
}
class Ball {
	private int x;
	private int y;
	private int x_speed;
	private int y_speed;

	public Ball() {
		this.x = 20;
		this.y = 20;
		this.x_speed = 5;
		this.y_speed = 5;
	}
}
    public vioid move() {
		if(key.isLefttPressed() ){
        x += x_speed;
		}
		if(key.isRightPressed() ){
        y += y_speed;
		}
	}
	public void draw(GraphicsContext gc) {
		gc.setFill(Color.BLUE);
		gc.fillOval(x,y,20,20);
	}
class Bar {
	private int x;
	private int y;
	private int width;
	private int height;
	private int x_speed;
	private Key key;

	public Bar(Key key) {
		this.x = 100;
		this.y = 470;
		this.width = 100;
		this.height = 10;
		this.x_speed = 5;
		this.key = key;
	}
}

	public vioid move() {
		if(key.isLefttPressed() ){
        x += x_speed;
		}
		if(key.isRightPressed() ){
        y += y_speed;
		}
	}
	public void draw(GraphicsContext gc) {
		gc.setFill(Color.RED);
		gc.fillRect(x,y,width,height);
	}
class Key {
	private boolean right;
	private boolean left;

	public Key() {
		this.right = false;
		this.left = false;
	}
	public void keyPressed(KeyEvent e) {
		switch(e.getCode()){
			case LEFT:
			System.out.println("LEFT released.")
			break;
			case RIGHT:
			System.out.println("RIGHT pressed.");
			break;
			default;
			break;
		}
		public boolean isRightPressed(){
			return right;
		}
		public boolean isLefttPressed(){
			return left;,
		}
	}
}
