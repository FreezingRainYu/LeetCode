/**
 * @date 2019/04/09
 */
class Solution {
    public int dominantIndex(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }
        int maxIndex = 0;
        int subMaxIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nums[maxIndex]) {
                subMaxIndex = maxIndex;
                maxIndex = i;
            } else if (nums[i] > nums[subMaxIndex] && nums[i] < nums[maxIndex]) {
                subMaxIndex = i;
            }
        }
        if (maxIndex == 0) {
            subMaxIndex = 1;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] > nums[subMaxIndex] && nums[i] < nums[maxIndex]) {
                    subMaxIndex = i;
                }
            }
        }
        if (nums[subMaxIndex] * 2 <= nums[maxIndex]) {
            return maxIndex;
        }
        return -1;
    }
}
