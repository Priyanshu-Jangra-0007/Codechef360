class Solution {
    public int[] findRepeatingAndMissing(int[] arr) {
        int n = arr.length;
        int[] freq = new int[n + 1];

        // Count frequency of each number
        for (int num : arr) {
            freq[num]++;
        }

        int repeating = -1;
        int missing = -1;

        for (int i = 1; i <= n; i++) {
            if (freq[i] == 2) {
                repeating = i;
            } else if (freq[i] == 0) {
                missing = i;
            }
        }

        return new int[] {repeating, missing};
    }
}