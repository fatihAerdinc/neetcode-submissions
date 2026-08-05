class Solution {
    public int evalRPN(String[] tokens) {
       Stack<Integer> stack = new Stack<>();

       for(String curr: tokens){
            if(curr.equals("+")){
                stack.push(stack.pop() + stack.pop());
            }
            else if(curr.equals("-")){
                int a = stack.pop();
                int b = stack.pop();

                stack.push(b - a);
            }
            else if(curr.equals("*")){
                stack.push(stack.pop()*stack.pop());
            }
            else if(curr.equals("/")){
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b/a);
            }
            else{
                stack.push(Integer.parseInt(curr));
            }
       }

       return stack.pop();
    }
}
