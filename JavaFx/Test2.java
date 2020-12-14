import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class Test2 extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage)throws Exception {
		String[] msg = {"Hello Java", "OK"};
		Label h01 = new Label(msg[0]+ msg[1]);
		TextField f = new TextField();
		Button b1 = new Button(msg[2]);
		b1.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent e) {
			String m = f.getText();
			h01.setText(msg[0] + m);
		}
	});
		BorderPane pn = new BorderPane();
		pn.setTop(h01);
		pn.setCenter(f);
		pn.setBottom(b1);
		Scene sn = new Scene(pn,300,100);
		stage.setScene(sn);
		stage.show();
	}
}
