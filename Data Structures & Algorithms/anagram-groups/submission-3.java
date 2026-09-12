class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> output = new ArrayList<>();

        HashMap<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);

            if (!map.containsKey(sorted)) {
                ArrayList<String> newValue = new ArrayList<>();
                newValue.add(s);
                map.put(sorted, newValue);
            } else {
                ArrayList<String> newValue = (ArrayList) map.get(sorted);
                newValue.add(s);
                map.put(sorted, newValue);
            }

        }

        for (String key : map.keySet()) {
            output.add(map.get(key));
        }

        return output;
    }
}
