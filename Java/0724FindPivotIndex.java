/**
 * @date 2019/04/09
 */
class Solution {
    public int pivotIndex(int[] nums) {
        int leftSum = 0;
        int rightSum = 0;
        for (int i = 1; i < nums.length; i++) {
            rightSum += nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            if (leftSum == rightSum) {
                return i;
            }
            if (i + 1 == nums.length) {
                return -1;
            }
            leftSum += nums[i];
            rightSum -= nums[i + 1];
        }
        return -1;
    }
}
