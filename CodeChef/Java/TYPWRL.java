import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            String s=sc.next();
            String l=sc.next();
            int cnt=1;
            int max=1;
            for(int i=1;i<n;i++){
                boolean a= l.indexOf(s.charAt(i))>=0;
                boolean b= l.indexOf(s.charAt(i-1))>=0;
                if(a==b) cnt++;
                else cnt=1;
                max=Math.max(max,cnt);
            }
            System.out.println(max);
        }

    }
}

System local
sc local
String local
Scanner local
static local
Sc snippet
SecurityException keyword
SecurityManager keyword
set snippet