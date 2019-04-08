/**
 * @date 2019/04/05
 */
class Solution {
    public int romanToInt(String s) {
        int result = 0;
        int[] digital = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'I':
                    digital[i] = 1;
                    break;
                case 'V':
                    digital[i] = 5;
                    break;
                case 'X':
                    digital[i] = 10;
                    break;
                case 'L':
                    digital[i] = 50;
                    break;
                case 'C':
                    digital[i] = 100;
                    break;
                case 'D':
                    digital[i] = 500;
                    break;
                case 'M':
                    digital[i] = 1000;
                    break;
                default:
            }
        }
        for (int i = 0; i < s.length(); i++) {
            result += digital[i];
            if (i > 0 && digital[i] > digital[i - 1]) {
                result -= digital[i - 1] * 2;
            }
        }
        return result;
    }
}
