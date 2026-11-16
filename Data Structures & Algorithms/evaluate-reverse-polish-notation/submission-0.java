class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        String ops = "+-*/";

        for (int i = 0; i < tokens.length; i++) {
            String next = tokens[i];
            if (!ops.contains(next)) {
                stack.push(Integer.parseInt(next));
            } else if (next.equals("+")) {
                int l = stack.pop();
                int r = stack.pop();
                stack.push(l + r);
            } else if (next.equals("-")) {
                int l = stack.pop();
                int r = stack.pop();
                stack.push(r - l);
            } else if (next.equals("*")) {
                int l = stack.pop();
                int r = stack.pop();
                stack.push(l * r);
            } else if (next.equals("/")) {
                int l = stack.pop();
                int r = stack.pop();
                stack.push(r / l);
            }
        }
        return stack.pop().intValue();
    }
}
