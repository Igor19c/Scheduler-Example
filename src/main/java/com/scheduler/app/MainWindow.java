package com.scheduler.app;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

public class MainWindow {

	public Scene createScene() {
		// Root
		BorderPane root = new BorderPane();
		root.setPadding(new Insets(16));

		// Center: Text - Title
		Label title = new Label("Welcome to JavaFX!");
		title.setStyle("-fx-font-size: 32px; -fx-font-weight: bold;");

		// Bottom: Button example
		Button btn = new Button("Click me!");
		btn.setOnAction(e -> title.setText("Clicked!"));

		HBox bottom = new HBox(btn);
		bottom.setSpacing(8);
		bottom.setPadding(new Insets(8, 0, 0, 0));

		root.setCenter(title);
		root.setBottom(bottom);

		// Return the Scene
		return new Scene(root, 720, 480);
	}
}
