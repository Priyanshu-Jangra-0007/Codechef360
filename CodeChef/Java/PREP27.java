
import java.util.*;
import java.io.*;

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        
        while (T-- > 0) {
            String[] input = br.readLine().split(" ");
            int N = Integer.parseInt(input[0]);
            long X = Long.parseLong(input[1]);
            
            long[] A = new long[N];
            input = br.readLine().split(" ");
            for (int i = 0; i < N; i++) {
                A[i] = Long.parseLong(input[i]);
            }
            
            Arrays.sort(A);
            
            Set<List<Long>> result = new TreeSet<>((a, b) -> {
                for (int i = 0; i < 4; i++) {
                    if (a.get(i).compareTo(b.get(i)) != 0) {
                        return a.get(i).compareTo(b.get(i));
                    }
                }
                return 0;
            });
            