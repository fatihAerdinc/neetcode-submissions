class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int col = grid[0].length;
        int row = grid.length;

        int[] numArray = new int[col*row + 1];
        int[] ans = new int[2];


        for(int i = 0; i < col*row; i++){
            numArray[grid[i / row][i % col]]++;
        }

        for(int i = 0; i < numArray.length; i++){
            if(numArray[i] == 0){
                ans[1] = i;
            }
            else if(numArray[i] == 2){
                ans[0] = i;
            }
        }

        return ans;
    }
}