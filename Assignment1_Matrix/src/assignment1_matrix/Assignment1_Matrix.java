/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1_matrix;

import Jama.Matrix;
// 打印矩阵，第一个参数是每一列的宽度，第二个参数是保留的小数点位数
// matrix.inverse().print(3,2);

public class Assignment1_Matrix {

    public static double[][] MatrixAdd(double[][] m1,double[][] m2){
        if(m1 != null || m2 != null || m1.length != m2.length || m1[0].length != m2[0].length) 
            return null;

        double[][] m = new double[m1.length][m1[0].length];

        for(int i = 0; i < m.length; ++i){
            for (int j = 0; j < m[i].length; ++j){
                m[i][j] = m1[i][j] + m2[i][j];
            }
        }

        return m;
    }

    //矩阵转置
    /*
    public static double[][] MatrixTranspose(double[][] m){
        if (m == null) 
            return null;
        double[][] mt = new double[m[0].length][m.length];
        for(int i = 0; i < m.length; ++i){
            for (int j = 0; j < m[i].length; ++j){
                mt[j][i] = m[i][j];
            }
        }
        return mt;
    }
    */

    //矩阵相乘 C=A*B
    public static double[][] MatrixMultiply(double[][] m1,double[][] m2){
        if(m1 == null || m2 == null || m1[0].length != m2.length)
            return null;

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
    
    
    public double[][] MatrixDivide(double[][] m1,double[][] m2){
    
        if (m2 == null) {
            return null;
        }
        // "矩阵的除法要求两个矩阵都是方阵，而且行数相等！"
        if(m1 == null || m2 == null || m1[0].length != m2.length)
            return null;
        /*
        if (!m1.isSquareMatrix() || (!m2.isSquareMatrix()) || (m1.matrixData.length != m2.getMatrixData().length)) {
            System.out.println("矩阵的除法要求两个矩阵都是方阵，而且行数相等！");
            return null;
        }
        */
        
        //getReverseMartrix(data);
        // 返回本矩阵与b的逆矩阵的乘积
        return MatrixMultiply(getReverseMartrix(m1),m2);
    }
    
    
    /*
     * 求(h,v)坐标的位置的余子式
     */
    public double[][] getConfactor(double[][] data, int h, int v) {
        int H = data.length;
        int V = data[0].length;
        double[][] newdata = new double[H-1][V-1];
        for(int i=0; i<newdata.length; i++) {
            if(i < h-1) {
                for(int j=0; j<newdata[i].length; j++) {
                    if(j < v-1) {
                        newdata[i][j] = data[i][j];
                    }else {
                        newdata[i][j] = data[i][j+1];
                    }
                }
            }else {
                for(int j=0; j<newdata[i].length; j++) {
                    if(j < v-1) {
                        newdata[i][j] = data[i+1][j];
                    }else {
                        newdata[i][j] = data[i+1][j+1];
                    }
                }
            }
        }

//      for(int i=0; i<newdata.length; i ++)
//          for(int j=0; j<newdata[i].length; j++) {
//              System.out.println(newdata[i][j]);
//          }
        return newdata;
    }

    /*
     * 计算行列式的值
     */
    public double getMartrixResult(double[][] data) {
        /*
         * 二维矩阵计算
         */
        if(data.length == 2) {
            return data[0][0]*data[1][1] - data[0][1]*data[1][0];
        }
        /*
         * 二维以上的矩阵计算
         */
        double result = 0;
        int num = data.length;
        double[] nums = new double[num];
        for(int i = 0; i < data.length; i++) {
            if(i % 2 == 0) {
                nums[i] = data[0][i] * getMartrixResult(getConfactor(data, 1, i+1));
            }else {
                nums[i] = -data[0][i] * getMartrixResult(getConfactor(data, 1, i+1));
            }
        }
        for(int i=0; i<data.length; i++) {
            result += nums[i];
        }

//      System.out.println(result);
        return result;
    }

    public double[][] getReverseMartrix(double[][] data) {
        double[][] newdata = new double[data.length][data[0].length];
        double A = getMartrixResult(data);
//      System.out.println(A);
        for(int i=0; i<data.length; i++) {
            for(int j=0; j<data[0].length; j++) {
                if((i+j)%2 == 0) {
                    newdata[i][j] = getMartrixResult(getConfactor(data, i+1, j+1)) / A;
                }else {
                    newdata[i][j] = -getMartrixResult(getConfactor(data, i+1, j+1)) / A;
                }

            }
        }
        newdata = trans(newdata);

        for(int i=0;i<newdata.length; i++) {
            for(int j=0; j<newdata[0].length; j++) {
                System.out.print(newdata[i][j]+ "   ");
            }
            System.out.println();
        }
        return newdata;
    }

    private double[][] trans(double[][] newdata) {
        // TODO Auto-generated method stub
        double[][] newdata2 = new double[newdata[0].length][newdata.length];
        for(int i=0; i<newdata.length; i++) 
            for(int j=0; j<newdata[0].length; j++) {
                newdata2[j][i] = newdata[i][j];
            }
        return newdata2;
    }

    public static void main(String[] args) {
        double[][] data = {
            {1,2,-1 },  
            {3,1,0 },  
            {-1,-1,-2 },
        };
       
    }

}



