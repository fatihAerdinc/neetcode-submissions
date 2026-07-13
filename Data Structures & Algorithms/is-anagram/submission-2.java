class Solution {
    public boolean isAnagram(String s, String t) {
        Map<String, Integer> sCharCount = new HashMap<>(); 
        Map<String, Integer> tCharCount = new HashMap<>();   

        for(int i = 0; i < s.length(); i++){
            String currChar = "" +s.charAt(i);

            if(!sCharCount.containsKey(currChar)){
                sCharCount.put(currChar, 1);
            }
            else{
                sCharCount.put(currChar, sCharCount.get(currChar) + 1);
            }
        }

        for(int i = 0; i < t.length(); i++){
            String currChar = "" + t.charAt(i);

            if(!tCharCount.containsKey(currChar)){
                tCharCount.put(currChar, 1);
            }
            else{
                tCharCount.put(currChar, tCharCount.get(currChar) + 1);
            }
        }

        if(sCharCount.size() != tCharCount.size()){
            return false;
        }

        for(String k: sCharCount.keySet()){
            if(!sCharCount.get(k).equals(tCharCount.get(k))){
                return false;
            }
        }

        return true;

    }
}
