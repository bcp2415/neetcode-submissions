class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        PriorityQueue<Integer> window = new PriorityQueue<>((a, b) -> b - a);
        int[] result = new int[nums.length - k + 1];

        for (int i = 0; i < nums.length; i++) {
            window.offer(nums[i]);
            if (window.size() > k) {
                window.remove(nums[i - k]);
            }
            if (window.size() == k) {
                result[i - k + 1] = window.peek();
            }
            //System.out.println(window.toString());
        }

        return result;
    }
}
