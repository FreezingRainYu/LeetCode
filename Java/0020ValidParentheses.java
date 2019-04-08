/**
 * @date 2019/04/06
 */
class Solution {
    public boolean isValid(String s) {
        Stack<String> p = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (p.empty() == false) {
                if ("(".equals(p.peek()) && ")".equals(s.substring(i, i + 1))) {
                    p.pop();
                } else if ("[".equals(p.peek()) && "]".equals(s.substring(i, i + 1))) {
                    p.pop();
                } else if ("{".equals(p.peek()) && "}".equals(s.substring(i, i + 1))) {
                    p.pop();
                } else {
                    p.push(s.substring(i, i + 1));
                }
            } else {
                p.push(s.substring(i, i + 1));
            }
        }
        return p.empty();
    }
}
