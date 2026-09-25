class Solution {
    public int trap(int[] height) {
        int vol = 0;

        Map<Integer, Integer> lefts = new HashMap<>();
        Map<Integer, Integer> rights = new HashMap<>();

        int leftMax = 0;
        int rightMax = 0;


        for (int i = 0; i < height.length; i++) {

            if (height[i] > leftMax) {
                leftMax = height[i];
            }

            lefts.put(i, leftMax);

            if (height[height.length - 1 - i] > rightMax) {
                rightMax = height[height.length - 1- i];
            }

            rights.put(height.length - 1 - i, rightMax);

        }

        for (int i = 0; i < height.length; i++) {
            int volHere = Math.min(lefts.get(i), rights.get(i)) - height[i];
            vol += volHere;
        }

        return vol;
    }
}
