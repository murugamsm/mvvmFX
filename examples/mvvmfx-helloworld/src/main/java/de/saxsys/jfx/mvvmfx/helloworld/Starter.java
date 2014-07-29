package de.saxsys.jfx.mvvmfx.helloworld;

import de.saxsys.jfx.mvvm.viewloader.FluentViewLoader;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import de.saxsys.jfx.mvvm.viewloader.ViewLoader;
import de.saxsys.jfx.mvvm.viewloader.ViewTuple;


public class Starter extends Application {
	
	
	public static void main(String... args) {
		Application.launch(args);
	}
	
	
	@Override
	public void start(Stage stage) throws Exception {
		stage.setTitle("Hello World Application");

		ViewTuple<HelloWorldView, HelloWorldViewModel> viewTuple = FluentViewLoader.fxmlView(HelloWorldView.class).load();
		
		Parent root = viewTuple.getView();
		stage.setScene(new Scene(root));
		stage.show();
	}
}
