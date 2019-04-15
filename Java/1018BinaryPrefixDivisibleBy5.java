/**
 * @date 2019/04/14
 */
class Solution {
    public List<Boolean> prefixesDivBy5(int[] A) {
        int bin = 0;
        List<Boolean> answer = new ArrayList<>();
        for (int i = 0; i < A.length; i++) {
            bin = (bin * 2 + A[i]) % 5;
            if (bin == 0) {
                answer.add(true);
            } else {
                answer.add(false);
            }
        }
        return answer;
    }
}
