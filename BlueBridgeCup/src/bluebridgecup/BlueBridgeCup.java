package bluebridgecup;

import java.util.*;
import static java.lang.Math.pow;


public class BlueBridgeCup {
       
    public static long Sum(long num){

        long sum = 1;
        
        for(int i=2; i <= num; i++){
            if(num % i == 0){
                sum += pow(i,2);
            }
        }
        
        return sum;
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        long total = 0;
        long[] sums = new long[n];
                      
        for(int i=0; i < n; i++){
            sums[i] = Sum(i+1); 
            total += sums[i];
        }
               
        System.out.println(total);
    }
    
}
