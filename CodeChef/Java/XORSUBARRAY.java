class Solution {
    public int countSubarraysWithXOR(int[] arr, int k) {
        Map<Integer, Integer> freq = new HashMap<>(); // Stores count of prefix XORs
        int prefixXOR = 0;
        int count = 0;

        for (int num : arr) {
            prefixXOR ^= num; // Current prefix XOR

            // If the prefix XOR itself equals k
            if (prefixXOR == k) {
                count++;
            }

            // If there exists a prefix XOR that when XORed with current gives k
            count += freq.getOrDefault(prefixXOR ^ k, 0);

            // Store the current prefix XOR in the map
            freq.put(prefixXOR, freq.getOrDefault(prefixXOR, 0) + 1);
        }

        return count;
    }
}