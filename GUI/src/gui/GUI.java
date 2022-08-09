/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Pos;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author cn
 */
public class GUI extends Application {
    
    private TextField tfRowOfMatrixA = new TextField();
    private TextField tfColumnOfMatrixA = new TextField();
    public static TextField tfMatrixARow1 = new TextField();    // Must be static!!!
    public static TextField tfMatrixARow2 = new TextField();
    public static TextField tfMatrixARow3 = new TextField();
    public static TextField tfMatrixARow4 = new TextField();
    
    private TextField tfRowOfMatrixB = new TextField();
    private TextField tfColumnOfMatrixB = new TextField();
    public static TextField tfMatrixBRow1 = new TextField();
    public static TextField tfMatrixBRow2 = new TextField();
    public static TextField tfMatrixBRow3 = new TextField();
    public static TextField tfMatrixBRow4 = new TextField();
    
    public TextField tfResultRow1 = new TextField();
    public TextField tfResultRow2 = new TextField();
    public TextField tfResultRow3 = new TextField();
    public TextField tfResultRow4 = new TextField();
    
    private Button btSet = new Button("Set");
    private Button btAdd = new Button("Add");
    private Button btMinus = new Button("Minus");
    private Button btMulti = new Button("Multi");
    private Button btDivide = new Button("Divide");
    
    /**
     *
     */
    public double[][] m1;    
    public double[][] m2;
    public double[][] result;
    public int rowA,colA,rowB,colB,rowResult,colResult;
    
    @Override
    public void start(Stage primaryStage) {
        // Create UI

        GridPane gridPane = new GridPane();
        gridPane.setHgap(20);
        gridPane.setVgap(8);

        gridPane.add(new Label("Dimension Of Matrix A (Row , Column):"), 0 , 0);

        gridPane.add(tfRowOfMatrixA, 1 , 0);
        gridPane.add(tfColumnOfMatrixA, 2 , 0);
        
        gridPane.add(new Label("Matrix Row 1:"), 0 , 1);
        gridPane.add(tfMatrixARow1, 1 , 1);
        gridPane.add(new Label("Matrix Row 2:"), 0 , 2);
        gridPane.add(tfMatrixARow2, 1 , 2);
        gridPane.add(new Label("Matrix Row 3:"), 0 , 3);
        gridPane.add(tfMatrixARow3, 1 , 3);
        gridPane.add(new Label("Matrix Row 4:"), 0 , 4);
        gridPane.add(tfMatrixARow4, 1 , 4);        
        
                
        gridPane.add(new Label("Dimension Of Matrix B (Row , Column):"), 0 , 8);
        
        gridPane.add(tfRowOfMatrixB, 1 , 8);
        gridPane.add(tfColumnOfMatrixB, 2 , 8);
        
        gridPane.add(new Label("Matrix Row 1:"), 0 , 9);
        gridPane.add(tfMatrixBRow1, 1 , 9);
        gridPane.add(new Label("Matrix Row 2:"), 0 , 10);
        gridPane.add(tfMatrixBRow2, 1 , 10);
        gridPane.add(new Label("Matrix Row 3:"), 0 , 11);
        gridPane.add(tfMatrixBRow3, 1 , 11);
        gridPane.add(new Label("Matrix Row 4:"), 0 , 12);
        gridPane.add(tfMatrixBRow4, 1 , 12);
        
        gridPane.add(new Label("Result Matrix:"), 0 , 18);        
        gridPane.add(tfResultRow1, 1 , 18);
        gridPane.add(tfResultRow2, 1 , 19);
        gridPane.add(tfResultRow3, 1 , 20);
        gridPane.add(tfResultRow4, 1 , 21);

        gridPane.add(btAdd, 1 , 14);
        gridPane.add(btMinus, 1 , 14);
        gridPane.add(btMulti, 1 , 15);
        gridPane.add(btDivide, 1 , 15);       
        gridPane.add(btSet, 1 , 13);
        
        gridPane.add(new Label(" (Attention: Each time you change the value"), 2 ,13);
        gridPane.add(new Label("     in matrix, you should set the matrix first.)"), 2 ,14);
        
        Image image = new Image("gui/img1.jpg");
        gridPane.add(new ImageView(image), 0 , 22);
        
        // Set properties for UI
        
        // Set botton color
        BackgroundFill backgroundFill1 = new BackgroundFill(Paint.valueOf("#87CEFA"), new CornerRadii(20), Insets.EMPTY);
        Background background1 = new Background(backgroundFill1);
        BackgroundFill backgroundFill2 = new BackgroundFill(Paint.valueOf("#87CEFA"), new CornerRadii(20), Insets.EMPTY);
        Background background2 = new Background(backgroundFill2);
        BackgroundFill backgroundFill3 = new BackgroundFill(Paint.valueOf("#87CEFA"), new CornerRadii(20), Insets.EMPTY);
        Background background3 = new Background(backgroundFill3);
        BackgroundFill backgroundFill4 = new BackgroundFill(Paint.valueOf("#87CEFA"), new CornerRadii(20), Insets.EMPTY);
        Background background4 = new Background(backgroundFill4);
        btAdd.setBackground(background1);
        btMinus.setBackground(background2);
        btMulti.setBackground(background3);
        btDivide.setBackground(background4);
        gridPane.setAlignment(Pos.CENTER);
        
        // Set grid pane color
        gridPane.setStyle("-fx-background-color: #87CEFA;");
        
        btAdd.setFont(Font.font("sans-serif",15));
        btMinus.setFont(Font.font("sans-serif",15));
        btMulti.setFont(Font.font("sans-serif",15));
        btDivide.setFont(Font.font("sans-serif",15));
        btSet.setFont(Font.font("sans-serif",17));
        btSet.setTextFill(Paint.valueOf("#4169E1"));
        
        BorderStroke borderStroke = new BorderStroke(Paint.valueOf("#AFEEEE"), BorderStrokeStyle.SOLID, new CornerRadii(0), new BorderWidths(5));
        Border border = new Border(borderStroke);
        btAdd.setBorder(border);
        btMinus.setBorder(border);
        btMulti.setBorder(border);
        btDivide.setBorder(border);
        
        tfRowOfMatrixA.setAlignment(Pos.BOTTOM_RIGHT);
        tfColumnOfMatrixA.setAlignment(Pos.BOTTOM_RIGHT);
        tfMatrixARow1.setAlignment(Pos.BOTTOM_RIGHT);
        tfMatrixARow2.setAlignment(Pos.BOTTOM_RIGHT);
        tfMatrixARow3.setAlignment(Pos.BOTTOM_RIGHT);
        tfMatrixARow4.setAlignment(Pos.BOTTOM_RIGHT);
        
        tfRowOfMatrixB.setAlignment(Pos.BOTTOM_RIGHT);
        tfColumnOfMatrixB.setAlignment(Pos.BOTTOM_RIGHT);
        tfMatrixBRow1.setAlignment(Pos.BOTTOM_RIGHT);
        tfMatrixBRow2.setAlignment(Pos.BOTTOM_RIGHT);
        tfMatrixBRow3.setAlignment(Pos.BOTTOM_RIGHT);
        tfMatrixBRow4.setAlignment(Pos.BOTTOM_RIGHT);
        
        tfResultRow1.setAlignment(Pos.BOTTOM_RIGHT);
        tfResultRow2.setAlignment(Pos.BOTTOM_RIGHT);
        tfResultRow3.setAlignment(Pos.BOTTOM_RIGHT);
        tfResultRow4.setAlignment(Pos.BOTTOM_RIGHT);
        tfResultRow1.setEditable(false);
        tfResultRow2.setEditable(false);
        tfResultRow3.setEditable(false);
        tfResultRow4.setEditable(false);
        
        GridPane.setHalignment(btAdd, HPos.LEFT);
        GridPane.setHalignment(btMinus, HPos.RIGHT);
        GridPane.setHalignment(btMulti, HPos.LEFT);
        GridPane.setHalignment(btDivide, HPos.RIGHT);
        GridPane.setHalignment(btSet, HPos.RIGHT);        
        
        
        // Process events
        MyMatrix my1 = new MyMatrix();
        btSet.setOnAction(e -> setMatrix());
        
        
        //add        
        btAdd.setOnAction(e -> {
            result = my1.MatrixAdd(m1,m2);
            rowResult = rowA;
            colResult = colA;
            getResult(result,rowResult,colResult);
        });
        
        //minus
        btMinus.setOnAction(e -> {
            result = my1.MatrixSubtraction(m1, m2);
            rowResult = rowA;
            colResult = colA;
            getResult(result,rowResult,colResult);
        });
        
        //multi
        btMulti.setOnAction(e -> {
            result = my1.MatrixMultiplication(m1, m2);
            rowResult = rowA;
            colResult = colB;
            getResult(result,rowResult,colResult);
        });

        
        //divide
        btDivide.setOnAction(e -> {           
            result = my1.MatrixDivision(m1, m2);
            rowResult = rowA;
            colResult = colB;
            getResult(result,rowResult,colResult);
        });  
        
        
        
        // Create a scene and place it in the stage
        
        Scene scene = new Scene(gridPane, 950, 800);  
        primaryStage.setTitle("MatrixCalculate");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public void getResult(double[][] result,int row,int col){
        // Using StringBuilder for editing the output of result matrix
        
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();
        StringBuilder str3 = new StringBuilder();
        StringBuilder str4 = new StringBuilder();
                
        
        for(int i = 0; i < row; i++){
            if( i == 0 ){
                for(int j = 0; j < col; j++){
                    str1.append(String.valueOf(result[0][j])); 
                    str1.append("  ");                
                }
            }
                
            else if( i == 1 ){
                for(int j = 0; j < col; j++){
                    str2.append(String.valueOf(result[1][j])); 
                    str2.append("  ");                
                }
            }

            else if( i == 2 ){
                for(int j = 0; j < col; j++){
                    str3.append(String.valueOf(result[2][j])); 
                    str3.append("  ");                
                }                        
            }
            else if( i == 3 ){
                for(int j = 0; j < col; j++){
                    str4.append(String.valueOf(result[3][j])); 
                    str4.append("  ");                
                }                        
            }
            else
                break;
            
            tfResultRow1.setText(str1.toString());
            tfResultRow2.setText(str2.toString());
            tfResultRow3.setText(str3.toString());
            tfResultRow4.setText(str4.toString());
        }
        
    }
    
    private void setMatrix(){        
        // Set the matrix with input dimensions from user                 
       
        rowA = Integer.parseInt(tfRowOfMatrixA.getText());
        colA = Integer.parseInt(tfColumnOfMatrixA.getText());
        rowB = Integer.parseInt(tfRowOfMatrixB.getText());
        colB = Integer.parseInt(tfColumnOfMatrixB.getText());

        MyMatrix myMatrixA = new MyMatrix();
        m1 = myMatrixA.setMatrixDimension(rowA,colA,'A');
               
        MyMatrix myMatrixB = new MyMatrix();                             
        m2 = myMatrixB.setMatrixDimension(rowB,colB,'B');
        
    }
                 
    public static void main(String[] args) {
        launch(args);
    }
    
}
