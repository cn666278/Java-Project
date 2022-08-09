/*
  A positive integer is called a perfect number if it is equal to the sum of
  all its positive divisors, excluding itself. For example, 6 is the first
  perfect number because 6 = 3 + 2 + 1; The next is 28 = 14 + 7 + 4 + 2 + 1.
  There are four perfect numbers less than 10,000. Write a program to find all
  these four numbers.
*/
package ex3;


public class Ex3 {

    public static void main(String[] args) {
        String list = "";
        for(int i = 6; i < 10000; i++){
            int sum = 0;
            // 因为一个数的正因子都是成对出现的（12:（2,6）（3,4））
            // so we used j <= i / 2 (最低为 2 -> 对于最大因子为 i/2）
            for( int j = 1; j <= i / 2; j++){
                // Find the factor of i
                if(i % j == 0){
                    list += j + " ";  // Using string to store the element 
                    sum += j;
                }
            }
            if(sum == i){
                System.out.println("Perfect number: " + i);
                System.out.println("The factor are: " + list + "\n");
            }
            list = "";  // Before next loop, set the string empty.
        }
    }
    
}
