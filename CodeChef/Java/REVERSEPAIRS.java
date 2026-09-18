class Solution {
    public int merge(int[] nums, int low, int mid, int high) {
        int count = 0;
        int j = mid + 1;

        // Count reverse pairs
        for (int i = low; i <= mid; i++) {
            while (j <= high && (long) nums[i] > 2L * nums[j]) {
                j++;
            }
            count += (j - (mid + 1));
        }

        // Merge step
        int n1 = mid - low + 1;
        int n2 = high - mid;

        int[] left = new int[n1];
        int[] right = new int[n2];

        for (int i = 0; i < n1; i++)
            left[i] = nums[low + i];

        for (int i = 0; i < n2; i++)
            right[i] = nums[mid + 1 + i];

        int i = 0, k = low, l = 0;

        while (i < n1 && l < n2) {
            if (left[i] <= right[l]) {
                nums[k++] = left[i++];