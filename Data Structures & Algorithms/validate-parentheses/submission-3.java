class Solution {
    public boolean isValid(String s) {
        Stack<String> check = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char next = s.charAt(i);
            if (next == '(') {
                check.push(")");
            } else if (next == '[') {
                check.push("]");
            } else if (next == '{') {
                check.push("}");
            } else if (next == ')') {
                if (check.size() > 0 && check.peek() == ")") {
                    check.pop();
                } else {
                    return false;
                }
            } else if (next == ']') {
                if (check.size() > 0 && check.peek() == "]") {
                    check.pop();
                } else {
                    return false;
                }
            } else if (next == '}') {
                if (check.size() > 0 && check.peek() == "}") {
                    check.pop();
                } else {
                    return false;
                }
            }
        }
        if (check.size() > 0) {
            return false;
        }
        return true;
    }
}