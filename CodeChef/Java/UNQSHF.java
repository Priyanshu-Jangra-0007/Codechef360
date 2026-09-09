    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String s1=sc.next();
            String s2=sc.next();
            int cntA=0;
            int cntB=0;
            for(int i=0;i<n;i++){
                if(s1.charAt(i)=='a'){
                    cntA++;
                }
                else{
                    cntB++;
                }
            }
            for(int i=0;i<n;i++){
                if(s2.charAt(i)=='a') cntA++;
                else cntB++;
            }
            if(cntA==cntB) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}

nextLine local
println local
null keyword
NullPointerException keyword
unless snippet
NoClassDefFoundError keyword
NoSuchFieldError keyword
NoSuchFieldException keyword
final keyword