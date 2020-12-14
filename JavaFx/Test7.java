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



public class Test7 extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage satge)throws Exception {
		View v = new View();
		Scene scene = new Scene(v,400,300);
		stage.setScene(scene);
		stage.show();
	}
}

class View extends Group {
	public View() {
		Rectangle rect = new Rectangle(200,150,50,50);
		rect.setFill(Color.YELLOW);
		ScaleTransition animation = new ScaleTransition(Duration.seconds(1),rect);
		animal.setFromX(1);
		animal.setFromY(1);
		animal.setToX(4);
		animal.setToY(5);
		animation.setCycleCount(Animation.INDEFINITE);
		animation.play();
		getChildren().add(rect);

	}
}