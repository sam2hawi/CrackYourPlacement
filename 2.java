class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry=0;
        ListNode newnode = new ListNode(0);
        ListNode q1=newnode;
        while(l1!=null || l2!=null){
            int sum=0+carry;
            if(l1!=null){
                sum = sum+l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                sum = sum+l2.val;
                l2=l2.next;
            }
            carry=sum/10;
            sum=sum%10;
            q1.next=new ListNode(sum);
            q1=q1.next;
        }
        if(carry==1){
            q1.next=new ListNode(1);
            q1=q1.next;
        }
        return newnode.next;
    }
}
