class Solution {
    public int[] productExceptSelf(int[] nums) {
        int totalProduct = 1;
        int zeroCount = 0;
        int zeroIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                totalProduct *= nums[i];
            } else {
                zeroCount++;
                zeroIndex = i;
            }
        }

        int[] output = new int[nums.length];

        if (zeroCount > 1) {
            return output;
        }

        if (zeroCount == 1) {
            for (int j = 0; j < nums.length; j++) {
                if (j == zeroIndex) {
                    output[j] = totalProduct;
                }
            }
        }

        if (zeroCount == 0) {
            for (int j = 0; j < nums.length; j++) {   
                output[j] = totalProduct / nums[j];
            }
        }

        return output;
    }
}  
