class Solution {
    public int characterReplacement(String s, int k) {
        int longest = 0;

        Set<Character> chars = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            chars.add(s.charAt(i));
        }

        for (Character ch : chars) {
            int l = 0;
            int r = 0;
            int count = 0;

            while (r < s.length()) {
                if (s.charAt(r) == ch) {
                    count++;
                }

                if (r - l + 1 - count > k) {
                    if (s.charAt(l) == ch) {
                        count--;
                    }
                    l++;
                } else {
                    longest = Math.max((r - l + 1), longest);
                    r++;
                }
            }
        }

        return longest;
    }
}
