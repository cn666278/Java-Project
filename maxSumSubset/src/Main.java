import java.lang.*;

public class Main {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, -3, 8, 9};
        System.out.println(maxSubArray(arr, 0, arr.length - 1));
    }

    public static int maxSubArray(int[] arr, int low, int high) {
        int mid;
        int S1, S2, S3, Smax;
        if (low == high) // there is only one element
            return arr[low];
        else {
            mid = (low + high) / 2;
            S1 = maxSubArray(arr, low, mid);
            S2 = maxSubArray(arr, mid + 1, high);
            S3 = crossingSubArray(arr, low, mid, high);
            Smax = Math.max(Math.max(S1, S2), S3);
            return Smax;
        }
    }

    /*
    *    计算S3 分为两部分
    *    第一部分为包含mid位置的元素，依次向前遍历找最大的子数组为Sleft
    *    第二部分为包含mid+1位置的元素，依次向后遍历，找到最大子数组
    *    S3就是包含mid和mid+1位置的最大子数组，即为Sleft和Sright的和。
    */
    public static int crossingSubArray(int[] arr, int low, int mid, int high) {
        int Sleft = -999;
        int Sright = -999;
        int S3;

        // Compute left part
        int sum = 0;
        for (int i = mid; i > low; i--) {
            sum += arr[i];
            Sleft = Math.max(Sleft, sum);
        }

        // Compute right part
        sum = 0;
        for (int j = mid + 1; j < high + 1; j++) {
            sum += arr[j];
            Sright = Math.max(Sright, sum);
        }

        S3 = Sleft + Sright;
        return S3;
    }
}