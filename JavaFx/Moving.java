import javafx.animation.Animation;
import javafx.animation.ScaleTransition;
import javafx.util.Duration;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;


public class Moving extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage satge)throws Exception {
		View v = new View();
		Scene scene = new Scene(v,500,400);
		stage.setScene(scene);
		stage.show();
	}
}


class View extends Group {
	public View() {
		Rectangle rect = new Rectangle(0,70,80);
		rect.setFill(Color.YELLOW);
		ScaleTransition animation = new ScaleTransition(Duration.seconds(3),rect);
		animal.setFromX(0.1);
		animal.setFromY(0.1);
		animal.setToX(5);
		animal.setToY(5);
		animation.setCycleCount(Animation.INDEFINITE);
		animation.play();
		getChildren().add(rect);

	}
}