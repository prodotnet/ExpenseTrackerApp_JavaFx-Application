import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {
    
	public static void main(String[] args) {
        launch(args);
    }
	
	@Override
    public void start(Stage stage) {
        Label label = new Label("Expense Tracker App");
        StackPane root = new StackPane(label);
        Scene scene = new Scene(root, 400, 300);
        
        stage.setTitle("Expense Tracker Application");
        stage.setScene(scene);
        stage.show();
    }

    
}

