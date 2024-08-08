class Solution
 {
    public ListNode removeNthFromEnd(ListNode head, int n) 
    {
      int len=0;
      ListNode temp=head;
      while(temp!=null)
      {
        len++;
        temp=temp.next;
      }
      temp=head;
      int r=len-n;
      if(r==0)
      {
        return head.next;
      }
      for(int i=1;i<=r-1;i++)
      {
        temp=temp.next;
      }
      temp.next=temp.next.next;
      return head;
    }
}