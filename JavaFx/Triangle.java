import javafx.animation.Animation;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;

public class Scale extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage)throws Exception {
		Group root = new Group();
		Scene scene = new Scene(root.500,400);
		Polygon triangle = mew Polygon(100,20,130,230,250,130);
		triangle.setFill(color.YELLOW);

		root.getChildren().add(triangle);
		satge.setScene(scene);
		stage.show();

	}
}