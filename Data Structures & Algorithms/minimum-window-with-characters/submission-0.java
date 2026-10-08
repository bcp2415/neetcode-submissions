class Solution {
    public String minWindow(String s, String t) {
        if (t.length() > s.length() || t.length() == 0) {
            return "";
        }

        Map<Character, Integer> window = new HashMap<>();
        Map<Character, Integer> tees = new HashMap<>();
        for (char c : t.toCharArray()) {
            tees.put(c, tees.getOrDefault(c, 0) + 1);
        }
        
        int have = 0;
        int need = tees.size();
        int[] result = {-1, -1};
        Integer shortest = Integer.MAX_VALUE;

        int l = 0;

        for (int r = 0; r < s.length(); r++) {
            char c = s.charAt(r);
            window.put(c, window.getOrDefault(c, 0) + 1);

            if (tees.containsKey(c) && tees.get(c).equals(window.get(c))) {
                have++;
            }

            while (have == need) {
                if ((r - l + 1) < shortest) {
                    shortest = r - l + 1;
                    result[0] = l;
                    result[1] = r;
                }

                char leftChar = s.charAt(l);
                window.put(leftChar, window.get(leftChar) - 1);
                if (tees.containsKey(leftChar) && tees.get(leftChar) > window.get(leftChar)) {
                    have--;
                }
                l++;
            }
        }

        return shortest == Integer.MAX_VALUE ? "" : s.substring(result[0], result[1] + 1);  
    }
}
