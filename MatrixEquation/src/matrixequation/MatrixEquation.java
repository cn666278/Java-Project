
package matrixequation;

import java.util.Scanner;

public class MatrixEquation {

    /**
     *
     * @param array
     * @return
     */
    public static boolean isDiagonallyDominant(double[][] array) {
        
        int otherTotal; 

        // Loop through every row in the array 
        for(int row = 0; row < array.length; row++) {
            otherTotal = 0; 

            // Loop through every element in the row 
            for(int column = 0; column < array[row].length; column++) {
                
                // If this element is NOT on the diagonal 
                if(column != row) { 
                 // Add it to the running total 
                 otherTotal += Math.abs(array[row][column]); 
                }
            }
            // If this diagonal element is less than the sum of the other ones... 
            if(Math.abs(array[row][row]) < otherTotal) { 
                return false; 
            }
        } 
        return true; 
    } 

    /**
     *
     * @param array
     * @param b
     */
    public static void makeDiagonallyDominant(double[][] array,double[] b) {
        
        int otherTotal; 

        for(int row = 0; row < array.length; row++) {
            otherTotal = 0; 
 
            for(int column = 0; column < array[row].length; column++) {
                if(column != row)  
                    otherTotal += Math.abs(array[row][column]); 
            }

            if(Math.abs(array[row][row]) < otherTotal) {  
                // Swap the row line
                for(int i = 0; i < array[row].length; i++){
                    double temp1;
                    temp1 = array[0][i];
                    array[0][i] = array[row][i];
                    array[row][i] = temp1;
                    
                    double temp2;
                    temp2 = b[i];
                    b[i] = b[row];
                    b[row] = temp2;
                }               
            }
        }  
    } 
    
    /* Gauss-Seidel*/
    public static double[] gaussSeidel(double[][] array,double[] b,double[] X){       
        
	int num = 4;
	double sum, max_precision = 0;
        double[] x_old = new double[4];
        double[] x_new = X;
        double[][] a = array;
        double epsilon = 0.005;
        
	do
	{
            System.arraycopy(x_new, 0, x_old, 0, num);
            for (int j = 0; j < num; j++)
            {
                sum = 0;
                for (int k = 0; k < num; k++)
                {
                    if (j != k)
                    {
                        sum = sum - a[j][k] * x_old[k];
                    }
                }
                x_new[j] = (sum + b[j]) / a[j][j];
                max_precision = 0;   
                for (int i = 0; i < num; i++)
                {
                    sum = Math.abs(x_new[i] - x_old[i]);
                    if (sum > max_precision)
                    {
                        max_precision = sum;
                    }
                }
                x_old[j] = x_new[j];
            }
	} while (max_precision > epsilon);

	return x_new;
}
   
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);	

        int rowNum = 4;
        int columnNum = 4;
        double[][] array = new double[4][4];
        double[] X_new;
        
        for(int i = 0; i < rowNum; i++){
            // input for A[][]
            for(int j = 0; j < columnNum; j++){
                System.out.println("Enter the " + (j + 1) + " coefficient of the " + (i + 1) + " equation:");
                array[i][j] = input.nextInt();
            }
        }
        
        // input for b[]
        System.out.println("Enter vector b:");
        double[] b = new double[4];
        for(int i=0; i<4; i++){
                b[i] = input.nextInt();
        }

        // X[] = [x1,x2,x3,x4] = [0,0,0,0]
        System.out.println("Enter vector X:");
        double[] X  =new double[4];
        for(int i=0; i<4; i++){
                X[i] = 0;
        }
     
        if(isDiagonallyDominant(array)){
            System.out.println("It is diagonally dominant");
        }
        else{
            System.out.println("It is not diagonally dominant");
            makeDiagonallyDominant(array,b);
        }
  
        X_new = gaussSeidel(array,b,X);
        System.out.println("The solution X are：");
        for(int i=0; i<4; i++){
                System.out.println(X_new[i] + " ");
        }
        System.out.println();
        
    }
    
}
