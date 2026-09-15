/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        BufferedReader br=new BufferedReader( new InputStreamReader(System.in)  ); 
        
        PrintWriter out = new PrintWriter(System.out);
        
        int t = Integer.valueOf(br.readLine());
        
        while (t-- > 0) {
            int n = Integer.valueOf(br.readLine());;
            
            String a[][] = new String[n][n];
            
            for (int i = 0 ; i < n ; i++ ) {
                
                String temp = br.readLine();
                
                String sArr [] = temp.split( " " );
                
                for (int j = 0 ; j < n ; j++ ) {
                    a[n - i - 1][n - j - 1] = sArr[j];