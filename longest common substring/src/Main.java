
import java.util.*;

public class Main {
    /**
     * longest common substring
     * dp[i][j]表示字符串str1中第i个字符和str2种第j个字符为最后一个元素所构成的最长公共子串
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str1 = input.nextLine();
        String str2 = input.nextLine();
        String output = LCS(str1,str2);
        System.out.println(output);
    }

    public static String LCS(String str1, String str2) {
        int maxLenth = 0;        // 记录最长公共子串的长度
        int maxLastIndex = 0;    // 记录最长公共子串最后一个元素在字符串str1中的位置
        int[][] dp = new int[str1.length() + 1][str2.length() + 1];

        for (int i = 0; i < str1.length(); i++) {
            for (int j = 0; j < str2.length(); j++) {
                // 递推公式，两个字符相等的情况
                if (str1.charAt(i) == str2.charAt(j)) {
                    if(i == 0 || j == 0){ // 控制 i,j = 0的情况，防止越界
                        dp[i][j] = 1;
                    }
                    else{    // 计算相同字符之前的公共子串
                        dp[i][j] = dp[i - 1][j - 1] + 1;
                        // 如果遇到了更长的子串，要更新，记录最长子串的长度，
                        // 以及最长子串最后一个元素的位置
                        if (dp[i][j] > maxLenth) {
                            maxLenth = dp[i][j];
                            maxLastIndex = i;
                        }
                    }
                }
                // 递推公式，两个字符不相等的情况,那么他们就不能构成公共子串
                else {
                    dp[i][j] = 0;
                }
            }
        }
        // 最字符串进行截取，substring(a,b)中a和b分别表示截取的开始和结束位置(注意截取index从1开始）
        return str1.substring(maxLastIndex - maxLenth + 1, maxLastIndex + 1);
    }
}