class Solution {
    public int search(int[] nums, int target) {

        return search(nums, target, 0, nums.length - 1);
    }

    private int search(int[] nums, int target, int left, int right){
        if(left > right){
            return -1;
        }
        int middle = left + (right - left) /2;

        if(nums[middle] == target){
            return middle;
        }

        if(nums[middle] < target){
            return search(nums, target, middle + 1, right);
        }
        else{
            return search(nums, target, left, middle - 1);
        }
    }
}
