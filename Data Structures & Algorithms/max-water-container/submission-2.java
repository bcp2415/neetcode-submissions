class Solution {
    public int maxArea(int[] heights) {
        int greatest = 0;

        int l = 0;
        int r = heights.length - 1;

        while (l < r) {
            int width = r - l;
            int height = Math.min(heights[l], heights[r]);
            if (width * height > greatest) {
                greatest = width * height;
            }

            if (heights[l] > heights[r]) {
                r--;
            } else {
                l++;
            }
        }

        return greatest;
    }
}
