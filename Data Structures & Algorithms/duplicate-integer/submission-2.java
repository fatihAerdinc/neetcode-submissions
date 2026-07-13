class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> exists = new HashSet<>();
        
        for(int i = 0; i < nums.length; i++){
            if(!exists.contains(nums[i])){
                exists.add(nums[i]);
            }
            else{
                return true;
            }
        }
    

        return false;
    }
}