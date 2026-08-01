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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null){
            return head.next;
        }

        int count = 1;
        ListNode temp = head;

        while(temp.next != null){
            temp = temp.next;
            count++;
        }

        temp = head;
        int initDiff = count - n;
        int currDiff = initDiff;

        if(initDiff == 0){
            return head.next;
        }

        while(currDiff - 1 > 0){
            temp = temp.next;
            currDiff--;
        }
        if(n == 1){
            temp.next = null;
        }
        else{
            temp.next = temp.next.next;
        }
        
        return head;

    }
}
