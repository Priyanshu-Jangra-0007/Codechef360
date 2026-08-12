import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int[] result = spiralOrderAnticlockwise(matrix);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static int[] spiralOrderAnticlockwise(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int left = 0, right = cols - 1, top = 0, bottom = rows - 1;
        int[] result = new int[rows * cols];
        int index = 0;

        while (left <= right && top <= bottom) {
            // Traverse from top to bottom along the left column
            for (int i = top; i <= bottom; ++i) {