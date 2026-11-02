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
            int cnt=0;
            for(int i=0;i<n;i++){
                int l=0;
                int g=0;
                for(int j=0;j<n;j++){
                    if(arr[j]<=arr[i]){
                        l++;
                    }
                    else g++;
                }
                if(l>g) cnt++;
            }
            System.out.println(cnt);
        }
    }
}

cnt local
continue keyword
const keyword
ClassNotFoundException keyword
CloneNotSupportedException keyword
EnumConstantNotPresentException keyword
ExceptionInInitializerError keyword
StackTraceElement keyword