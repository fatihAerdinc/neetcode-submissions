class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();

        backtracking(0, res, subset, nums);

        return res;
    }

    private void backtracking(int index, List<List<Integer>> list, List<Integer> subset, int[] nums){
        if(index == nums.length){
            list.add(new ArrayList<>(subset));
            return;
        }

        subset.add(nums[index]);
        backtracking(index+1, list, subset, nums);
        subset.remove(subset.size() - 1);
        backtracking(index+1, list, subset, nums);
    }
    
}
