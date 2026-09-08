class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> results = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (results.contains(nums[i])) {
                return true;
            } else {
                results.add(nums[i]);
            }
        }
        return false;
    }
}