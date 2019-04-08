import static java.lang.Math.sqrt;

/**
 * @date 2019/04/06
 */
class Solution {
    public int numSquares(int n) {
        int answer = 0;
        find:
        for (int i = 0; i <= (int) sqrt(n); i++) {
            for (int j = 0; j <= (int) sqrt(n); j++) {
                for (int k = 0; k <= (int) sqrt(n); k++) {
                    for (int m = 0; m <= (int) sqrt(n); m++) {
                        if (i * i + j * j + k * k + m * m == n) {
                            if (i != 0) {
                                answer++;
                            }
                            if (j != 0) {
                                answer++;
                            }
                            if (k != 0) {
                                answer++;
                            }
                            if (m != 0) {
                                answer++;
                            }
                            break find;
                        }
                    }
                }
            }
        }
        return answer;
    }
}
