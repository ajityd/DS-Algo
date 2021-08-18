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
        ListNode reversed = reverseAndClone(head);
        return isEqual(head, reversed);
    }
    
    public ListNode reverseAndClone(ListNode head){
        ListNode newHead = null;
        while(head != null){
            ListNode curr = new ListNode(head.val);
            curr.next = newHead;
            newHead = curr;
            head = head.next;
        }
        return newHead;
    }
    
    public boolean isEqual(ListNode lis1, ListNode lis2){
        while(lis1 != null && lis2 != null){
            if(lis1.val != lis2.val)
                return false;
            lis1 = lis1.next;
            lis2 = lis2.next;
        }
        return lis1 == null && lis2 == null;
    }
    
}