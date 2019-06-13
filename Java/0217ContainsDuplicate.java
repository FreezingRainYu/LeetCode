/**
 * @date 2019/04/29
 */
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numsSet = new HashSet<>();
        for (int i : nums) {
            if (!numsSet.contains(i)) {
                numsSet.add(i);
            } else {
                return true;
            }
        }
        return false;
    }
}
