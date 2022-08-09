/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5_chinese_zodiac;

import java.util.Scanner;

public class JavaApplication5_Chinese_Zodiac {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the year");
        int year = input.nextInt();
        
        switch(year % 12){
            case 0: System.out.println("Monkey");   break;
            case 1: System.out.println("Rooster");   break;
            case 2: System.out.println("Dog");   break;
            case 3: System.out.println("Pig");   break;
            case 4: System.out.println("Rat");   break;
            case 5: System.out.println("Ox");   break;
            case 6: System.out.println("Tiger");   break;
            case 7: System.out.println("Rabbit");   break;
            case 8: System.out.println("Dragon");   break;
            case 9: System.out.println("Snake");   break;
            case 10: System.out.println("Horse");   break;
            case 11: System.out.println("Sheep");   break;
            
        }
    }
    
}
