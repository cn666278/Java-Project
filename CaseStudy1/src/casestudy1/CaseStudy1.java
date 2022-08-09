/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casestudy1;
import java.util.Scanner;
//  ！！！！！ 【Ctrl+/ 解除or添加注释状态】 ！！！！！
public class CaseStudy1 {
    public static void main(String[] args) {
        //---------------------------------------------------------------------
        //Finding greatest common divisor(GCD)
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first integer: ");
        int n1 = input.nextInt();
        System.out.println("Enter the second integer: ");
        int n2 = input.nextInt();
        
        int gcd = 1;
        for(int k = 2; k <= n1 && k <= n2; k++){
            if(n1 % k == 0 && n2 % k == 0){
                gcd = k;
            }
        }    
        System.out.println("The greatest common divisor for " + n1 + " and " + n2 + " is " + gcd);
        
        //---------------------------------------------------------------------
        //Convert Decimal number to Hex number
//        Scanner input = new Scanner(System.in);
//        
//        System.out.println("Enter a decimal number: ");
//        int decimal = input.nextInt();
//        String hex = "";
//        while(decimal != 0){
//            int hexValue = decimal % 16;
//            char hexDigit = (0 <= hexValue && hexValue <= 9) ? (char)(hexValue + '0') : (char)(hexValue - 10 + 'A');
//            hex = hexDigit + hex;
//            decimal = decimal / 16;
//        }
//        System.out.println("The hex number is " + hex);
        //----------------------------------------------------------------------        
        //Checking Palindromes(回文：mom dad noon）
//        Scanner input = new Scanner(System.in);
//        
//        System.out.println("Enter a string: ");
//        String s = input.nextLine();
//        int low = 0;
//        int high = s.length() - 1;
//        
//        boolean isPalindrome = true;
//        while(low < high){
//            if(s.charAt(low) != s.charAt(high)){
//                isPalindrome = false;
//                break;
//            }
//            low++;
//            high--;
//        }
//        if(isPalindrome)
//            System.out.println(s + " is a palindrome.");
//        else
//            System.out.println(s + " is not a palindrome");
//    }
    //------------------------------------------------------------------------
    //Display Prime Numbers
//    final int NUMBER_OF_PRIMES = 50;
//    final int NUMBER_OF_PRIMES_PER_LINE = 10;
//    int count = 0;
//    int number = 2;
//    
//    System.out.println("The first 50 prime numbers are \n");
//    while(count < NUMBER_OF_PRIMES){
//        boolean isPrime = true;
//        for(int divisor = 2; divisor <= number / 2; divisor++){
//            if(number % divisor == 0){
//                isPrime = false;
//                break;
//            }
//        }
//        if(isPrime){
//            count++;
//            if(count % NUMBER_OF_PRIMES_PER_LINE == 0) //Display the number and advance to the new line
//                System.out.println(number);
//            else
//                System.out.print(number + "\t"); //not next line
//        }
//        number++; 
//    }
    //-------------------------------------------------------------------------
  }
}
    
