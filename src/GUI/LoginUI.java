package GUI;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;


public class LoginUI extends GridPane{
  
	private Label lblEmail;
	private Label lblPassword;
	
	private TextField txtEmail;
	private TextField txtPassword;
	
	
	/**
	 * A login UI Constructor
	 */
	public LoginUI() {
		SetUP();
	}
	
	
	/**
	 * 
	 * A login set up method
	 */
	public void SetUP() {
		
		lblEmail = new Label("Email");
		lblPassword = new Label("Password");
		
		TextField  txtEmail = new TextField();
		TextField  txtPassword = new TextField();
		
		
		GridPane grid = new GridPane();
		grid.setHgap(20);
		grid.setVgap(70);
		setPadding(new Insets(10, 10, 10, 10));
  		
		setAlignment(Pos.BASELINE_LEFT);
		
		//adding the components to the UI
		add(lblEmail, 0,0);
		add(txtEmail, 0, 1);
		
		add(lblPassword, 2,0);
		add(txtPassword, 0, 2);
		
		
		
	}
}
