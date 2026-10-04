class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int length = s1.length();

        for (int i = 0; i <= s2.length() - length; i++) {
            String substring = s2.substring(i, i + length);

            boolean isAna = isAnagram(s1, substring);

            if (isAna) {
                return true;
            }
        }
        return false;
    }

    private boolean isAnagram(String s1, String s2) {
        // skip length check; caller guarantees lengths are equal

        int[] alpha = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            char s1char = s1.charAt(i);
            char s2char = s2.charAt(i);

            alpha[s1char - 'a']++;
            alpha[s2char - 'a']--;
        }

        for (int i = 0; i < 26; i++) {
            if (alpha[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
