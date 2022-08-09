/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13_analyzingnumber;

import java.util.Scanner;

public class JavaApplication13_AnalyzingNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the size of the list: ");
        int size = input.nextInt();
        double numbers[] = new double[size];
        double sum = 0;
  
        System.out.println("Enter the list of numbers: ");
        for(int i = 0; i< size; i++){
            numbers[i] = input.nextDouble();
            sum += numbers[i];
        }
        
        double average = sum / size;
        
        int count = 0; // The number of element above average value
        for(int i = 0; i < size; i++){
            if(numbers[i] > average)
                count++;
        }
        System.out.println("The average value is: " + average);
        System.out.println("Number of elements above average value: " + count);
    }
    
}
    

