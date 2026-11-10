class Solution {
    public int search(int[] nums, int target) {
        return search(nums, target, 0, nums.length - 1);
    }

    private int search(int[] nums, int target, int l, int r) {
        while (l <= r) {
            int m = l + ((r - l) / 2);
            if (nums[m] == target) {
                return m;
            } else if (nums[m] < target) {
                l = ++m;
            } else if (nums[m] > target) {
                r = --m;
            }
        }
        return -1;
    }
}
