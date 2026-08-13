import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int a[] = new int[10011];
        for (int cas = 0; cas < t; cas++) {
            int n = sc.nextInt();
            for (int i = 1; i <= n; i++) {
                a[i] = sc.nextInt();
            }
            int ans = 0;
            for (int i = 1; i <= n; i++) {
                int bi = sc.nextInt();
                if (bi <= a[i] - a[i-1]) {
                    ans++;
                }
            }
            System.out.println(ans);
        }

    }
}