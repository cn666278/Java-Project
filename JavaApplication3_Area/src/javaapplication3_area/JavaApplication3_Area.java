/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3_area;

/**
 *
 * @author cn
 */
import java.util.Scanner;

public class JavaApplication3_Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the radius: ");
        double radius = input.nextDouble();
        if(radius < 0){
            System.out.println("Invalid input");
        }   
        else{
            double area = radius * radius * 3.1415926;
            System.out.println("The area for the circle of radius " + radius + " is " + area);
        }
    }
}
