
/*
  Write a program that reads an integer and displays all its smallest factors
  in increasing order. For example, if the input integer is 120, the output
  should be as follows: 2, 2, 2, 3, 5.
*/
// 我们判断数 num 是不是质数时，没必要从 2 一直尝试到 num 一样，
// 此题中的大循环也大可不必写一个到 num 的循环，写到  即可，
// 如果此时数字还没有除数，则可判定其本身是一个质数，直接打印其本身即可：
package ex2;

import java.util.Scanner;

public class Ex2 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        long num = input.nextLong();
        long k = (long) Math.sqrt(num);  // 2~root(num)

        for (long i = 2; i <= k; ++i) {
            while (num % i == 0) {
                System.out.print(i + " ");
                num /= i;
            }
        }
        System.out.println(num == 1 ? "": num + " "); // 此时数字还没有除数，则可判定其本身是一个质数，直接打印其本身即可
    }
    
}
