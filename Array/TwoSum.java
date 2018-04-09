public class TwoSum.java {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] indexs = new int[]{-1, -1};
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                indexs[0] = i;
                indexs[1] = map.get(target - nums[i]);
                return indexs;
            } else
                map.put(nums[i], i);
        }
        return indexs; 
    }
}
