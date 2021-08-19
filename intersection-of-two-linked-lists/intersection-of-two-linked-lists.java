/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode nodeA = headA;
        ListNode nodeB = headB;
        int count1 = 0;
        int count2 = 0;
        while(nodeA != null){
            count1++;
            nodeA = nodeA.next;
        }
        nodeA = headA;
        while(nodeB != null){
            count2++;
            nodeB = nodeB.next;
        }
        nodeB = headB;
        ListNode res;
        System.out.println(count1 +" "+count2);
        if(count1 > count2){
            while(count1 > count2){
                nodeA = nodeA.next;
                count1--;
            }
            
            res = compare(nodeA, nodeB);
        }
        else{
            while(count2 > count1){
                nodeB = nodeB.next;
                count2--;
            }            
            res = compare(nodeA, nodeB);
        }
        return res;
        
    }
    
    public ListNode compare(ListNode lis1, ListNode lis2){
        while(lis1 != null){
            if(lis1 == lis2)
                return lis1;
            lis1 = lis1.next;
            lis2 = lis2.next;
        }
        return null;
    }
}