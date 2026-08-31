import java.util.*;

public class Main {

    public static long maxSubArraySum(ArrayList<Long> a, int n) {
        long max_tot = Long.MIN_VALUE;
        long m = 0;

        for (int i = 0; i < n; i++) {
            m += a.get(i);

            if (max_tot < m)
                max_tot = m;

            if (m < 0)
                m = 0;
        }
        return max_tot;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();

            ArrayList<Long> a = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                a.add(sc.nextLong());
            }