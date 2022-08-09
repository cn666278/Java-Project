/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6_guessnumber;

import java.util.Scanner;

public class JavaApplication6_GuessNumber {
    public static void main(String[] args) {
        // random range[0.0-1.0) 左闭右开
        int number = (int)(Math.random() * 101); //range from 0-100  (101 > 0.9999 * 101 > 100 )
        
        Scanner input = new Scanner(System.in);
        System.out.println("Guess a magic number between 0 and 100:");
        
        int guess = -1;
        int i = 1;
        while(guess != number){
            System.out.println("Enter your guess(Total 6 chances): ");
            guess = input.nextInt();
            
            if(guess == number){
                System.out.println("[Yes,the number is " + number + " (" + i + "th try)]");
                break;
            }
            else if(guess > number)
                System.out.println("[Your guess is too high (" + i + "th try)]");
            else
                System.out.println("[Your guess is too low (" + i + "th try)]");
            if(i == 6){
                System.out.println("[Sorry,you fali("+ i +"th try)]");
                break;
            }
            System.out.println("--------------------------------------------------------");
            i++;
        }
                      
    }
            
}
    
