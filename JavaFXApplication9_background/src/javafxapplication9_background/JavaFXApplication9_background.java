/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication9_background;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author cn
 */
public class JavaFXApplication9_background extends Application {
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        Button b1 = new Button();
        b1.setText("这是按钮");
        b1.setLayoutX(200);
        b1.setLayoutY(50);
        b1.setPrefWidth(500);
        b1.setPrefHeight(200);

        // 设置按钮的字体
        b1.setFont(Font.font("sans-serif",40));
        //b1.setFont(Font.font(40));

        // 设置按钮的背景颜色
        BackgroundFill backgroundFill = new BackgroundFill(Paint.valueOf("#8FBC8F"), new CornerRadii(20), Insets.EMPTY);
        Background background = new Background(backgroundFill);
        b1.setBackground(background);

        // 设置按钮的边框
        BorderStroke borderStroke = new BorderStroke(Paint.valueOf("#8A2BE2"), BorderStrokeStyle.SOLID, new CornerRadii(20), new BorderWidths(10));
        Border border = new Border(borderStroke);
        b1.setBorder(border);

        // 设置按钮文字的颜色
        b1.setTextFill(Paint.valueOf("#CD0000"));


        Button b2 = new Button();
        b2.setText("这是按钮");
        b2.setLayoutX(100);
        b2.setLayoutY(300);
        b2.setPrefWidth(500);
        b2.setPrefHeight(200);

        b2.setStyle(
                "-fx-background-color: cadetblue;"+
                "-fx-background-radius: 20;"+
                "-fx-text-fill: antiquewhite;"+
                        "-fx-font-family: 'Microsoft YaHei UI';"+
                        "-fx-font-size: 50"
        );

        // 按钮单击事件
        b2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Button button = (Button)event.getSource();
                System.out.println(button.getText());
            }
        });

        Group group = new Group();
//        group.getChildren().add(b1);
//        group.getChildren().add(b2);
//        group.getChildren().add(b3);

        group.getChildren().addAll(b1,b2);


        Scene scene = new Scene(group);
        primaryStage.setScene(scene);
        primaryStage.setHeight(600);
        primaryStage.setWidth(800);
        primaryStage.show();
        primaryStage.centerOnScreen();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
