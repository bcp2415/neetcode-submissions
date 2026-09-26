class Solution {
    public int trap(int[] height) {
        int vol = 0;

        int l = 0;
        int r = height.length - 1;
        int moved = l;

        int leftMax = height[l];
        int rightMax = height[r];

        while (l < r) {

            int smaller = Math.min(leftMax, rightMax);
            int maybeAdd = smaller - height[moved];

            if (maybeAdd > 0) {
                vol += maybeAdd;
            }

            if (height[l] > leftMax) {
                leftMax = height[l];
            }

            if (height[r] > rightMax) {
                rightMax = height[r];
            }

            if (leftMax == rightMax) {
                l++;
                moved = l;
            } else if (leftMax < rightMax) {
                l++;
                moved = l;
            } else {
                r--;
                moved = r;
            }
            
        }

        return vol;
    }
}
