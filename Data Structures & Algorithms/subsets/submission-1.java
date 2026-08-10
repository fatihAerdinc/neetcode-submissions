class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();

        backtracking(0,nums, subset, result);

        return result;
    }

    private void backtracking(int index, int[] nums, List<Integer> subset,  List<List<Integer>> list){
        if(index == nums.length){
            list.add(new ArrayList<>(subset));
            return;
        }

        subset.add(nums[index]);
        backtracking(index+1, nums, subset, list);
        subset.remove(subset.size() - 1);
        backtracking(index+1, nums, subset, list);

    }

}
