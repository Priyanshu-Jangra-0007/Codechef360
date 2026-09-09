class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
            int maxval=1;
            int cnt=1;
            for(int i=1;i<n;i++){
                if(arr[i]==arr[i-1]){
                    cnt++;
                }
                else cnt=1;
                maxval=Math.max(cnt,maxval);
            }
            int opr=(maxval+1)/2;
            System.out.println(opr);
        }
    }
}

maxval local