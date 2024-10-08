class Solution {
    public int reverse(int x)
     {
        int rev=0;
        while(x!=0)
        {
            int rem=x%10;
            int nrev=rev*10+rem;
            if((nrev-rem)/10!=rev)
            {
                return 0;
            }
            rev=nrev;
            x=x/10;
        }
        return rev;
    }
}