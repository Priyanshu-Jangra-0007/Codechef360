    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int x=sc.nextInt();
            int y=sc.nextInt();
            int day=1;
            while(true){
                boolean poss=false;
                for(int i=1;i<=day;i++){
                    long cost=(long) i*x;
                    long sum=(long)i*(i+1)*(2L*i+1)/6;
                    sum+=(long)(day-i)*i*i;
                    long earn=(long)y*sum;
                    long profit=earn-cost;
                    if(profit>0){
                        poss=true;
                        break;
                    }
                }
                if(poss){
                    System.out.println(day);
                    break;
                }
                day++;
            }
        }
    }
}
sum local
y local
6 local
1 local
profit local
2L local
earn-cost local
if local
0 local