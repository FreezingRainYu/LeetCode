/**
 * @date 2019/04/06
 */
class Solution {
    public int[] plusOne(int[] digits) {
        digits[digits.length - 1]++;
        for (int i = digits.length - 1; i > 0; i--) {
            if (digits[i] > 9) {
                digits[i] -= 10;
                digits[i - 1]++;
            }
        }
        if (digits[0] > 9) {
            int[] answer = new int[digits.length + 1];
            System.arraycopy(digits, 1, answer, 1, digits.length - 1);
            answer[0] = 1;
            answer[answer.length - 1] = 0;
            return answer;
        }
        return digits;
    }
}
