class Solution {
    public int longestConsecutive(int[] nums) {
        int championLength = 0;

        Set<Integer> in = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            in.add(nums[i]);
        }

        Set<Integer> starters = new HashSet<>();
        for (Integer i : in) {
            if (!in.contains(i - 1)) {
                starters.add(i);
            }
        }

        for (Integer i : starters) {
            List<Integer> localRun = new LinkedList<>();
            localRun.add(i);
            
            while (in.contains(localRun.getLast() + 1)) {
                localRun.add(localRun.getLast() + 1);
            }

            if (localRun.size() > championLength) {
                championLength = localRun.size();
            }
        }


        return championLength;
    }
}
