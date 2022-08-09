/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication39;
    import java.util.Scanner;
/**
 *
 * @author cn
 */
public class JavaApplication39 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double weight, height, BMI;
        //System.out.println("enter weight in kilograms");
        weight = scan.nextDouble();
        //System.out.println("enter height in metres");
        height = scan.nextDouble();
        BMI = weight / (height*height);
        System.out.print("Enter weight in kilograms: Enter height in metres: Your BMI is "+ (String.format( "%.1f",BMI))+ ", which means you are in the ");
        if (BMI <= 18.5){
            System.out.print("Underweight range.");
       }
        else if (18.5 < BMI && BMI < 24.9){
            System.out.print("Normal range.");
        }
        else if (25.0 < BMI && BMI < 29.9){
            System.out.print("Overweight range.");
        }
        else
            System.out.println("Obese range.");
    }

}
