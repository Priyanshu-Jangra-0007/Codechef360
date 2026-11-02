
class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        HashMap<Integer,PriorityQueue<Integer>> map=new HashMap<>();
        int arr[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
                int diff=i-j;
                map.putIfAbsent(diff,new PriorityQueue<>());
                map.get(diff).add(arr[i][j]);
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=map.get(i-j).poll();
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}

sysout snippet