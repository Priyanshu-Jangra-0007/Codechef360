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
            int m=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
            int p=0;
            int cnt=0;
            for(int x:arr){
                p+=x;
                if(p*(p-1)/2<=m){
                    cnt++;
                }
                else break;
            }
            System.out.println(cnt);
        }
    }
cnt local
code local
Codechef local
class local
ca snippet
case snippet
case keyword
catch keyword
char keyword