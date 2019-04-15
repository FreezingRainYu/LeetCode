/**
 * @date 2019/04/14
 */
class Solution {
    public boolean confusingNumber(int N) {
        int origin = N;
        int quantity = 0;
        List<Integer> digList = new ArrayList<>();
        while (N != 0) {
            int d = N % 10;
            N = N / 10;
            digList.add(d);
            quantity++;
        }
        int[] digArr = new int[quantity];
        for (int i = quantity - 1; i >= 0; i--) {
            digArr[i] = digList.get(quantity - 1 - i);
        }
        int[] revArr = new int[quantity];
        for (int i = 0; i < quantity; i++) {
            switch (digArr[i]) {
                case 0:
                    revArr[i] = 0;
                    break;
                case 1:
                    revArr[i] = 1;
                    break;
                case 6:
                    revArr[i] = 9;
                    break;
                case 8:
                    revArr[i] = 8;
                    break;
                case 9:
                    revArr[i] = 6;
                    break;
                default:
                    return false;
            }
        }
        int reverse = 0;
        for (int i = quantity - 1; i >= 0; i--) {
            reverse = reverse * 10 + revArr[i];
        }
        return origin != reverse;
    }
}
