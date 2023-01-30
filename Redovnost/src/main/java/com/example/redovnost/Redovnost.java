package com.example.redovnost;

import javafx.animation.FillTransition;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.util.ArrayList;

import static com.example.redovnost.Writer.*;

public class Redovnost extends Application {      //Programa za vodenje evidencija na redovnost na vrabotenite vo Schatze Bitola 2

    Vraboten damjan = new Vraboten("Дамјан","Јовески",0,false);
    Vraboten lili = new Vraboten("Лилиен","Домазетоски",0,false);
    Vraboten simona = new Vraboten("Симона","Димоски",0,false);
    Vraboten kamelija = new Vraboten("Камелија","Србиновска",0,false);

    ArrayList<Vraboten> list = new ArrayList<Vraboten>();

    ArrayList<ToggleButton> buttonArrayList = new ArrayList<ToggleButton>();

    boolean otvoreno=false;


    @Override
    public void start(Stage stage) throws IOException {

        list.add(damjan);
        list.add(lili);
        list.add(kamelija);
        list.add(simona);

        stage.getIcons().add(new Image("D:\\Java\\Redovnost\\Redovnost\\src\\main\\resources\\com\\example\\redovnost\\icon.jpg"));

        Label info = new Label();


        BorderPane root = new BorderPane();
        root.setPadding(new Insets(15));

        stage.setTitle("Redovnost");


        Label title = new Label("Schatze Битола 2");
        title.setStyle("-fx-text-fill:#fffffe ");
        HBox hbox = new HBox();
        hbox.setAlignment(Pos.CENTER);
        hbox.getChildren().add(title);
        root.setTop(hbox);
        root.setStyle("-fx-background-color: #16161a");


        ToggleButton vraboten1 = new ToggleButton(damjan.ime);
        vraboten1.setOnAction(e -> {
            damjan.active = true;
            otvoreno = true;
            Rectangle rectangle = new Rectangle(vraboten1.getWidth(), vraboten1.getHeight(), (Color)vraboten1.getBackground().getFills().get(0).getFill());
            FillTransition ft = new FillTransition(Duration.millis(1800), rectangle, (Color)vraboten1.getBackground().getFills().get(0).getFill(), Color.valueOf("#7f5af0"));
            if (vraboten1.isSelected()) {
                ft.setFromValue(Color.valueOf("#16161a"));
                ft.setToValue(Color.valueOf("#7f5af0"));
                ft.setCycleCount(1);
                ft.setAutoReverse(false);
                ft.play();
                vraboten1.setStyle("-fx-background-color: #7f5af0; -fx-text-fill: #fffffe;");
            } else {
                ft.setFromValue(Color.valueOf("#7f5af0"));
                ft.setToValue(Color.valueOf("#16161a"));
                ft.setCycleCount(1);
                ft.setAutoReverse(false);
                ft.play();
                vraboten1.setStyle("-fx-background-color: #16161a; -fx-text-fill: #7f5af0; -fx-border-color: #7f5af0;");
            }
        });
        vraboten1.setTextFill(Paint.valueOf("#7f5af0"));
        vraboten1.setBackground(new Background(new BackgroundFill(Paint.valueOf("#16161a"), CornerRadii.EMPTY, Insets.EMPTY)));
        vraboten1.setBorder(new Border(new BorderStroke(Paint.valueOf("#7f5af0"), BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(2))));





        ToggleButton vraboten2 = new ToggleButton(lili.ime);
        vraboten2.setOnAction(e -> {
            lili.active = true;
            otvoreno = true;
            Rectangle rectangle = new Rectangle(vraboten2.getWidth(), vraboten2.getHeight(), (Color)vraboten2.getBackground().getFills().get(0).getFill());
            FillTransition ft = new FillTransition(Duration.millis(1800), rectangle, (Color)vraboten2.getBackground().getFills().get(0).getFill(), Color.valueOf("#7f5af0"));
            if (vraboten2.isSelected()) {
                ft.setFromValue(Color.valueOf("#16161a"));
                ft.setToValue(Color.valueOf("#7f5af0"));
                ft.setCycleCount(1);
                ft.setAutoReverse(false);
                ft.play();
                vraboten2.setStyle("-fx-background-color: #7f5af0; -fx-text-fill: #fffffe;");
            } else {
                ft.setFromValue(Color.valueOf("#7f5af0"));
                ft.setToValue(Color.valueOf("#16161a"));
                ft.setCycleCount(1);
                ft.setAutoReverse(false);
                ft.play();
                vraboten2.setStyle("-fx-background-color: #16161a; -fx-text-fill: #7f5af0; -fx-border-color: #7f5af0;");
            }
        });
        vraboten2.setTextFill(Paint.valueOf("#7f5af0"));
        vraboten2.setBackground(new Background(new BackgroundFill(Paint.valueOf("#16161a"), CornerRadii.EMPTY, Insets.EMPTY)));
        vraboten2.setBorder(new Border(new BorderStroke(Paint.valueOf("#7f5af0"), BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(2))));


        ToggleButton vraboten3 = new ToggleButton(simona.ime);
        vraboten3.setOnAction(e -> {
            simona.active = true;
            otvoreno = true;
            Rectangle rectangle = new Rectangle(vraboten3.getWidth(), vraboten3.getHeight(), (Color)vraboten3.getBackground().getFills().get(0).getFill());
            FillTransition ft = new FillTransition(Duration.millis(1800), rectangle, (Color)vraboten3.getBackground().getFills().get(0).getFill(), Color.valueOf("#7f5af0"));
            if (vraboten3.isSelected()) {
                ft.setFromValue(Color.valueOf("#16161a"));
                ft.setToValue(Color.valueOf("#7f5af0"));
                ft.setCycleCount(1);
                ft.setAutoReverse(false);
                ft.play();
                vraboten3.setStyle("-fx-background-color: #7f5af0; -fx-text-fill: #fffffe;");
            } else {
                ft.setFromValue(Color.valueOf("#7f5af0"));
                ft.setToValue(Color.valueOf("#16161a"));
                ft.setCycleCount(1);
                ft.setAutoReverse(false);
                ft.play();
                vraboten3.setStyle("-fx-background-color: #16161a; -fx-text-fill: #7f5af0; -fx-border-color: #7f5af0;");
            }
        });
        vraboten3.setTextFill(Paint.valueOf("#7f5af0"));
        vraboten3.setBackground(new Background(new BackgroundFill(Paint.valueOf("#16161a"), CornerRadii.EMPTY, Insets.EMPTY)));
        vraboten3.setBorder(new Border(new BorderStroke(Paint.valueOf("#7f5af0"), BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(2))));


        ToggleButton vraboten4 = new ToggleButton(kamelija.ime);
        vraboten4.setOnAction(e -> {
            kamelija.active = true;
            otvoreno = true;
            Rectangle rectangle = new Rectangle(vraboten4.getWidth(), vraboten4.getHeight(), (Color)vraboten4.getBackground().getFills().get(0).getFill());
            FillTransition ft = new FillTransition(Duration.millis(1800), rectangle, (Color)vraboten4.getBackground().getFills().get(0).getFill(), Color.valueOf("#7f5af0"));
            if (vraboten4.isSelected()) {
                ft.setFromValue(Color.valueOf("#16161a"));
                ft.setToValue(Color.valueOf("#7f5af0"));
                ft.setCycleCount(1);
                ft.setAutoReverse(false);
                ft.play();
                vraboten4.setStyle("-fx-background-color: #7f5af0; -fx-text-fill: #fffffe;");
            } else {
                ft.setFromValue(Color.valueOf("#7f5af0"));
                ft.setToValue(Color.valueOf("#16161a"));
                ft.setCycleCount(1);
                ft.setAutoReverse(false);
                ft.play();
                vraboten4.setStyle("-fx-background-color: #16161a; -fx-text-fill: #7f5af0; -fx-border-color: #7f5af0;");
            }
        });
        vraboten4.setTextFill(Paint.valueOf("#7f5af0"));
        vraboten4.setBackground(new Background(new BackgroundFill(Paint.valueOf("#16161a"), CornerRadii.EMPTY, Insets.EMPTY)));
        vraboten4.setBorder(new Border(new BorderStroke(Paint.valueOf("#7f5af0"), BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(2))));




        VBox vraboteni = new VBox();
        vraboteni.setAlignment(Pos.CENTER_LEFT);
        vraboteni.setSpacing(50);
        vraboteni.getChildren().addAll(vraboten1,vraboten2,vraboten3,vraboten4);
        root.setLeft(vraboteni);


        Button prva = new Button("Прва Смена");
        prva.setOnAction(e -> {
            try {
                writerPrva();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        prva.setStyle("-fx-background-color:#7f5af0;");
        prva.setTextFill(Paint.valueOf("#fffffe"));

        Button vtora = new Button("Втора Смена");
        vtora.setOnAction(e -> {
            try {
                writerVtora();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        vtora.setStyle("-fx-background-color:#7f5af0;");
        vtora.setTextFill(Paint.valueOf("#fffffe"));

        Button finish = new Button("Затвори");
        finish.setOnAction(e -> {
            try {
                writer.close();
                stage.close();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        finish.setStyle("-fx-background-color:#7f5af0;");
        finish.setTextFill(Paint.valueOf("#fffffe"));


        HBox centar = new HBox();
        centar.setAlignment(Pos.CENTER);
        centar.setSpacing(60);
        centar.getChildren().addAll(prva,vtora,finish);
        root.setCenter(centar);

        Scene scene = new Scene(root, 500, 400);
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }



    public static void main(String[] args) {
        launch();
    }
}