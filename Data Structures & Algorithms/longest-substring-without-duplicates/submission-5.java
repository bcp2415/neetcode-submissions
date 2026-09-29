class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }
        if (s.length() == 1) {
            return 1;
        }
        int longest = 0;
        int local = 0;
        Set<Character> seen = new HashSet<>();
        int l = 0;
        int r = 1;
        seen.add(s.charAt(l));
        local++;

        while (r < s.length()) {
            if (seen.contains(s.charAt(r))) {
                seen.remove(s.charAt(l));
                l++;
                local--;
                if (local < 0) {
                    local = 0;
                }
                continue;
            }
            
            seen.add(s.charAt(r));
            local++;
            r++;

            if (local > longest) {
                longest = local;
            }
        }

        return longest;
    }
}
