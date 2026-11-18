class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> st = new Stack<>();
        int[] result = new int[temperatures.length];

        for (int i = 0; i < temperatures.length; i++) {
            result[i] = 0;
        }

        for (int i = 0; i < temperatures.length; i++) {

            while (st.size() > 0 && temperatures[st.peek()] < temperatures[i]) {
                int last = st.pop();
                result[last] = i - last;
            }

            st.push(i);
        }

        return result;
    }
}
