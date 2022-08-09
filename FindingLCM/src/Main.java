
import java.util.Scanner;

/* 最小公倍数 lcm
 * lcm(a,b) = |a*b| / gcd(a,b)
 */

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first integer:");
        int a = input.nextInt();
        System.out.println("Enter second integer:");
        int b = input.nextInt();

        System.out.println("\nThe least common multiple(lcm) is " + a * b / gcd(a, b));

    }

    // 辗转相除法
    public static int gcd(int a, int b){
        if(b == 0)
            return a;
        return gcd(b, a % b);
    }

}
