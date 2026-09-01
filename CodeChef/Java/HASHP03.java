public int subarraySum(int[] nums, int n, int k) {
    int count = 0, sum = 0;
    HashMap<Integer, Integer> map = new HashMap<>();
    map.put(0, 1);  // Initialize map with sum 0 occurring once

    for (int i = 0; i < n; i++) {
        sum += nums[i];

        // Check if (sum - k) exists in the map
        if (map.containsKey(sum - k)) {
            count += map.get(sum - k);  // Increment count by the frequency of (sum - k)
        }
        // Update the map with the current cumulative sum
        map.put(sum, map.getOrDefault(sum, 0) + 1);
    }

    return count; 
}