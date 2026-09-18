class Solution {
    public int longestConsecutive(int[] nums) {

        Map<Integer, Set<Integer>> groups = new HashMap<>();
        int championLength = 0;

        for (int i = 0; i < nums.length; i++) {
            Set<Integer> localSet = new HashSet<>();
            localSet.add(nums[i]);
            
            while (groups.containsKey(Collections.min(localSet) - 1)) {
                
                localSet.addAll(groups.get(Collections.min(localSet) - 1));

            }

            while (groups.containsKey(Collections.max(localSet) + 1)) {
                
                localSet.addAll(groups.get(Collections.max(localSet) + 1));

            }

            groups.put(nums[i], localSet);

            if (localSet.size() > championLength) {
                    championLength = localSet.size();
                }
        }

        return championLength;
    }
}
