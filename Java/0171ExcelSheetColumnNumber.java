/**
 * @date 2019/04/06
 */
class Solution {
    public int titleToNumber(String s) {
        int answer = 0;
        for (int i = 0; i < s.length(); i++) {
            int digit = (int) s.charAt(i) - 64;
            answer = answer * 26 + digit;
        }
        return answer;
    }
}
