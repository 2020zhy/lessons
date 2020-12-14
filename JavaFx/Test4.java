import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javfx.scene.control.Label;
public class Test4 extends Application {
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage stage)throws Exception {
		Label msg = new Label("Hello,JavaFX!");
		Label name = new Label("ショウカイエイ");
		Label classCode = new Label("IG12");
		BorderPane pane  = new BorderPane();
		pane.setTop(msg);
		pane.setCenter(name);
		pane.setBottom(classCode);
		Scene scene = new Scene(pane,300,200);
		stage.setScene(scene);
		stage.show();
	}
}