/**
 * @date 2019/04/05
 */
class Solution {
    public int reverse(int x) {
        int result = 0;
        while (x != 0) {
            int digital = x % 10;
            x /= 10;
            if (result > 214748364 || result < -214748364) {
                return 0;
            }
            if ((result == 214748364 && digital > 7) || (result == -214748364 && digital < -8)) {
                return 0;
            }
            result = result * 10 + digital;
        }
        return result;
    }
}
