class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            char curr = s.charAt(i);

            if(this.openParan(curr)){
                stack.push(curr);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                char closed = stack.pop();

                if(curr == ')'){
                    if(closed != '('){
                        return false;
                    }
                }
                else if(curr == '}'){
                    if(closed != '{'){
                        return false;
                    }
                }
                else{
                    if(closed != '['){
                        return false;
                    }
                }
            }
        }

        return stack.isEmpty();
    }

    private boolean openParan(char para){
        if(para == '(' || para == '{' || para == '['){
            return true;
        }
        return false;
    }
}
