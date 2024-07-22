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
    public ListNode removeElements(ListNode head, int val) {
        ListNode temp = new ListNode(0);
        temp.next =head;
        ListNode ans = temp;
        while(ans.next!=null){
            if(ans.next.val==val){
                ans.next = ans.next.next;
            }
            else{
                ans = ans.next;
            }
            
        }
        return temp.next;
    }
}
