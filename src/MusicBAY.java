package sample;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javax.sound.sampled.*;
import java.io.*;

class Genre extends MusicBAY {
    public void start(Stage stage) throws Exception {

        Image img = new Image(new FileInputStream("resources\\images\\genres.png"));
        ImageView genrePage = new ImageView(img);
        genrePage.setX(0);
        genrePage.setY(0);
        genrePage.setFitHeight(500);
        genrePage.setFitWidth(700);

        Button trending = new Button();
        trending.setLayoutX(40);
        trending.setLayoutY(55);
        trending.setMinSize(200, 200);
        trending.setStyle("-fx-background-color: transparent ");

        Button party = new Button();
        party.setLayoutX(250);
        party.setLayoutY(55);
        party.setMinSize(200, 200);
        party.setStyle("-fx-background-color: transparent ");

        Button romance = new Button();
        romance.setLayoutX(460);
        romance.setLayoutY(55);
        romance.setMinSize(200, 200);
        romance.setStyle("-fx-background-color: transparent ");

        Button chillax = new Button();
        chillax.setLayoutX(40);
        chillax.setLayoutY(275);
        chillax.setMinSize(200, 170);
        chillax.setStyle("-fx-background-color: transparent ");

        Button beach = new Button();
        beach.setLayoutX(250);
        beach.setLayoutY(275);
        beach.setMinSize(200, 170);
        beach.setStyle("-fx-background-color: transparent ");

        Button workout = new Button();
        workout.setLayoutX(460);
        workout.setLayoutY(275);
        workout.setMinSize(200, 170);
        workout.setStyle("-fx-background-color: transparent ");

        Button back = new Button();
        back.setLayoutX(0);
        back.setLayoutY(460);
        back.setMinSize(100, 30);
        back.setStyle("-fx-background-color: transparent ");

        Button artist = new Button();
        artist.setLayoutX(500);
        artist.setLayoutY(460);
        artist.setMinSize(200, 30);
        artist.setStyle("-fx-background-color: transparent ");

        EventHandler<MouseEvent> handle = new EventHandler<MouseEvent>() {

            @Override
            public void handle(MouseEvent event) {
                if (event.getSource() == trending) {
                    try {
                        Image img = new Image(new FileInputStream("resources\\images\\trending.png"));
                        myPage m = new myPage(img, "Trending", 1);
                        m.start(stage);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                if (event.getSource() == party) {
                    try {
                        Image img = new Image(new FileInputStream("resources\\images\\party.png"));
                        myPage m = new myPage(img, "Party", 2);
                        m.start(stage);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                if (event.getSource() == romance) {
                    try {
                        Image img = new Image(new FileInputStream("resources\\images\\romance.png"));
                        myPage m = new myPage(img, "Romance", 3);
                        m.start(stage);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                if (event.getSource() == chillax) {
                    try {
                        Image img = new Image(new FileInputStream("resources\\images\\chillax.png"));
                        myPage m = new myPage(img, "Chillax", 4);
                        m.start(stage);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                if (event.getSource() == beach) {
                    try {
                        Image img = new Image(new FileInputStream("resources\\images\\beach.png"));
                        myPage m = new myPage(img, "Beach Vibes", 5);
                        m.start(stage);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                if (event.getSource() == workout) {
                    try {
                        Image img = new Image(new FileInputStream("resources\\images\\workout.png"));
                        myPage m = new myPage(img, "Workout", 6);
                        m.start(stage);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                if (event.getSource() == back) {
                    try {
                        new MusicBAY().start(stage);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                if (event.getSource() == artist) {
                    try {
                        new Artist().start(stage);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        trending.setOnMouseClicked(handle);
        party.setOnMouseClicked(handle);
        romance.setOnMouseClicked(handle);
        chillax.setOnMouseClicked(handle);
        workout.setOnMouseClicked(handle);
        beach.setOnMouseClicked(handle);
        back.setOnMouseClicked(handle);
        artist.setOnMouseClicked(handle);


        Group root = new Group(genrePage, trending, chillax, romance, party, workout, beach, back, artist);
        Scene scene2 = new Scene(root, 700, 500);
        stage.setTitle("GENRES");
        scene2.setFill(Color.BLACK);
        stage.setScene(scene2);
        stage.show();
    }
}

class Artist extends MusicBAY {

    public void start(Stage stage) throws Exception {

        Image img = new Image(new FileInputStream("resources\\images\\artists.png"));
        ImageView artists = new ImageView(img);
        artists.setX(0);
        artists.setY(0);
        artists.setFitHeight(500);
        artists.setFitWidth(700);

        Button ritviz = new Button();
        ritviz.setLayoutX(40);
        ritviz.setLayoutY(55);
        ritviz.setMinSize(200, 200);
        ritviz.setStyle("-fx-background-color: transparent ");

        Button arijit = new Button();
        arijit.setLayoutX(250);
        arijit.setLayoutY(55);
        arijit.setMinSize(200, 200);
        arijit.setStyle("-fx-background-color: transparent ");

        Button shankar = new Button();
        shankar.setLayoutX(460);
        shankar.setLayoutY(55);
        shankar.setMinSize(200, 200);
        shankar.setStyle("-fx-background-color: transparent");

        Button twostates = new Button();
        twostates.setLayoutX(40);
        twostates.setLayoutY(275);
        twostates.setMinSize(200, 170);
        twostates.setStyle("-fx-background-color: transparent");

        Button adhm = new Button();
        adhm.setLayoutX(250);
        adhm.setLayoutY(275);
        adhm.setMinSize(200, 170);
        adhm.setStyle("-fx-background-color: transparent ");

        Button bandits = new Button();
        bandits.setLayoutX(460);
        bandits.setLayoutY(275);
        bandits.setMinSize(200, 170);
        bandits.setStyle("-fx-background-color: transparent ");

        Button back = new Button();
        back.setLayoutX(0);
        back.setLayoutY(460);
        back.setMinSize(100, 30);
        back.setStyle("-fx-background-color: transparent ");


        EventHandler<MouseEvent> handle = new EventHandler<MouseEvent>() {

            @Override
            public void handle(MouseEvent event) {
                if (event.getSource() == ritviz) {
                    try {
                        Image img = new Image(new FileInputStream("resources\\images\\ritviz.png"));
                        myPage m = new myPage(img, "Ritviz", 7);
                        m.start(stage);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                if (event.getSource() == arijit) {
                    try {
                        Image img = new Image(new FileInputStream("resources\\images\\arijit.png"));
                        myPage m = new myPage(img, "Arijit Singh", 8);
                        m.start(stage);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                if (event.getSource() == shankar) {
                    try {
                        Image img = new Image(new FileInputStream("resources\\images\\shankar.png"));
                        myPage m = new myPage(img, "Shankar Mahadevan", 9);
                        m.start(stage);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                if (event.getSource() == twostates) {
                    try {
                        Image img = new Image(new FileInputStream("resources\\images\\twoStates.png"));
                        myPage m = new myPage(img, "Two States", 10);
                        m.start(stage);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                if (event.getSource() == adhm) {
                    try {
                        Image img = new Image(new FileInputStream("resources\\images\\adhm.png"));
                        myPage m = new myPage(img, "Ae Dil Hai Mushkil", 11);
                        m.start(stage);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                if (event.getSource() == bandits) {
                    try {
                        Image img = new Image(new FileInputStream("resources\\images\\bandits.png"));
                        myPage m = new myPage(img, "Bandish Bandits", 12);
                        m.start(stage);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                if (event.getSource() == back) {
                    try {
                        new Genre().start(stage);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }

            }
        };
        ritviz.setOnMouseClicked(handle);
        arijit.setOnMouseClicked(handle);
        shankar.setOnMouseClicked(handle);
        twostates.setOnMouseClicked(handle);
        bandits.setOnMouseClicked(handle);
        adhm.setOnMouseClicked(handle);
        back.setOnMouseClicked(handle);
        Group root = new Group(artists, ritviz, twostates, shankar, arijit, bandits, adhm, back);
        Scene scene2 = new Scene(root, 700, 500);
        stage.setTitle("ARTISTS");
        scene2.setFill(Color.BLACK);
        stage.setScene(scene2);
        stage.show();
    }
}

public class MusicBAY extends Application {
    Clip clip;

    @Override
    public void start(Stage stage) throws Exception {
        Image img = new Image(new FileInputStream("resources\\images\\front.png"));
        ImageView logo = new ImageView(img);
        logo.setX(0);
        logo.setY(0);
        logo.setFitHeight(500);
        logo.setFitWidth(700);
        Button insta = new Button();
        insta.setLayoutX(10);
        insta.setLayoutY(440);
        insta.setMinSize(100, 50);
        Button info = new Button();
        info.setLayoutX(590);
        info.setLayoutY(440);
        info.setMinSize(100, 50);
        Button enter = new Button();
        enter.setLayoutX(260);
        enter.setLayoutY(350);
        enter.setMinSize(200, 20);
        enter.setStyle("-fx-background-color: Transparent ");
        insta.setStyle("-fx-background-color: Transparent ");
        info.setStyle("-fx-background-color: Transparent ");

        EventHandler<MouseEvent> handler = new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (event.getSource() == enter) {
                    Genre m = new Genre();
                    try {
                        clip.stop();
                        m.start(stage);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                if (event.getSource() == info) {
                    try {
                        new ShowInfo().start(stage);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                if (event.getSource() == insta) {
                    clip.stop();
                    getHostServices().showDocument("https://www.instagram.com/musicbay_dmce/");
                    event.consume();
                }
            }
        };
        enter.setOnMouseClicked(handler);
        insta.setOnMouseClicked(handler);
        info.setOnMouseClicked(handler);
        Group root = new Group(logo, enter, insta, info);
        Scene scene = new Scene(root, 700, 503);
        stage.setTitle("MUSIC BAY - Unleash the Music");
        scene.setFill(Color.BLACK);
        stage.setScene(scene);
        stage.show();
        stage.setResizable(false);
        stage.getIcons().add(new Image("file:resources\\images\\favicon.png"));
        AudioInputStream audioInputStream;
        String filepath = "resources\\songs\\bgmusicwav.wav";
        try {
            audioInputStream = AudioSystem.getAudioInputStream(new File(filepath).getAbsoluteFile());
            clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}

class ShowInfo extends MusicBAY {
    @Override
    public void start(Stage stage2) throws Exception {
        stage2 = new Stage();
        Image img = new Image(new FileInputStream("resources\\images\\info.png"));
        ImageView logo = new ImageView(img);
        logo.setFitHeight(295);
        logo.setFitWidth(300);
        Group root = new Group(logo);
        Scene scene = new Scene(root, 300, 293);
        stage2.getIcons().add(new Image("file:resources\\images\\favicon.png"));
        stage2.setTitle("Creators Info");
        stage2.setResizable(false);
        stage2.setScene(scene);
        stage2.show();
    }
}
