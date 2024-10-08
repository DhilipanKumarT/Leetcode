public class Solution 
{
    public ListNode detectCycle(ListNode head) 
    {
        if(head==null|| head.next==null)
        {
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) 
        {
            fast = fast.next.next;
            slow = slow.next;             
            if (slow == fast)
            {       
                break;
            }
        }  
        if (fast == null || fast.next == null) 
        {
            return null;
        }
        ListNode cy = head;
        while (cy != slow) 
        {
            cy = cy.next; 
            slow = slow.next;       
        }
    return cy;
    }
}