{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            int x=0;
            int y=0;
            for(int i=0;i<n;i++){
                char c=s.charAt(i);
                if(c=='U') y++;
                else if(c=='D') y--;
                else if(c=='L') x--;
                else x++;
            }
            if((x==2 && y==0) || (x==-2 && y==0) || (x==0 && y==2) || (x==0 && y==-2)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }

    }
}

-2 local
x-- local
y-- local
t-- local