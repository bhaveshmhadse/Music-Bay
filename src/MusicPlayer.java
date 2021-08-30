package sample;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.effect.Reflection;
import javafx.scene.image.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

import javax.sound.sampled.*;
import java.io.*;


class MusicPlayer extends Application {
    int fp, img, name, page, counter;

    MusicPlayer(int setfp, int setimg, int setName, int setPage) {
        fp = setfp;
        img = setimg;
        name = setName;
        page = setPage;
    }

    private Stage stage1;
    private Stage container = stage1;
    private Clip clip;
    private Pane musicPane = new Pane();
    private Reflection ref = new Reflection();
    private Button play = new Button("||");
    private Button forward = new Button(">>");
    private Button rewind = new Button("<<");
    private Slider slider = new Slider();
    private Label start = new Label("0.00");
    private Label end = new Label("10.0");
    private Label artistName;
    private Button back = new Button("<");
    private Button colon = new Button(":");

    public void start(Stage s) throws Exception {
        String[] filepaths = new String[5];
        String[] names = new String[5];
        Image songLogo = null, songlogo2 = null, songlogo3 = null, songlogo4 = null, songlogo5 = null;
        ImageView logo;
        Image[] imagescontainer = new Image[5];
        Image img2 = new Image(new FileInputStream("resources\\images\\front 1.jpg"));
        ImageView logo2 = new ImageView(img2);
        logo2.setX(0);
        logo2.setY(0);
        logo2.setFitHeight(400);
        logo2.setFitWidth(400);


        if (page == 1) {
            filepaths = new String[]{"resources\\songs\\breathless.wav",
                    "resources\\songs\\udd.wav",
                    "resources\\songs\\dheeme.wav",
                    "resources\\songs\\mast.wav",
                    "resources\\songs\\ambarsariya.wav"};
            names = new String[]{"Breathless | S Mahadevan ", "Udd Gaye | Ritviz", "Dheeme Dheeme | Tony Kakkar", "Mast Magan | 2 States", "Ambarsariya | Fukrey"};
            artistName = new Label(names[name]);
            try {
                songLogo = new Image(new FileInputStream("resources\\images\\breathless.png"));
                songlogo2 = new Image(new FileInputStream("resources\\images\\udd.png"));
                songlogo3 = new Image(new FileInputStream("resources\\images\\dheeme.jpg"));
                songlogo4 = new Image(new FileInputStream("resources\\images\\two.png"));
                songlogo5 = new Image(new FileInputStream("resources\\images\\ambar.png"));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            imagescontainer = new Image[]{songLogo, songlogo2, songlogo3, songlogo4, songlogo5};
        }
        if (page == 2) {
            filepaths = new String[]{"resources\\songs\\breakup.wav",
                    "resources\\songs\\iski.wav",
                    "resources\\songs\\naari.wav",
                    "resources\\songs\\saki.wav",
                    "resources\\songs\\kam.wav"};
            names = new String[]{"Breakup Song | Ae Dil hai Mushkil", "Iski Uski | 2 States", "Naari Naari | Made in China", "O Saki Saki | Batla House", "Ek To Kam Zindagani"};
            artistName = new Label(names[name]);
            try {
                songLogo = new Image(new FileInputStream("resources\\images\\adhm2.png"));
                songlogo2 = new Image(new FileInputStream("resources\\images\\two.png"));
                songlogo3 = new Image(new FileInputStream("resources\\images\\naari.jpg"));
                songlogo4 = new Image(new FileInputStream("resources\\images\\saki.jpg"));
                songlogo5 = new Image(new FileInputStream("resources\\images\\kam.png"));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            imagescontainer = new Image[]{songLogo, songlogo2, songlogo3, songlogo4, songlogo5};
        }
        if (page == 3) {
            filepaths = new String[]{"resources\\songs\\sajan.wav",
                    "resources\\songs\\yaad.wav",
                    "resources\\songs\\ched.wav",
                    "resources\\songs\\channa.wav",
                    "resources\\songs\\mast.wav"};
            names = new String[]{"Sajan Bin | Bandish Bandits", "Yaad Piya Ki Aane Lagi", "Chedkhaaniyaa | Bandish Bandits", "Channa Mereya", "Man Mast Magan"};
            artistName = new Label(names[name]);
            try {
                songLogo = new Image(new FileInputStream("resources\\images\\bandits.jpg"));
                songlogo2 = new Image(new FileInputStream("resources\\images\\yaad.jpeg"));
                songlogo3 = new Image(new FileInputStream("resources\\images\\bandits.jpg"));
                songlogo4 = new Image(new FileInputStream("resources\\images\\adhm2.png"));
                songlogo5 = new Image(new FileInputStream("resources\\images\\two.png"));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            imagescontainer = new Image[]{songLogo, songlogo2, songlogo3, songlogo4, songlogo5};
        }
        if (page == 4) {
            filepaths = new String[]{"resources\\songs\\sage.wav",
                    "resources\\songs\\adhm.wav",
                    "resources\\songs\\locha.wav",
                    "resources\\songs\\ambarsariya.wav",
                    "resources\\songs\\chalo.wav"};
            names = new String[]{"Sage | Ritviz", "Ae Dil Hai Mushkil", "Locha-E-Ulfat | 2 States", "Ambarsariya | Fukrey", "Chalo Chalein | Ritviz"};
            artistName = new Label(names[name]);
            try {
                songLogo = new Image(new FileInputStream("resources\\images\\sage.jpg"));
                songlogo2 = new Image(new FileInputStream("resources\\images\\adhm2.png"));
                songlogo3 = new Image(new FileInputStream("resources\\images\\two.png"));
                songlogo4 = new Image(new FileInputStream("resources\\images\\ambar.png"));
                songlogo5 = new Image(new FileInputStream("resources\\images\\chalo.png"));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            imagescontainer = new Image[]{songLogo, songlogo2, songlogo3, songlogo4, songlogo5};
        }
        if (page == 5) {
            filepaths = new String[]{"resources\\songs\\dheeme.wav",
                    "resources\\songs\\goa.wav",
                    "resources\\songs\\udd.wav",
                    "resources\\songs\\cutiepie.wav",
                    "resources\\songs\\liggi.wav"};
            names = new String[]{"Dheeme Dheeme", "Goa Beach", "Udd Gaye | Ritviz", "Cutiepie | Ae Dil Hai Mushkil", "Liggi | Ritviz "};
            artistName = new Label(names[name]);
            try {
                songLogo = new Image(new FileInputStream("resources\\images\\dheeme.jpg"));
                songlogo2 = new Image(new FileInputStream("resources\\images\\goa.jpg"));
                songlogo3 = new Image(new FileInputStream("resources\\images\\udd.png"));
                songlogo4 = new Image(new FileInputStream("resources\\images\\adhm2.png"));
                songlogo5 = new Image(new FileInputStream("resources\\images\\liggi.jpg"));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            imagescontainer = new Image[]{songLogo, songlogo2, songlogo3, songlogo4, songlogo5};
        }
        if (page == 6) {
            filepaths = new String[]{"resources\\songs\\bhaag.wav",
                    "resources\\songs\\sultan.wav",
                    "resources\\songs\\dangal.wav",
                    "resources\\songs\\biba.wav",
                    "resources\\songs\\nashe.wav"};
            names = new String[]{"Bhaag Milkha Bhaag", "Sultan", "Dangal Dangal", "Biba | Marshmallow", "Nashe Si Chad Gayi | Befikre"};
            artistName = new Label(names[name]);
            try {
                songLogo = new Image(new FileInputStream("resources\\images\\bhaag.png"));
                songlogo2 = new Image(new FileInputStream("resources\\images\\sultan.jpg"));
                songlogo3 = new Image(new FileInputStream("resources\\images\\dangal.jpg"));
                songlogo4 = new Image(new FileInputStream("resources\\images\\biba.png"));
                songlogo5 = new Image(new FileInputStream("resources\\images\\nashe.jpg"));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            imagescontainer = new Image[]{songLogo, songlogo2, songlogo3, songlogo4, songlogo5};
        }
        if (page == 7) {
            filepaths = new String[]{"resources\\songs\\liggi.wav",
                    "resources\\songs\\udd.wav",
                    "resources\\songs\\raahi.wav",
                    "resources\\songs\\chalo.wav",
                    "resources\\songs\\sage.wav"};
            names = new String[]{"Liggi | Ritviz", "Udd Gaye | Ritviz", "Raahi | Ritviz", "Chalo Chalein | Ritviz", "Sage | Ritviz"};
            artistName = new Label(names[name]);
            try {
                songLogo = new Image(new FileInputStream("resources\\images\\liggi.jpg"));
                songlogo2 = new Image(new FileInputStream("resources\\images\\udd.png"));
                songlogo3 = new Image(new FileInputStream("resources\\images\\raahi.jpg"));
                songlogo4 = new Image(new FileInputStream("resources\\images\\chalo.png"));
                songlogo5 = new Image(new FileInputStream("resources\\images\\sage.jpg"));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            imagescontainer = new Image[]{songLogo, songlogo2, songlogo3, songlogo4, songlogo5};
        }
        if (page == 8) {
            filepaths = new String[]{"resources\\songs\\tum.wav",
                    "resources\\songs\\maahi.wav",
                    "resources\\songs\\pal.wav",
                    "resources\\songs\\tujhe.wav",
                    "resources\\songs\\khairiyat.wav"};
            names = new String[]{"Tum Hi Ho | Aashiqui 2", "Ve Maahi | Kesari", "Pal Pal Dil Ke Paas", "Tujhe Kitna Chahane Lage", "Khairiyat | Chhichore"};
            artistName = new Label(names[name]);
            try {
                songLogo = new Image(new FileInputStream("resources\\images\\tum.jpg"));
                songlogo2 = new Image(new FileInputStream("resources\\images\\maahi.png"));
                songlogo3 = new Image(new FileInputStream("resources\\images\\pal.jpg"));
                songlogo4 = new Image(new FileInputStream("resources\\images\\tujhe.png"));
                songlogo5 = new Image(new FileInputStream("resources\\images\\khairiyat.png"));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            imagescontainer = new Image[]{songLogo, songlogo2, songlogo3, songlogo4, songlogo5};
        }
        if (page == 9) {
            filepaths = new String[]{"C:\\Users\\acer\\IdeaProjects\\MUSIC BAY\\resources\\songs\\breathless.wav",
                    "resources\\songs\\kajra.wav",
                    "resources\\songs\\sur.wav",
                    "resources\\songs\\desi.wav",
                    "resources\\songs\\gallan.wav"};
            names = new String[]{"Breathless", "Kajra Re", "Sur Niragas Ho", "Desi Girl | Dostana", "Gallan Goodiyaan | Dil Dhadakne Do"};
            artistName = new Label(names[name]);
            try {
                songLogo = new Image(new FileInputStream("resources\\images\\breathless.png"));
                songlogo2 = new Image(new FileInputStream("resources\\images\\kajra.png"));
                songlogo3 = new Image(new FileInputStream("resources\\images\\sur.jpg"));
                songlogo4 = new Image(new FileInputStream("resources\\images\\desi.jpg"));
                songlogo5 = new Image(new FileInputStream("resources\\images\\gallan.png"));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            imagescontainer = new Image[]{songLogo, songlogo2, songlogo3, songlogo4, songlogo5};
        }
        if (page == 10) {
            filepaths = new String[]{"resources\\songs\\locha.wav",
                    "resources\\songs\\mast.wav",
                    "resources\\songs\\offo.wav",
                    "resources\\songs\\iski.wav",
                    "resources\\songs\\chaandaniya.wav"};
            names = new String[]{"Locha-E-Ulfat", "Mast Magan", "Offo", "Iski Uski", "Chaandaniya"};
            artistName = new Label(names[name]);
            try {
                songLogo = new Image(new FileInputStream("resources\\images\\two.png"));
                songlogo2 = new Image(new FileInputStream("resources\\images\\two.png"));
                songlogo3 = new Image(new FileInputStream("resources\\images\\two.png"));
                songlogo4 = new Image(new FileInputStream("resources\\images\\two.png"));
                songlogo5 = new Image(new FileInputStream("resources\\images\\two.png"));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            imagescontainer = new Image[]{songLogo, songlogo2, songlogo3, songlogo4, songlogo5};
        }
        if (page == 11) {
            filepaths = new String[]{"resources\\songs\\adhm.wav",
                    "resources\\songs\\channa.wav",
                    "resources\\songs\\bulleya.wav",
                    "resources\\songs\\breakup.wav",
                    "resources\\songs\\cutiepie.wav"};
            names = new String[]{"Ae Dil Hai Mushkil", "Channa Mereya", "Bulleya", "Breakup Song", "Cutiepie"};
            artistName = new Label(names[name]);
            try {
                songLogo = new Image(new FileInputStream("resources\\images\\adhm2.png"));
                songlogo2 = new Image(new FileInputStream("resources\\images\\adhm2.png"));
                songlogo3 = new Image(new FileInputStream("resources\\images\\adhm2.png"));
                songlogo4 = new Image(new FileInputStream("resources\\images\\adhm2.png"));
                songlogo5 = new Image(new FileInputStream("resources\\images\\adhm2.png"));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            imagescontainer = new Image[]{songLogo, songlogo2, songlogo3, songlogo4, songlogo5};
        }
        if (page == 12) {
            filepaths = new String[]{"resources\\songs\\sajan.wav",
                    "resources\\songs\\ched.wav",
                    "resources\\songs\\padharo.wav",
                    "resources\\songs\\garaj.wav",
                    "resources\\songs\\couple.wav"};
            names = new String[]{"Sajan Bin | Bandish Bandits", "Chedkhaniyaan | Bandish Bandits", "Padharo Mhare Des | Bandish Bandits", "Garaj Garaj | Bandish Bandits", "Couple Goals | Bandish Bandits",};
            artistName = new Label(names[name]);
            try {
                songLogo = new Image(new FileInputStream("resources\\images\\bandits.jpg"));
                songlogo2 = new Image(new FileInputStream("resources\\images\\bandits.jpg"));
                songlogo3 = new Image(new FileInputStream("resources\\images\\bandits.jpg"));
                songlogo4 = new Image(new FileInputStream("resources\\images\\bandits.jpg"));
                songlogo5 = new Image(new FileInputStream("resources\\images\\bandits.jpg"));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            imagescontainer = new Image[]{songLogo, songlogo2, songlogo3, songlogo4, songlogo5};
        }


        musicPane.prefHeight(400);
        musicPane.prefWidth(400);
        musicPane.maxHeight(400);
        musicPane.maxWidth(400);
        musicPane.setStyle("-fx-background-color: black;");
        play.setLayoutX(185);
        play.setLayoutY(307);
        play.setStyle("-fx-background-color: #f12929; -fx-background-radius: 1000;");
        play.setTextFill(Color.WHITE);
        play.setFont(Font.font("Fira Code", 14));
        Group newroot;
        Scene scene;
        forward.setLayoutX(219);
        forward.setLayoutY(307);
        forward.setStyle("-fx-background-color: Black; -fx-background-radius: 1000;");
        forward.setTextFill(Color.WHITE);
        forward.setFont(Font.font("Fira Code", 14));
        rewind.setLayoutX(136);
        rewind.setLayoutY(307);
        rewind.setStyle("-fx-background-color: Black; -fx-background-radius: 1000;");
        rewind.setTextFill(Color.WHITE);
        rewind.setFont(Font.font("Fira Code", 14));


        start.setLayoutX(30);
        start.setLayoutY(302);
        start.setTextFill(Color.LIGHTYELLOW);
        start.setFont(Font.font("Fira Code", 11));
        end.setLayoutX(349);
        end.setLayoutY(294);
        end.setTextFill(Color.LIGHTYELLOW);
        end.setFont(Font.font("Fira Code", 11));
        artistName = new Label(names[name]);
        artistName.setLayoutX(32);
        artistName.setLayoutY(277);
        artistName.prefHeight(21);
        artistName.prefWidth(123);
        artistName.setTextFill(Color.WHITE);
        artistName.setFont(Font.font("Tw Cen MT", 18));
        back.setLayoutX(6);
        back.setLayoutY(14);
        back.setStyle("-fx-background-color: Transparent;");
        back.setTextFill(Color.RED);
        back.setFont(Font.font("Fira Code", 20));
        colon.setLayoutX(359);
        colon.setLayoutY(14);
        colon.setStyle("-fx-background-color: Transparent;");
        colon.setTextFill(Color.RED);
        colon.setFont(Font.font("Fira Code", 20));
        logo = new ImageView(imagescontainer[img]);
        logo.setLayoutX(110);
        logo.setLayoutY(61);
        logo.setFitWidth(189);
        logo.setFitHeight(183);
        ref.setFraction(0.45);
        ref.setTopOffset(1);
        ref.setTopOpacity(0.2);
        logo.setPreserveRatio(true);
        logo.setEffect(ref);
        newroot = new Group(logo2, musicPane, logo, play, forward, rewind, artistName, back, colon);
        scene = new Scene(newroot, 400, 400);
        scene.setFill(Color.BLACK);
        stage1 = new Stage();
        stage1.setScene(scene);
        stage1.show();
        stage1.setTitle("MUSIC BAY - Unleash the Music");
        stage1.getIcons().add(new Image("file:resources\\images\\favicon.png"));
        stage1.setResizable(false);
        Stage finalStage = stage1;
        AudioInputStream audioInputStream;
        for (int i = 1; i < 2; i++) {
            String filepath = filepaths[fp];
            try {
                audioInputStream = AudioSystem.getAudioInputStream(new File(filepath).getAbsoluteFile());
                clip = AudioSystem.getClip();
                clip.open(audioInputStream);
                clip.start();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        EventHandler<MouseEvent> handle = new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (event.getSource() == play) {
                    if (play.getText() == "||") {
                        play.setText("|>");
                        clip.stop();
                    } else if (play.getText() == "|>") {
                        play.setText("||");
                        clip.start();
                    }
                }
                if (event.getSource() == forward) {
                    try {
                        if (fp == 4) {
                            stage1.close();
                            clip.close();
                        } else {
                            fp++;
                            img++;
                            name++;
                            stage1.close();
                            clip.close();
                            start(stage1);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                if (event.getSource() == rewind) {
                    try {
                        if (fp == 0) {
                            stage1.close();
                            clip.close();
                        } else {
                            img--;
                            fp--;
                            name--;
                            if (clip != null) {
                                clip.close();
                            }
                            stage1.close();
                            start(stage1);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                if (event.getSource() == back) {
                    clip.close();
                    stage1.close();
                }
            }
        };
        play.setOnMouseClicked(handle);
        forward.setOnMouseClicked(handle);
        rewind.setOnMouseClicked(handle);
        back.setOnMouseClicked(handle);
        EventHandler<WindowEvent> handler = new EventHandler<WindowEvent>() {
            @Override
            public void handle(WindowEvent windowEvent) {
                windowEvent.consume();
                if (windowEvent.isConsumed()) clip.stop();
                finalStage.close();
            }
        };

        stage1.setOnCloseRequest(handler);
    }

}



/*





 GREETINGS FROM
 -- MUSIC BAY --
 SE IT A
 04 : ATHARVA BHAGAT
 17 : YOGESH GHATE
 31 : BHAVESH MHADSE

 SEM 3 - IT
 JAVA MINI PROJECT  THANK YOU !!

 DATTA MEGHE COLLEGE
 OF ENGINEERING,
 AIROLI


















*/




























