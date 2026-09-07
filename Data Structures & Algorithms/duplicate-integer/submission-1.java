class Solution {
    public boolean hasDuplicate(int[] nums) {
        var results = IntStream.of(nums).distinct().toArray();
        return nums.length != results.length;
    }
}