class Solution {
    public int[] replaceElements(int[] arr) {
        int highest = arr[arr.length - 1];
        int right = arr.length - 1;

        int[] arrNew = new int[arr.length];
        arrNew[arr.length - 1] = -1;

        for(int curr = arr.length - 2; curr >= 0; curr--){
            if(highest < arr[right]){
                highest = arr[right];
            }

            arrNew[curr] = highest;

            right--;
        }

        return arrNew;
    }
}