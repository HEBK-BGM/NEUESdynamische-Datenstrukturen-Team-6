package de.hebk;

import de.hebk.gui.Menu;
import de.hebk.media.video.VideoManager;
import de.hebk.media.video.VideoType;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setResizable(false);
        stage.setTitle("Wer wird Millionär");
        stage.getIcons().add(new Image(getClass().getResourceAsStream("images/icon.png")));
        Menu menu = new Menu(stage);
        menu.mainMenu();
    }
}