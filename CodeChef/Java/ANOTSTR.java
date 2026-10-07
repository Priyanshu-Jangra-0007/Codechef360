import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef{
    public static void main (String[] args) throws java.lang.Exception{
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String x=sc.next();
            String y=sc.next();
            int a=0;
            int b=0;
            for(int i=0;i<n;i++){
                if(x.charAt(i)=='1'){
                    a++;
                }
                if(y.charAt(i)=='1'){
                    b++;
                }
            }
            if(a%2==b%2){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
YES local
your local
System local
byte keyword
Byte keyword
sy snippet
sysout snippet
System keyword
TypeNotPresentException keyword