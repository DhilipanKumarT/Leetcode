class Solution
 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2)
    {
        ListNode dummy=new ListNode(-1);
        ListNode tem=dummy;
        int carry=0;
        while(l1!=null || l2!=null)
        {
            int d1=0,d2=0;
            if(l1!=null)
            {
              d1=l1.val;
            }
            if(l2!=null)
            {
              d2=l2.val;
            }
            int rem=(d1+d2+carry)%10;
            ListNode r=new ListNode(rem);
            carry=(d1+d2+carry)/10;
            tem.next=r;
            tem=tem.next;
            if(l1!=null)
            {
                l1=l1.next;
            }
             if(l2!=null)
            {
                l2=l2.next;
            }
        }
        if(carry==1)
        {
            tem.next=new ListNode(carry);
        }
      return dummy.next;
    }
 }