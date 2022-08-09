import java.util.Scanner;

/* 回文
 * for example:
 * abbcckkccbba
 * 1234554321
 * StringBuilder 主要用于String的修改/添加/删除/调整等等操作
 */
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();

        if(isPalindromes(str))
            System.out.println(str + " is a palindromes");
        else
            System.out.println(str + " is not a palindromes");

    }

    public static boolean isPalindromes(String str) {
        // Create a new string by eliminating non-alphanumeric chars
        String str1 = filter(str);

        // Create a new string that is reversal of str1
        String str2 = reverse(str1);
        return str2.equals(str1);
    }

    public static String reverse(String str1) {
        StringBuilder stringBuilder = new StringBuilder(str1);
        stringBuilder.reverse(); // reverse the string
        return stringBuilder.toString();

    }

    public static String filter(String str) {
        StringBuilder stringBuilder = new StringBuilder();

        // Examine each char in the string to skip alphanumeric char
        for (int i  = 0; i < str.length(); i++){
            if (Character.isLetterOrDigit(str.charAt(i)))
                stringBuilder.append(str.charAt(i));
        }
        // Return a new filtered string
        return stringBuilder.toString(); // 注意String 和 StringBuilder 为不同类型
    }
}



