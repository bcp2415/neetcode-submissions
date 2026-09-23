class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        
        List<List<Integer>> output = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {

            int left = i + 1;
            int right = nums.length - 1;

            if (nums[i] > 0) {
                break;
            }

            while (left < right) {
                
                if (nums[i] + nums[left] + nums[right] == 0) {
                    List<Integer> next = new ArrayList<>();
                    next.add(nums[i]);
                    next.add(nums[left]);
                    next.add(nums[right]);
                    if (!output.contains(next)) {
                        output.add(next);
                    }
                    left++;
                    right--;
                    continue;
                }

                if (nums[i] + nums[left] + nums[right] < 0) {
                    left++;
                } else if (nums[i] + nums[left] + nums[right] > 0) {
                    right--;
                }
            }
        }

        return output;

    }
}
