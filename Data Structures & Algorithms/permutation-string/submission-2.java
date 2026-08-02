class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s2.length() < s1.length()){
            return false;
        }
        int l = 0;
        int r = s1.length() - 1;

        Map<Character, Integer> s1Map = new HashMap<>();

        Map<Character, Integer> currMap = new HashMap<>();

        for(int i = 0; i < s1.length(); i++){
            char s1Curr = s1.charAt(i);
            s1Map.put(s1Curr, s1Map.getOrDefault(s1Curr, 0) + 1);

            char s2Curr = s2.charAt(i);
            currMap.put(s2Curr, currMap.getOrDefault(s2Curr, 0) + 1);
        }

        while(r < s2.length()){
            if(s1Map.equals(currMap)){
                return true;
            }

            char currL = s2.charAt(l);
            if(currMap.get(currL) > 1){
                currMap.put(currL, currMap.get(currL) - 1);
            }
            else{
                currMap.remove(currL);
            }

            l++; r++;
            
            if(r < s2.length()){
                char currR = s2.charAt(r);
                currMap.put(currR, currMap.getOrDefault(currR, 0) + 1);
            }
        }

        return false;
    }
}
