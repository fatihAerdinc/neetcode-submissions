/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head.next == null){
            return true;
        }

        ListNode temp = head;
        int count = 1;
        Stack<Integer> stack = new Stack<>();

        while(temp.next != null){
            temp = temp.next;
            count++;
        }

        temp = head;

        for(int i = 0; i < count/2; i++){
            stack.push(temp.val);
            temp = temp.next;
        }

        if(count%2 != 0){
            temp = temp.next;
        }

        for(int i = 0; i < count/2; i++){
            if(temp.val != stack.pop()){
                return false;
            }

            temp = temp.next;
        }

        return true;
        
    }
}