class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] tester = new int[26];

        for (int i = 0; i < s.length(); i++) {
            tester[s.charAt(i) - 'a']++;
            tester[t.charAt(i) - 'a']--;
        }

        for (int i = 0; i < 26; i++) {
            if (tester[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
