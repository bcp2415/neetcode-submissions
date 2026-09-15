class Solution {

    public String encode(List<String> strs) {

        StringBuilder sb = new StringBuilder();

        for (String s : strs) {
            sb.append(s);
            sb.append("<*>");
        }
        String output = sb.toString();
        return output;
    }

    public List<String> decode(String str) {
        List<String> output = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (char ch : str.toCharArray()) {
            sb.append(ch);

            if (sb.toString().equals("<*>")) {
                output.add("");
                sb.delete(0, sb.length());
            }

            if (sb.length() > 2 && sb.substring(sb.length() - 3, sb.length()).toString().equals("<*>")) {

                output.add(sb.substring(0, sb.length() - 3));
                sb.delete(0, sb.length());
            }
        }

        return output;
    }
}
