class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> seen = new HashMap<>();
        int l = 0, result = 0;

        for (int r = 0; r < s.length(); r++) {
            if (seen.containsKey(s.charAt(r))) {
                l = Math.max(seen.get(s.charAt(r)) + 1, l);
            }
            seen.put(s.charAt(r), r);
            result = Math.max(r - l + 1, result);
        }
        return result;
    }
}
