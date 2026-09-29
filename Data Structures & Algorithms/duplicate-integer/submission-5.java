class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> exists = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (exists.contains(nums[i])) {
                return true;
            }
            exists.add(nums[i]);
        }
        return false;
    }
}