class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int size = matrix[0].length*matrix.length - 1;

        return search(matrix, target, 0, size);

    }

    private boolean search(int[][] matrix, int target, int l, int r){
        if(l > r){
            return false;
        }
        
        int middle = l + (r-l)/2;
        int row = middle / matrix[0].length;
        int col = middle % matrix[0].length;


        if(matrix[row][col] == target){
            return true;
        }

        if(matrix[row][col] < target){
            return search(matrix, target, middle + 1, r);
        }
        else{
            return search(matrix, target, l, middle - 1);
        }
    }
}
