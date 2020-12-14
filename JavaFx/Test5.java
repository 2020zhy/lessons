import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Label;

public class Test5 extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	public void start(Stage stage) throws Exception {
		String msg = "hello,JavaFX!";
		String name = "Zhong Huiying";
		String cl = "IG12";
		Label h01 = new Label(msg);
		Label h02 = new Label(name);
		Label h03 = new Label(cl);
		BorderPane pn= new BorderPane();
		pn.setTop(h01);
		pn.setCenter(h02);
		pn.setBottom(h03);
		Scene sn = new Scene(pn,300,100);
		stage.setScene(sn);
		stage.show();
	}
}
