class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        StringBuilder first = new StringBuilder(s);
        StringBuilder second = new StringBuilder(t);
        for (int i = 0; i < s.length(); i++) {
            char next = first.charAt(i);
            int found = second.indexOf(String.valueOf(next));
            if (found == -1) {
                return false;
            } else {
                second.deleteCharAt(found);
            }
        }
        return true;
    }
}
