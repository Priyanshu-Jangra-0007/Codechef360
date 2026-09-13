import java.util.Scanner;

public class Main {

    public static int totalSubarrays(int[] arr, int N, int K) {
        int ans = 0, i = 0;

        while (i < N) {
            // If arr[i] > K, it cannot be part of any subarray
            if (arr[i] > K) {
                i++;
                continue;
            }

            int count = 0;
            // Count elements where arr[i] is not greater than K
            while (i < N && arr[i] <= K) {
                i++;
                count++;
            }

            // Summation of all possible subarrays
            ans += (count * (count + 1)) / 2;
        }

        return ans;
    }

    public static int countSubarrays(int[] arr, int N, int K) {
        // Count subarrays with max <= K - 1
        int count1 = totalSubarrays(arr, N, K - 1);