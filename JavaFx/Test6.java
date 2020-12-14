import javafx.animation.Animation;
import javafx.animation.TranslateTransition;
import javafx.util.Duration;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Circle;



public class Test6 extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		View v = new View();
		Scene scene = new Scene(v,400,300);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
class View extends Group{
	public View() {
	Rectangle rect = new Rectangle(0,0,50,50);
	rect.setFill(Color.YELLOW);
	Rectangle rect2 = new Rectangle(0,0,50,50);
	rect2.setFill(Color.BLUE);
	TranslateTransition animation = new TranslateTransition(Duration.seconds(1),rect);
	animation.setFromX(0);
	animation.setFromY(0);
	animation.setToX(350);
	animation.setToY(250);
	animation.setCycleCount(Animation.INDEFINITE);
	animation.play();
	getChildren().add(rect);
	TranslateTransition animation2 = new TranslateTransition(Duration.seconds(2),rect2);
	animation2.setFromX(100);
	animation2.setFromY(300);
	animation2.setToX(200);
	animation2.setToY(0);
	animation2.setCycleCount(Animation.INDEFINITE);
	animation2.play();
	getChildren().add(rect2);

}

}