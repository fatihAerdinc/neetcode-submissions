class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int length = piles.length;
        int largest = piles[0];

        for(int i = 0; i < length; i++){
            if(piles[i] > largest){
                largest = piles[i];
            }
        }
        int low = 1;
        int high = largest;
        int result = -1;

        while(low <= high){
            int middle = low + (high - low)/2;

            int time = 0;

            for(int i = 0; i < length; i++){
                time += Math.ceil((double)piles[i]/middle); 
            }

            if(time <= h){
                result = middle;
                high = middle - 1;
            }
            else{
                low = middle + 1;
            }
        }

        return result;
        
    }


}
