import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            int M = scanner.nextInt();
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            int[] copHouses = new int[M];
            for (int i = 0; i < M; i++) {
                copHouses[i] = scanner.nextInt();
            }

            boolean[] safeHouses = new boolean[100]; 
            for (int i = 0; i < 100; i++) {
                safeHouses[i] = true; 
            }

            for (int copHouse : copHouses) {
                int startHouse = Math.max(1, copHouse - x * y);
                int endHouse = Math.min(100, copHouse + x * y);
                for (int j = startHouse; j <= endHouse; j++) {
                    safeHouses[j - 1] = false; 