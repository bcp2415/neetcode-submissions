class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        Map<Integer, Integer> seen = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int search = target - nums[i];

            if (seen.containsKey(search)) {
                result[0] = seen.get(search);
                result[1] = i;
                return result;
            }

            seen.put(nums[i], i);
        }

        return result;
    }
}
