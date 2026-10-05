class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> results = new HashMap<>();

        for (String s : strs) {
            int[] count = new int[26];
            for (char c : s.toCharArray()) {
                count[c - 'a']++;
            }
            String key = Arrays.toString(count);
            results.putIfAbsent(key, new ArrayList<>());
            results.get(key).add(s);
        }
        return new ArrayList<>(results.values());
    }
}
