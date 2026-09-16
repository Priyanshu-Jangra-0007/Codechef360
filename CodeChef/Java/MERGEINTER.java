class Solution {
    public List<List<Integer>> merge(List<List<Integer>> intervals) {
        if (intervals.size() == 0) return new ArrayList<>();

        // Sort intervals by start time
        intervals.sort(Comparator.comparingInt(a -> a.get(0)));

        List<List<Integer>> merged = new ArrayList<>();
        merged.add(new ArrayList<>(intervals.get(0)));

        for (int i = 1; i < intervals.size(); i++) {
            List<Integer> current = intervals.get(i);
            List<Integer> lastMerged = merged.get(merged.size() - 1);

            // Merge overlapping intervals
            if (current.get(0) <= lastMerged.get(1)) {
                lastMerged.set(1, Math.max(lastMerged.get(1), current.get(1)));
            } else {
                merged.add(new ArrayList<>(current));
            }
        }

        return merged;
    }
}
