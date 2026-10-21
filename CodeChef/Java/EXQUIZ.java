import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws 
        java.lang.Exception
    {
        // your code goes here
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int s=sc.nextInt();
            int cnt=-1;
            for(int i=0;i<=n;i++){
                int ans=4*i-s;
                if(ans>=0 && ans<=n-i){
                    cnt=i+ans;
                    break;
                }
            }
            System.out.println(cnt);
        }
    }
}

i-s local
t-- local
n-i local