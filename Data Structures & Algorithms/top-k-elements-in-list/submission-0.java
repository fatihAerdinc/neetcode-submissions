class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer>[] freq = new List[nums.length];
        int[] ans = new int[k];

        for(int i = 0; i < freq.length; i++){
            freq[i] = new ArrayList<>();
        }

        for(int j = 0; j < nums.length; j++){
            int curr = nums[j];

            map.put(curr, map.getOrDefault(curr, 0) + 1);
        }

        for(int num : map.keySet()){
            int freqOfNum = map.get(num);

            freq[freqOfNum - 1].add(num);
        }

        
        int index = 0;
        int frequency = nums.length - 1;
        for(int i = frequency; i >= 0 && index < k; i--){
            for(int num : freq[i]){
                ans[index++] = num;

                if(index == k){
                    return ans;
                }
            }
        }

        return ans;
    }
}
