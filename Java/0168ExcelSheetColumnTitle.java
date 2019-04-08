/**
 * @date 2019/04/06
 */
class Solution {
    public String convertToTitle(int n) {
        StringBuilder answer = new StringBuilder();
        while (n > 0) {
            n--;
            answer.append((char) (n % 26 + 65));
            n /= 26;
        }
        return answer.reverse().toString();
    }
}
