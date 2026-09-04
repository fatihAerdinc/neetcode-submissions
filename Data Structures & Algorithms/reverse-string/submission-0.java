class Solution {
    public void reverseString(char[] s) {
        int front = 0;
        int back = s.length - 1;

        while(front < back){
            char curr = s[front];
            s[front] = s[back];
            s[back] = curr;

            front++;
            back--;
        }
    }
}