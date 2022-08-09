/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mymatrixgui;

import Jama.Matrix;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class MyMatrix {
    
    MyMatrix(){
        //
    }
        
    public int[][] setMatrixDimension(int row,int col,char c){
        int[][] arr = new int [row][col];        
        
        switch (c) {
            case 'A':
                return setMatrixA(row,col,arr);
            case 'B':
                return setMatrixB(row,col,arr);
            default:
                return arr; // wrong?
        }
    }

    public int[][] setMatrixA(int row,int col,int m1[][]){
        int i,j;

        MymatrixGUI gui1 = new MymatrixGUI();

        for(i=0; i < row; i++){                             
            for(j=0; j < col;j++ ){        
                //System.out.print(Integer.parseInt(gui1.tfMatrixARow1.getText(j, j)));    
                
                if(i == 0){
                    String s1 = gui1.tfMatrixARow1.getText();
                    Pattern p = Pattern.compile("\\d{1,}");
                    Matcher m = p.matcher(s1);
                    while(m.find()) {
                        //System.out.println(m.group());
                        m1[i][j] = Integer.parseInt(m.group());
                        j++;
                    }
                    //j=0; ???
                    break;
                }

                if(i == 1){
                    String s2 = gui1.tfMatrixARow2.getText();
                    Pattern p = Pattern.compile("\\d{1,}");
                    Matcher m = p.matcher(s2);
                    while(m.find()) {
                        m1[i][j] = Integer.parseInt(m.group());
                        j++;
                    }
                    break;
                }

                if(i == 2){
                    String s3 = gui1.tfMatrixARow3.getText();
                    Pattern p = Pattern.compile("\\d{1,}");
                    Matcher m = p.matcher(s3);
                    while(m.find()) {
                        m1[i][j] = Integer.parseInt(m.group());
                        j++;
                    }
                    //j=0;
                    break;
                }                

            }
        }
        return m1;
        
    }
    
    public int[][] setMatrixB(int row,int col,int m2[][]){
        int i,j,value;
        MymatrixGUI gui2 = new MymatrixGUI();

        for(i=0; i < row; i++){                             
            for(j=0; j < col;j++ ){                           
                if(i == 0){
                    String s1 = gui2.tfMatrixBRow1.getText();
                    Pattern p = Pattern.compile("\\d{1,}");
                    Matcher m = p.matcher(s1);
                    while(m.find()) {
                        m2[i][j] = Integer.parseInt(m.group());
                        j++;
                    }
                    break;
                }

                if(i == 1){
                    String s2 = gui2.tfMatrixBRow2.getText();
                    Pattern p = Pattern.compile("\\d{1,}");
                    Matcher m = p.matcher(s2);
                    while(m.find()) {
                        m2[i][j] = Integer.parseInt(m.group());
                        j++;
                    }
                    break;
                }

                if(i == 2){
                    String s3 = gui2.tfMatrixBRow3.getText();
                    Pattern p = Pattern.compile("\\d{1,}");
                    Matcher m = p.matcher(s3);
                    while(m.find()) {
                        m2[i][j] = Integer.parseInt(m.group());
                        j++;
                    }
                    break;
                }
            }
        }
        return m2;
        
    }
    
    public int[][] MatrixAdd(int[][] m1,int[][] m2){
        if(m1 != null || m2 != null || m1.length != m2.length || m1[0].length != m2[0].length) 
            return null;

        int[][] m = new int[m1.length][m1[0].length];

        for(int i = 0; i < m.length; ++i){
            for (int j = 0; j < m[i].length; ++j){
                m[i][j] = m1[i][j] + m2[i][j];
            }
        }

        return m;
    }
    
    public int[][] MatrixSubtraction(int[][] m1,int[][] m2){
        if(m1 != null || m2 != null || m1.length != m2.length || m1[0].length != m2[0].length) 
            return null;

        int[][] m = new int[m1.length][m1[0].length];

        for(int i = 0; i < m.length; ++i){
            for (int j = 0; j < m[i].length; ++j){
                m[i][j] = m1[i][j] - m2[i][j];
            }
        }

        return m;
    }
    
    public int[][] MatrixMultiplication(int[][] m1,int[][] m2){
        if(m1 == null || m2 == null || m1[0].length != m2.length)
            return null;

        int[][] m = new int[m1.length][m2[0].length];
        for(int i = 0; i < m1.length; ++i){
            for(int j = 0; j < m2[0].length; ++j){
                for (int k = 0; k < m1[i].length; ++k){
                    m[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }
        return m;
    }
    
}