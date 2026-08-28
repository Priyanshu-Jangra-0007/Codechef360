class Solution {
    public int[] maxSubArray(int[] nums) {
        long maxSum = nums[0];
        long currSum = nums[0];

        int start = 0, end = 0;
        int tempStart = 0;

        for (int i = 1; i < nums.length; i++) {
            if (currSum + nums[i] < nums[i]) {
                currSum = nums[i];
                tempStart = i;
            } else {
                currSum += nums[i];
            }

            int currLen = i - tempStart + 1;
            int bestLen = end - start + 1;

            if (currSum > maxSum ||
                (currSum == maxSum && currLen > bestLen)) {
                maxSum = currSum;
                start = tempStart;
                end = i;
            }
        }

        return Arrays.copyOfRange(nums, start, end + 1);
    }
}