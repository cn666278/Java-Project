import java.util.*;

public class Main {
    public static void main(String[] args) {
//        String lottery = "" + (int)(Math.random() * 100001); // 5-digit random lottery number
        String lottery = "16249";
        char[] guessDigit = new char[5];
        char[] lotterDigit = new char[5];
        int winCount = 0;
        boolean signal = true; //用于控制循环结束

        Scanner input = new Scanner(System.in);
        for (int i = 0; i < lottery.length(); i++) {
            System.out.println("Enter your lottery pick (digit " + (i + 1) + "):");
            guessDigit[i] = input.nextLine().charAt(0);

            // Get digits from lottery
            lotterDigit[i] = lottery.charAt(i);
        }

        System.out.println("------------------------------------------");
        System.out.println("The lotery number is " + lottery);

        // Check the guess
//        String guess = guessDigit.toString();
        String guess = new String(guessDigit); // 使用String的一个构造函数来转换char[]
        for (int i = 0; i < lottery.length(); i++) {
            for (int j = 0; j < lottery.length(); j++) {
                if (guess.equals(lottery) && signal) {
                    System.out.println("Exact match: you win $10,000,000 !!!");
                    signal = false; //如果全中则不再判断
                } else if (guessDigit[i] == lotterDigit[j]) {
                    winCount++;
                    break;
                }
            }
        }

        if (signal) {
            if (winCount > 0) {
                // %,d 用于输出格式为英式计数法
                System.out.printf("Match " + winCount + " digits: you win $%,d\n",winCount * 1000);
            } else
                System.out.println("Sorry: no match");
        }

        System.out.println("------------------------------------------");

    }
}