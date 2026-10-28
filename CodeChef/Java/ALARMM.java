import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            String s=sc.next();
            int a=0;
            for(int i=0;i<n;i++){
                if(s.charAt(i)=='1'){
                    a++;
                    int b=Math.min(n-1,i+k);
                    i=b;
                }
            }
            System.out.println(a);
        }
    }
}

UnknownError keyword
LinkageError keyword
package keyword
Package keyword
break keyword
StackOverflowError keyword
StackTraceElement keyword
UnsatisfiedLinkError keyword