class Solution {
    public boolean isValid(String s) {
        String check = "";
        for (int i = 0; i < s.length(); i++) {
            char next = s.charAt(i);
            if (next == '(') {
                check += ")";
            } else if (next == '[') {
                check += "]";
            } else if (next == '{') {
                check += "}";
            } else if (next == ')') {
                if (check.length() > 0 && check.charAt(check.length() - 1) == ')') {
                    check = check.substring(0, check.length() - 1);
                } else {
                    return false;
                }
            } else if (next == ']') {
                if (check.length() > 0 && check.charAt(check.length() - 1) == ']') {
                    check = check.substring(0, check.length() - 1);
                } else {
                    return false;
                }
            } else if (next == '}') {
                if (check.length() > 0 && check.charAt(check.length() - 1) == '}') {
                    check = check.substring(0, check.length() - 1);
                } else {
                    return false;
                }
            }
        }
        if (check != "") {
            return false;
        }
        return true;
    }
}