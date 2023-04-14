package models;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;

import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class LoginTransModel 
{	
	Stage stage;
	

	public LoginTransModel(Stage stage) 
	{
		this.stage = new Stage();
	}
	
	public void showNewGroup()
	{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(LoginTransModel.class.getResource("/views/New_Group_View.fxml"));
		try 
		{
			VBox view = loader.load();
			Scene s = new Scene(view);
			stage.setScene(s);
			stage.show();
			
		} catch (IOException e)
		{
			e.printStackTrace();
		}
		
		
	}
	
	public void showMainPage()
	{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(LoginTransModel.class.getResource("/views/ChatPage.fxml"));
		
		try 
		{
			AnchorPane view = loader.load();
	
			Scene s = new Scene(view);
			stage.setScene(s);
			stage.show();
			
		} catch (IOException e)
		{
			e.printStackTrace();
		}
		
	}
	
	
	
	
	

}
