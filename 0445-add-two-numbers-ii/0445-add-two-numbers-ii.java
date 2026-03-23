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

    public static ListNode reverse(ListNode head)
    {
        ListNode prev = null;
        ListNode curr = head ;

        while(curr!=null)
        {
            ListNode next = curr.next;
            curr.next = prev ;
            prev = curr ;
            curr = next ;
        }
        return prev;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode dummynode = new ListNode(-1);
        ListNode curr = dummynode ; 
        ListNode t1 = reverse(l1) ;
        ListNode t2 = reverse(l2) ;  

        int carry = 0;

        while(t1!=null || t2!=null)
        {
            int sum = carry ;

            if(t1!=null)
            {
                sum+=t1.val;
            }

            if(t2!=null)
            {
                sum+=t2.val;
            }

            ListNode NewNode = new ListNode(sum%10);
            carry = sum / 10 ;

            curr.next=NewNode;
            curr=curr.next;

            if(t1!=null)
            {
                t1=t1.next;
            }

            if(t2!=null)
            {
                t2=t2.next;
            }

        }

        if(carry>0)
        {
            ListNode NewNode = new ListNode(carry);
            curr.next=NewNode;
        }

        ListNode newn = dummynode.next ;

        ListNode ans = reverse(newn);



        return ans ;  
        
    }
}