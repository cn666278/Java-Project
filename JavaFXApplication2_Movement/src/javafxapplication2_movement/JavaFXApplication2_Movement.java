/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication2_movement;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class JavaFXApplication2_Movement extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Text text = new Text(40,40,"Programming is fun.");
        Pane pane = new Pane(text);
        
        Button btUp = new Button("Up");
        Button btDown = new Button("Down");
        Button btLeft = new Button("Left");
        Button btRight = new Button("Right");
        HBox hBox = new HBox(btUp, btDown, btLeft, btRight);
        hBox.setSpacing(10);
        hBox.setAlignment(Pos.CENTER);
        
        BorderPane borderPane = new BorderPane(pane);
        borderPane.setBottom(hBox);
        
        btUp.setOnAction((ActionEvent e) -> {
            text.setY(text.getY() > 20 ? text.getY() - 5 : 20);             
        });
        
        btDown.setOnAction((e) -> {
            text.setY(text.getY() < pane.getHeight() ? text.getY() + 5 : pane.getHeight());             
        });
        
        btLeft.setOnAction( e -> {
            text.setX(text.getX() > 0 ? text.getX() - 5 : 0);             
        });
        
        btRight.setOnAction( e -> 
            text.setX(text.getX() < pane.getWidth() - 100 ? text.getX() + 5 : pane.getWidth() - 100)           
        );
        
        Scene scene = new Scene(borderPane, 400, 350);
        primaryStage.setTitle("AnonymousHandleDemo");
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
