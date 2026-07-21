class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int index1 = 0;
        int index2 = numbers.length - 1;
        
        while(index1 < index2){
            if(numbers[index1] != numbers[index2]){
                int curr = numbers[index1] + numbers[index2];

                if(target == curr){
                    return new int[]{index1+1, index2 + 1};
                }
                if(curr > target){
                    index2--;
                }
                else{
                    index1++;
                }
            }
            else{
                index1++;
            }
            
        }
        return null;
    }
}
