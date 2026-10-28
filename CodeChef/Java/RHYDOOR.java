class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            int cnt=1;
            int res=0;
            for(int i=1;i<n;i++){
                if(s.charAt(i)==s.charAt(i-1)){
                    cnt++;
                }
                else cnt=1;
                if(cnt==3){
                    res++;
                    cnt=0;
                }
            }
            System.out.println(res);
        }

    }
}

n-1 local