class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] results = new int[2];

        for (int i = 0; i < numbers.length; i++) {
            int found = Arrays.binarySearch(numbers, i + 1, numbers.length, target - numbers[i]);
            if (found > 0) {
                results[0] = i + 1;
                results[1] = found + 1;
                return results;
            }
        }

        return results;
    }
}
