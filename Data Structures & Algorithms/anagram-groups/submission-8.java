class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groups = new HashMap<>();
        
        for (String s : strs) {
            boolean found = false;
            for (String key : groups.keySet()) {
                if (isAnagram(s, key)) {
                    List<String> anagrams = groups.get(key);
                    anagrams.add(s);
                    groups.put(key, anagrams);
                    found = true;
                }
            } 
            if (!found) {
                List<String> newValue = new ArrayList<String>();
                newValue.add(s);
                groups.put(s, newValue);
            }
        }

        List<List<String>> results = new ArrayList<>();
        results.addAll(groups.values());
        return results;
    }

    private boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        if (s1.length() == 0) {
            return true;
        }
        
        int[] alpha = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            Character next1 = s1.charAt(i);
            Character next2 = s2.charAt(i);

            alpha[next1 - 'a']++;
            alpha[next2 - 'a']--;
        }

        for (int i = 0; i < 26; i++) {
            if (alpha[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
