/**
 * @date 2019/04/14
 */
class Solution {
    public String convert(String s, int numRows) {
        if (numRows < 2) {
            return s;
        }
        int mark = 1;
        boolean inc = true;
        int[] row = new int[s.length()];
        for (int i = 0; i < row.length; i++) {
            row[i] = mark;
            if (inc == true) {
                mark++;
                if (mark == numRows + 1) {
                    mark -= 2;
                    inc = false;
                }
            } else {
                mark--;
                if (mark == 0) {
                    mark += 2;
                    inc = true;
                }
            }
        }
        StringBuilder answer = new StringBuilder();
        for (int i = 1; i <= numRows; i++) {
            for (int j = 0; j < row.length; j++) {
                if (row[j] == i) {
                    answer.append(s.charAt(j));
                }
            }
        }
        return answer.toString();
    }
}
