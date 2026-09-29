class Solution {
    public int lengthOfLongestSubstring(String s) {
        int longest = 0;
        int local = 0;
        Map<Character, Integer> seen = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            //System.out.println("i: " + i);
            if (seen.containsKey(s.charAt(i))) {
                // clear seen for indexes below the earlier identical key
                // get index of earlier duplicate that is in the map
                // remove that map entry and any others that have earlier indexes
                // set local to the size of the remaining map
                // now we can keep counting:  local has the # of non-duplicate chars we have seen
                // and the map has all those non-duplicate entries since the last duplicate
                int duplicateIndex = seen.get(s.charAt(i));
                i = duplicateIndex + 1;
                seen.clear();
                local = 0;
            }
            seen.put(s.charAt(i), i);
            local++;

            if (local > longest) {
                longest = local;
            }
        }

        return longest;
    }
}
