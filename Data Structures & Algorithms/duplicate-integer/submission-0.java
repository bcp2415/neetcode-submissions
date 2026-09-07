class Solution {
    public boolean hasDuplicate(int[] nums) {
        var hashSet = new HashSet();
        for (int i = 0; i < nums.length; i++) {
            int next = nums[i];
            if (!hashSet.contains(next)) {
                hashSet.add(next);
            } else {
                return true;
            }
        }
        return false;
    }
}