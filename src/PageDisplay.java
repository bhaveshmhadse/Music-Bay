package sample;

import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

class myPage extends MusicBAY {

    String title; Image img; int x;
    myPage(Image setImg , String setPage, int pageNo){
        img = setImg;
        title = setPage;
        x = pageNo;
    }
    public void start(Stage stage){
        ImageView genrePage = new ImageView(img);
        genrePage.setX(0);
        genrePage.setY(0);
        genrePage.setFitHeight(500);
        genrePage.setFitWidth(700);

        Button song1 = new Button();
        song1.setLayoutX(50);
        song1.setLayoutY(140);
        song1.setMinSize(550,35);
        song1.setStyle("-fx-background-color: transparent");

        Button song2 = new Button();
        song2.setLayoutX(50);
        song2.setLayoutY(190);
        song2.setMinSize(550,35);
        song2.setStyle("-fx-background-color: transparent");

        Button song3 = new Button();
        song3.setLayoutX(50);
        song3.setLayoutY(250);
        song3.setMinSize(550,35);
        song3.setStyle("-fx-background-color: transparent");

        Button song4 = new Button();
        song4.setLayoutX(50);
        song4.setLayoutY(310);
        song4.setMinSize(550,35);
        song4.setStyle("-fx-background-color: transparent");

        Button song5 = new Button();
        song5.setLayoutX(50);
        song5.setLayoutY(370);
        song5.setMinSize(550,35);
        song5.setStyle("-fx-background-color: transparent");

        Button back = new Button();
        back.setLayoutX(0); back.setLayoutY(460);
        back.setMinSize(100,30);
        back.setStyle("-fx-background-color: transparent ");

        EventHandler<MouseEvent> handle = new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (event.getSource() ==song1) {
                    new MusicPlayer(0,0,0,0);
                    try {
                        new MusicPlayer(0,0,0,x).start(stage);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                if (event.getSource() == song2) {
                    try {
                        new MusicPlayer(1, 1, 1,x).start(stage);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                if (event.getSource() == song3) {
                    try {
                        new MusicPlayer(2, 2,2,x).start(stage);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                if (event.getSource() == song4) {
                    try {
                        new MusicPlayer(3, 3,3,x).start(stage);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                if (event.getSource() == song5) {
                    try {
                        new MusicPlayer(4, 4,4,x).start(stage);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                if (event.getSource() == back) {
                    try {
                        if(x>6){
                            new Artist().start(stage);}
                        else {
                            new Genre().start(stage);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        song1.setOnMouseClicked(handle);
        song2.setOnMouseClicked(handle);
        song3.setOnMouseClicked(handle);
        song4.setOnMouseClicked(handle);
        song5.setOnMouseClicked(handle);
        back.setOnMouseClicked(handle);
        Group root = new Group(genrePage,song1,song2,song3,song4,song5,back);
        Scene scene2 = new Scene(root, 700, 500);
        stage.setTitle(title);
        scene2.setFill(Color.BLACK);
        stage.setScene(scene2);
        stage.show();
    }
}
