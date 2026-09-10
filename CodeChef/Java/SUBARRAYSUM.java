public static int largestZeroSumSubarray(int[] arr, int n) {
        Map<Integer, Integer> map = new HashMap<>();
        int maxLen = 0;
        int prefixSum = 0;

        for (int i = 0; i < n; i++) {
            prefixSum += arr[i];

            if (prefixSum == 0) {
                maxLen = i + 1;  // whole array from 0..i has sum 0
            }

            if (map.containsKey(prefixSum)) {
                // subarray between previous index+1 and i sums to 0
                maxLen = Math.max(maxLen, i - map.get(prefixSum));
            } else {
                // store first occurrence of this prefix sum
                map.put(prefixSum, i);
            }
        }
        return maxLen;
    }