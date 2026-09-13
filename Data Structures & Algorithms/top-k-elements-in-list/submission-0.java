class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Part 1:  create frequency map
        // create a HashMap, w/ frequencies as keys, and the integer from nums as the value.
        // So for each int in nums, if the map .containsValue(that int), create a new entry w/ the key + 1, same value.

        // Part 2:  read out top k frequencies, add to output List, return
        // Using a HashMap, we'll have to loop through the Map 1+ more times to find max value(s).
        // Is there another data structure that would keep the Entries sorted in order of value?
        // Maybe a SortedMap with a custom comparator?  But this only sorts entries on insertion;
        // it doesn't update their order as entries are modified.

        // part 1
        Map<Integer, Integer> frequencies = new HashMap<>();

        for (int key : nums) {
            if (!frequencies.containsKey(key)) {
                frequencies.put(key, 0);
            }
            frequencies.replace(key, frequencies.get(key) + 1);

        }

        int[] output = new int[k];
        
        for (int i = 0; i < k; i++) {
            int nextGreatest = frequencies.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);
            frequencies.remove(nextGreatest);
            output[i] = nextGreatest;
        }

        return output;
    }
}
