/*  Longest common subsequence
step 1：优先检查特殊情况。
step 2：获取最长公共子序列的长度可以使用动态规划，我们以dp[i][j]dp[i][j]dp[i][j]表示在s1中以iii结尾，s2中以jjj结尾的字符串的最长公共子序列长度。
step 3：遍历两个字符串的所有位置，开始状态转移：若是iii位与jjj位的字符相等，则该问题可以变成1+dp[i−1][j−1]1+dp[i-1][j-1]1+dp[i−1][j−1]，即到此处为止最长公共子序列长度由前面的结果加1。
step 4：若是不相等，说明到此处为止的子串，最后一位不可能同时属于最长公共子序列，毕竟它们都不相同，
因此我们考虑换成两个子问题，dp[i][j−1]dp[i][j-1]dp[i][j−1]或者dp[i−1][j]dp[i-1][j]dp[i−1][j]，我们取较大的一个就可以了，由此感觉可以用递归解决。
step 5：但是递归的复杂度过高，重复计算了很多低层次的部分，因此可以用动态规划，从前往后加，由此形成一个表，表从位置1开始往后相加，正好符合动态规划的转移特征。
step 6：因为最后要返回该序列，而不是长度，所以在构造表的同时要以另一个二维矩阵记录上面状态转移时选择的方向，我们用1表示来自左上方，2表示来自左边，3表示来自上边。
step 7：获取这个序列的时候，根据从最后一位开始，根据记录的方向，不断递归往前组装字符，只有来自左上的时候才添加本级字符，因为这种情况是动态规划中两个字符相等的情况，字符相等才可用。
*/

import java.util.*;

public class Main {
    static String x = "";
    static String y = "";

    public static void main(String[] args) {
        String str = LCS("BPSTO", "PKSTON");
        System.out.println(str);
    }

    //获取最长公共子序列
    public static String ans(int i, int j, int[][] b){
        String res = "";
        //递归终止条件
        if (i == 0 || j == 0)
            return res;
        //根据方向，往前递归，然后添加本级字符
        //用1表示来自左上方，2表示来自左边，3表示来自上边。
        if (b[i][j] == 1) {
            res += ans(i - 1, j - 1, b);
            res += x.charAt(i - 1);
        } else if (b[i][j] == 2)
            res += ans(i - 1, j, b);
        else if (b[i][j] == 3)
            res += ans(i, j - 1, b);
        return res;
    }

    public static String LCS (String s1, String s2) {
        //特殊情况
        if(s1.length() == 0 || s2.length() == 0)
            return "-1";
        int len1 = s1.length();
        int len2 = s2.length();
        x = s1;
        y = s2;
        //dp[i][j]表示第一个字符串到第i位，第二个字符串到第j位为止的最长公共子序列长度
        int[][] dp = new int[len1 + 1][len2 + 1]; // 初始值为0
        //动态规划数组相加的方向
        int[][] b = new int[len1 + 1][len2 + 1]; // 初始值为0

        //遍历两个字符串每个位置求的最长长度 (i:row, j:column)
        //index 从1开始避免数组下界越界[i-1][j-1]
        for(int i = 1; i <= len1; i++){
            for(int j = 1; j <= len2; j++){
                //遇到两个字符相等(charAt() index started from 0)
                if(s1.charAt(i - 1) == s2.charAt(j - 1)){
                    dp[i][j] = dp[i - 1][j - 1] + 1;    //考虑由二者都向前一位
                    b[i][j] = 1;     //来自于左上方
                }
                //遇到的两个字符不同
                else{
                    //左边的选择更大，即第一个字符串后退一位
                    if(dp[i - 1][j] > dp[i][j - 1]){
                        dp[i][j] = dp[i - 1][j];
                        b[i][j] = 2;    //来自于上方
                    }
                    //(上边）右边的选择更大，即第二个字符串后退一位（包括dp[i - 1][j] == dp[i][j - 1]的情况）
                    else{
                        dp[i][j] = dp[i][j - 1];
                        b[i][j] = 3;    //来自于左方
                    }
                }
            }
        }
        //获取答案字符串
        String res = ans(len1, len2, b);
        // check for b[][]
        for (int m = 0; m <= x.length(); m++){
            for (int n = 0; n <= y.length();n++){
                System.out.print(b[m][n]);
            }
            System.out.println();
        }
        System.out.println("--------------------------");
        // check for dp[][]
        for (int m = 0; m <= x.length(); m++){
            for (int n = 0; n <= y.length();n++){
                System.out.print(dp[m][n]);
            }
            System.out.println();
        }
        //检查答案是否位空
        if(res.isEmpty())
            return "-1";
        else
            return res;
    }
}
