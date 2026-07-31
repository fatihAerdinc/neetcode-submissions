class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int[] arr = new int[26];

        Map<String, List<String>> map = new HashMap<>();

        for(String str:strs){
            Arrays.fill(arr, 0);

            for(char curr: str.toCharArray()){
                arr[curr - 'a']++; 
            }
            String key = Arrays.toString(arr);
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(str);
        }

        return new ArrayList<>(map.values());
    }
}
