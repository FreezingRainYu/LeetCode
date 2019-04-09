/**
 * @date 2019/04/05
 */
class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int origin = x;
        int reverse = 0;
        while (origin != 0) {
            int digital = origin % 10;
            origin /= 10;
            if (reverse > 214748364 || (reverse == 214748364 && digital > 7)) {
                return false;
            }
            reverse = reverse * 10 + digital;
        }
        return x == reverse;
    }
}
