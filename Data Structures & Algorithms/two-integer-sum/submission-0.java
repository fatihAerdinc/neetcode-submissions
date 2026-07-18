class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> diffMap = new HashMap<>();

        diffMap.put(nums[0], 0);
        for(int i = 1; i < nums.length; i++){
            int diff = target - nums[i];
            
            if(diffMap.containsKey(diff)){
                return new int[]{diffMap.get(diff), i};
            }
            else{
                diffMap.put(nums[i], i);
            }
        }

        return null;
    }
}
