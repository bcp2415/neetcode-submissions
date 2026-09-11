class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> seen = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (seen.containsKey(complement)) {
                if (i < seen.get(complement)) {
                    result[0] = i;
                    result[1] = seen.get(complement);
                    break;
                } else {
                    result[0] = seen.get(complement);
                    result[1] = i;
                    break;
                }
            } else {
                seen.put(nums[i], i);
            }
        }
        return result;
    }
}
