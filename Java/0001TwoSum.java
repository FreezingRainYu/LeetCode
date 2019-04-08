/**
 * @date 2019/04/04
 */
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numsMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            numsMap.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            if (numsMap.containsKey(target - nums[i]) && numsMap.get(target - nums[i]) != i) {
                return new int[]{i, numsMap.get(target - nums[i])};
            }
        }
        return null;
    }
}
