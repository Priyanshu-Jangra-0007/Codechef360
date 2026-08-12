import java.util.Scanner;

public class Main {
    
    public static boolean searchInMatrix(int[][] matrix, int target) {
        int numRows = matrix.length;
        int numCols = matrix[0].length;
        
        int start = 0, end = numRows * numCols - 1;
        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int midElement = matrix[mid / numCols][mid % numCols];
            
            if (target == midElement)
                return true;
            else if (target < midElement)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int x = scanner.nextInt();
        