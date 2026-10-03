class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        
        Map<Character, Integer> alpha = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (alpha.containsKey(s.charAt(i))) {
                int prev = alpha.get(s.charAt(i));
                alpha.put(s.charAt(i), prev + 1);
            } else {
                alpha.put(s.charAt(i), 1);
            }
            
            if (alpha.containsKey(t.charAt(i))) {
                int prev2 = alpha.get(t.charAt(i));
                alpha.put(t.charAt(i), prev2 - 1);
            } else {
                alpha.put(t.charAt(i), -1);
            }
        }

        List<Integer> nonMatching = alpha.values().stream().filter(val -> val != 0).toList();

        if (nonMatching.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}
