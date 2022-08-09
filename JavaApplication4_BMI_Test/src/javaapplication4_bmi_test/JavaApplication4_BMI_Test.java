/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4_bmi_test;

/**
 *
 * @author cn
 */
import java.util.Scanner;

public class JavaApplication4_BMI_Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter weight in kilogram: ");
        double weight = input.nextDouble();
        
        System.out.println("Enter the height in meter: ");
        double height = input.nextDouble();
        
        double bmi = weight / (height * height);
        System.out.println("Your BMI is " + bmi);
        if (bmi < 18.5)
            System.out.println("Underweight");
        else if (bmi < 25)
            System.out.println("Normal");
        else if (bmi < 30)
            System.out.println("Overweight");
        else
            System.out.println("Obese");
        
    }
    
}
