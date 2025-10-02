package com.scheduler.app;

import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application {

	@Override
	public void start(Stage primaryStage){
		MainWindow window = new MainWindow();

		primaryStage.setTitle("JavaFX Test");
		primaryStage.setScene(window.createScene());
		primaryStage.setMinWidth(480);
		primaryStage.setMinHeight(320);
		primaryStage.show();
	}

}
