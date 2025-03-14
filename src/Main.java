import GUI.LoginUI;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{
	
	
	//Creating Gui 
	LoginUI  login = new LoginUI();
	
	
	
	
	/**
	 * The main method which will launch the application
	 * @param args
	 */
	public static void main(String[] args) {
		launch(args);
		
	}
    
	/**
	 * 
	 * 
	 */
	@Override
	public void start(Stage stagename) throws Exception {
		Scene scen = new Scene(login,500,400);
		stagename.setTitle("Login");
		stagename.setScene(scen);
		stagename.show();
	}
	
	
}

