/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

import java.util.Scanner;

public class Ex1 {

    public static String getMonthName(int month){
        String monthName = "";
        if(month < 1 || month > 12){
            System.out.println("Invalid input.");
        }
        else{
            switch(month){
                case 1: monthName = "January";  break;
                case 2: monthName = "February";  break;
                case 3: monthName = "March";  break;
                case 4: monthName = "April";  break;
                case 5: monthName = "May";  break;
                case 6: monthName = "June";  break;
                case 7: monthName = "July";  break;
                case 8: monthName = "August";  break;
                case 9: monthName = "September";  break;
                case 10: monthName = "October";  break;
                case 11: monthName = "November";  break;
                case 12: monthName = "December";  // no break
            }
        }
        return monthName;
    }

    public static int getTotalNumberOfDaysInMonth(int year, int month){
        if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
            return 31;
        if(month == 4 || month == 6 || month == 9 || month == 11)
            return 30;
        if(month == 2)
            return isLeapYear(year) ? 29 : 28;
        return 0; // If month is incorrect
    }
    
    public static boolean isLeapYear(int year){
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter month as a number between 1 and 12: ");
        int month = input.nextInt();
        System.out.println("Enter full year(e.g., 2012): ");
        int year = input.nextInt();
        
        System.out.println( Ex1.getMonthName(month)+ " " + year + " has " + Ex1.getTotalNumberOfDaysInMonth(year, month) + " days.");
    }
    
}
    
