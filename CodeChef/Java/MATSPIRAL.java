import java.util.Scanner;

public class Main {
    public static void spiralmatValues(int[][] mat, int n, int m) {
        int top = 0, bottom = n - 1, left = 0, right = m - 1;
        int direction = 1;

        while (top <= bottom && left <= right) {
            if (direction == 1) {
                for (int i = left; i <= right; i++) 
                    System.out.print(mat[top][i] + " ");
                direction = 2;
                top++;
            } else if (direction == 2) {
                for (int i = top; i <= bottom; i++) 
                    System.out.print(mat[i][right] + " ");
                direction = 3;
                right--;
            } else if (direction == 3) {
                for (int i = right; i >= left; i--) 
                    System.out.print(mat[bottom][i] + " ");
                direction = 4;
                bottom--;
            } else if (direction == 4) {
                for (int i = bottom; i >= top; i--) 
                    System.out.print(mat[i][left] + " ");
                direction = 1;
                left++;
            }
        }
    }