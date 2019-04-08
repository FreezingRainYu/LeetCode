/**
 * @date 2019/04/05
 */
class Solution {
    public String longestCommonPrefix(String[] strs) {
        int shortest = 0;
        String answer = "";
        if (strs.length == 0) {
            return answer;
        }
        for (int i = 1; i < strs.length; i++) {
            if (strs[i].length() < strs[shortest].length()) {
                shortest = i;
            }
        }
        find:
        for (int i = 1; i <= strs[shortest].length(); i++) {
            String newAnswer = strs[shortest].substring(0, i);
            for (int j = 0; j < strs.length; j++) {
                if (j != shortest && newAnswer.equals(strs[j].substring(0, i)) == false) {
                    break find;
                }
            }
            answer = newAnswer;
        }
        return answer;
    }
}
