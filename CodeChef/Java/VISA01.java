
class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String s=sc.next();
            String r=sc.next();
            int n=s.length();
            int m=r.length();
            int [][] dp=new int [n+1][m+1];
            for(int i=1;i<=n;i++){
                for(int j=1;j<=m;j++){
                    if(s.charAt(i-1)==r.charAt(j-1)){
                        dp[i][j]=1+dp[i-1][j-1];
                    }
                    else{
                        dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                    }
                }
            }
            System.out.println(dp[n][m]);
        }
    }
}

max local
Math local
main local
m snippet
main snippet
Math keyword
mm snippet
mo snippet
System local