
package javaapplication10_palindromes;
import java.util.*;

/* 回文
* for example:
* abbcckkccbba
* 1234554321
*/
public class JavaApplication10_Palindromes {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        
        int low = 0; // index of the first character in the string
        int high = str.length() - 1; // index of the last character in the string
        boolean isPalindromes = true;
        
        while(low < high){
            if(str.charAt(low) != str.charAt(high)){
                isPalindromes = false;
                break;
            }
            low++;
            high--;
        }
        if(isPalindromes)
            System.out.println(str + " is a palindromes");
        else
            System.out.println(str + " is not a palindromes");
    }
    
}
