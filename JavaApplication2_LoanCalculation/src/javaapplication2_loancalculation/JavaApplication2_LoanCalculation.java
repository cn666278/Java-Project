/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2_loancalculation;

import java.util.Scanner;

public class JavaApplication2_LoanCalculation {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Enter annual interest rate
        System.out.println("Enter annual interest rate(e.g., 7.25): ");
        double annualInterestRate = input.nextDouble();
        
        // Enter number of years
        System.out.println("Enter number of years as an integer(e.g., 5): ");
        int numberOfYears = input.nextInt();
        
        // Enter loan amount
        System.out.println("Enter loan amount(e.g., 120000.95): ");
        double loanAmount = input.nextDouble();

        // Create a Loan object
        Loan loan = new Loan(annualInterestRate, numberOfYears, loanAmount);

        // Display loan date, monthly payment, and total payment
        System.out.printf("The loan was created on %s\n" + "The monthly payment is $%.2f\nThe total payment is $%.2f\n", loan.getLoanDate().toString(),loan.getMonthlyPayment(),loan.getTotalPayment());
    }
    
}
