class Solution {
    public boolean isPalindrome(String s) {
        String newString = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        System.out.println(newString);
        StringBuilder sb = new StringBuilder(newString);
        String reversed = sb.reverse().toString();
        return newString.equals(reversed);
    }
}
