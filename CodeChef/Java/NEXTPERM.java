import java.io.*;
import java.util.*;

public class Main {

    public static boolean nextPermutation(int[] p) {
        int n = p.length;
        int k = n - 2;

        // Find the largest index k such that p[k] < p[k+1]
        while (k >= 0 && p[k] >= p[k + 1]) {
            k--;
        }

        // If no pivot, the current permutation is the largest
        if (k < 0) {
            Arrays.sort(p);
            return false;
        }

        int l = n - 1;

        // Find the largest index l > k such that p[l] > p[k]
        while (p[l] <= p[k]) {
            l--;
        }

        // Swap p[k] and p[l]
        int temp = p[k];
        p[k] = p[l];
        p[l] = temp;