import java.util.Scanner;

public class Main {
    public static int firstOne(int[] row, int low, int high) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if ((mid == 0 || row[mid - 1] == 0) && row[mid] == 1) {
                return mid;
            } else if (row[mid] == 0) {
                return firstOne(row, mid + 1, high);
            } else {
                return firstOne(row, low, mid - 1);
            }
        }
        return -1; 
    }

    public static int maxOneRow(int[][] mat) {
        int maxones = 0;
        int rowIdx = 0;
        for (int i = 0; i < mat.length; i++) {
            int ones = mat[i].length - firstOne(mat[i], 0, mat[i].length - 1);
            if (ones > maxones) {
                maxones = ones;
                rowIdx = i;
            }
        }
        return rowIdx + 1;
    }

    public static void main(String[] args) {