class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] results = new int[2];

        int left = 0;
        int right = numbers.length - 1;

        while (numbers[left] + numbers[right] != target) {
            int current = numbers[left] + numbers[right];
            if (current > target) {
                right--;
            } else {
                left++;
            }
        }

        results[0] = left + 1;
        results[1] = right + 1;
        return results;
    }
}
