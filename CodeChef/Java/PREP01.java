using System;

public class Test
{
    public static void Main()
    {
        // your code goes here
        int t=int.Parse(Console.ReadLine());
        while(t-->0){
            int n=int.Parse(Console.ReadLine());
            long val=1;
            for(int i=0;i<n;i++){
                Console.Write(val);
                if(i<n-1) Console.Write(" ");
                val=val*(n-1-i)/(i+1);
            }
            Console.WriteLine();
        }
    }
}

val local
virtual keyword
volatile keyword