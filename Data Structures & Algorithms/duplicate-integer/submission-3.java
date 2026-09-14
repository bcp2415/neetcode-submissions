class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();

        for (int key : nums) {
            if (seen.contains(key)) {
                return true;
            }
            seen.add(key);
        }
        return false;
    }
}