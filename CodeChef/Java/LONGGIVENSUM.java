class Solution {
    public int longestSubarraySum(int[] nums, int k) {
        Map<Long, Integer> prefixIndex = new HashMap<>();
        long prefixSum = 0;
        int maxLen = 0;

        for (int i = 0; i < nums.length; i++) {
            prefixSum += nums[i];

            // Case: subarray from 0 to i
            if (prefixSum == k) {
                maxLen = i + 1;
            }

            // Case: subarray ending at i
            if (prefixIndex.containsKey(prefixSum - k)) {
                maxLen = Math.max(maxLen, i - prefixIndex.get(prefixSum - k));
            }

            // Store only first occurrence
            prefixIndex.putIfAbsent(prefixSum, i);
        }

        return maxLen;
    }
}