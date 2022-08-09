/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
import Jama.Matrix;
/**
 *
 * @author cn
 */
public class MyMatrix extends GUI {
    MyMatrix(){
    }
        
    public double[][] setMatrixDimension(int row,int col,char c){
        double[][] arr = new double [row][col];        
        
        switch (c) {
            case 'A':
                return setMatrixA(row,col,arr);
            case 'B':
                return setMatrixB(row,col,arr);
            default:
                return arr; // wrong?
        }
    }

    public double[][] setMatrixA(int row,int col,double m1[][]){
        int i,j;

        for(i = 0; i < row; i++){                             
            for(j = 0; j < col;j++ ){            
                
                if(i == 0){
                    String s1 = tfMatrixARow1.getText();   
                    m1[i][j] = Double.parseDouble(s1.substring(j, j+1));  
                }
                if(i == 1){
                    String s2 = tfMatrixARow2.getText();
                    m1[i][j] = Double.parseDouble(s2.substring(j, j+1));
                }

                if(i == 2){
                    String s3 = tfMatrixARow3.getText();
                    m1[i][j] = Double.parseDouble(s3.substring(j, j+1));
                }    
                if(i == 3){
                    String s4 = tfMatrixARow4.getText();
                    m1[i][j] = Double.parseDouble(s4.substring(j, j+1));
                }    

            }
        }
        return m1;
    }
    
    public double[][] setMatrixB(int row,int col,double m2[][]){
        int i,j;

        for(i=0; i < row; i++){                             
            for(j=0; j < col;j++ ){                           
                if(i == 0){
                    String s1 = tfMatrixBRow1.getText();
                    m2[i][j] = Double.parseDouble(s1.substring(j, j+1));
                }

                if(i == 1){
                    String s2 = tfMatrixBRow2.getText();
                    m2[i][j] = Double.parseDouble(s2.substring(j, j+1));
                }

                if(i == 2){
                    String s3 = tfMatrixBRow3.getText();
                    m2[i][j] = Double.parseDouble(s3.substring(j, j+1));
                }
                if(i == 3){
                    String s4 = tfMatrixBRow4.getText();
                    m2[i][j] = Double.parseDouble(s4.substring(j, j+1));
                }
            }
        }
        return m2;
        
    }
    
          
    public double[][] MatrixAdd(double[][] m1,double[][] m2){
        
//        if(m1 != null || m2 != null || m1.length != m2.length || m1[0].length != m2[0].length) 
//            return null;

        double[][] m = new double[m1.length][m1[0].length];

        for(int i = 0; i < m.length; ++i){
            for (int j = 0; j < m[i].length; ++j){
                m[i][j] = m1[i][j] + m2[i][j];
            }
        }

        return m;
    }
    
    public double[][] MatrixSubtraction(double[][] m1,double[][] m2){
//        if(m1 != null || m2 != null || m1.length != m2.length || m1[0].length != m2[0].length) 
//            return null;

        double[][] m = new double[m1.length][m1[0].length];

        for(int i = 0; i < m.length; ++i){
            for (int j = 0; j < m[i].length; ++j){
                m[i][j] = m1[i][j] - m2[i][j];
            }
        }

        return m;
    }
    
    public double[][] MatrixMultiplication(double[][] m1,double[][] m2){
//        if(m1 == null || m2 == null || m1[0].length != m2.length)
//            return null;

        double[][] m = new double[m1.length][m2[0].length];
        for(int i = 0; i < m1.length; ++i){
            for(int j = 0; j < m2[0].length; ++j){
                for (int k = 0; k < m1[i].length; ++k){
                    m[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }
        return m;
    }
    
    public double[][] MatrixDivision(double[][] m1,double[][] m2){
//        if(m1 == null || m2 == null || m1[0].length != m2.length)
//            return null;
        
        Matrix A = new Matrix(m1);
        Matrix B = new Matrix(m2);        
        Matrix C = A.arrayLeftDivide(B);   
        result = C.getArray();
        return result;
    }
}
