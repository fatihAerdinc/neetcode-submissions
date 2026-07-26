class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0;

        int longest = 0;

        Map<Character, Integer> map = new HashMap<>();

        for(int r = 0; r < s.length(); r++){
            char curr = s.charAt(r);

            if(map.containsKey(curr) && r > l){
                l = Math.max(map.get(curr) + 1, l);
            }

            map.put(curr, r);

            longest = Math.max(longest, r - l + 1);
        }

        return longest;

    }
}
