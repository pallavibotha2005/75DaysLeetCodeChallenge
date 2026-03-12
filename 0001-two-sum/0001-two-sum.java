class Solution {
    public int[] twoSum(int[] nums, int target) {
         Map<Integer, Integer> map = new HashMap<>();
        for (int j = 0; j < nums.length; j++) {
            int diff = target - nums[j];
            if (map.containsKey(diff)) {
                return new int[] { map.get(diff), j };
            }
            map.put(nums[j], j);
        }
        return new int[] {};
    }
}