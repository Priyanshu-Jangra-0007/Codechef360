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
            if(n<4){
                System.out.println("YES");
            }
            else if(n%4!=0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}

NoClassDefFoundError keyword
NoSuchFieldError keyword
NoSuchFieldException keyword
NoSuchMethodError keyword
NoSuchMethodException keyword
UnknownError keyword
NullPointerException keyword
TypeNotPresentException keyword
ClassNotFoundException keyword