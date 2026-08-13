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
            int n = scanner.nextInt(); 
            int x = scanner.nextInt(); 
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }

            int ans = 0;
            for (int i = n - 1; i >= 0; i--) {
                if (a[i] < x) {
                    ans = i + 1;
                    break;
                }
            }
            System.out.println(ans); 
        }
        scanner.close();
    }