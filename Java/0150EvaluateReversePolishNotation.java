/**
 * @date 2019/04/06
 */
class Solution {
    public int evalRPN(String[] tokens) {
        int optl, optr;
        int ans;
        Stack<Integer> t = new Stack<>();
        for (String s : tokens) {
            switch (s) {
            case "+":
                optr = t.pop();
                optl = t.pop();
                ans = optl + optr;
                t.push(ans);
                break;
            case "-":
                optr = t.pop();
                optl = t.pop();
                ans = optl - optr;
                t.push(ans);
                break;
            case "*":
                optr = t.pop();
                optl = t.pop();
                ans = optl * optr;
                t.push(ans);
                break;
            case "/":
                optr = t.pop();
                optl = t.pop();
                ans = optl / optr;
                t.push(ans);
                break;
            default:
                t.push(Integer.parseInt(s));
            }
        }
        return t.pop();
    }
}
