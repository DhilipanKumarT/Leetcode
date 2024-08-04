class Solution {
    public boolean checkPerfectNumber(int num)
    {
        int sum=1;
        if(num!=1)
        {
          for(int i=2;i<=num/2;i++)
          {
            if(num%i==0)
            {
                sum=sum+i;
            }
          }
        }
        else
        {
            return false;
        }
    if(sum==num)
    {
        return true;
    }
    else
    {
        return false;
    }
        
    }
}