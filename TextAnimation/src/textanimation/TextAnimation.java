/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textanimation;

import javafx.animation.Animation;
import javafx.application.Application;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
//import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.util.Duration;
import javafx.stage.Stage;

/**
 *
 * @author cn
 */
public class TextAnimation extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        StackPane pane = new StackPane();
        Text text = new Text(20, 50, "I am not a gay!");
        text.setFill(Color.BLUE);
        text.setFont(Font.font("sans-serif",25));

        pane.getChildren().add(text);
        
        // Create a handler for changing text
        EventHandler<ActionEvent> eventHandler = e -> {
            if(text.getText().length() != 0){
                text.setText("");
            }
            else{
                text.setText("I am not a gay!");
            }            
        };
        
        // Create a animation for alternating text
        Timeline animation = new Timeline(new KeyFrame(Duration.millis(1700),eventHandler));
        animation.setCycleCount(Timeline.INDEFINITE);
        animation.play();
        
        //Pause and resume animation
        text.setOnMouseClicked(e -> {
            if(animation.getStatus() == Animation.Status.PAUSED){
                animation.play();
            }
            else{
                animation.pause();
            }
        });
        
        Scene scene = new Scene(pane, 300, 250);
        
        primaryStage.setTitle("TextAnimation");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
