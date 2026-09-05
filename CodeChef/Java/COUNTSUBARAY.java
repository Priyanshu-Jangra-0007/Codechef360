class Solution {
    public int subarraySum(int[] arr, int k) {
        Map<Integer, Integer> prefixCount = new HashMap<>();
        prefixCount.put(0, 1); // base case: empty prefix sum

        int sum = 0, count = 0;
        for (int num : arr) {
            sum += num;
            int rem = sum - k;
            if (prefixCount.containsKey(rem)) {
                count += prefixCount.get(rem);
            }
            prefixCount.put(sum, prefixCount.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}

