class Solution
{
    public int trap(int[] height) 
    {
        int n=height.length;
        int pr[]=new int[n];
        int su[]=new int[n];
        pr[0]=height[0];
        for(int i=1;i<=n-1;i++)
        {
            if(pr[i-1]<height[i])
            {
                pr[i]=height[i];
            }
            else
            {
                pr[i]=pr[i-1];
            }
        }
        su[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--)
        {
            if(su[i+1]<height[i])
            {
                su[i]=height[i];
            }
            else
            {
                su[i]=su[i+1];
            }
        }
        int sum=0;
        for(int i=0;i<=n-1;i++)
        {
            int min=(pr[i]<=su[i])?pr[i]:su[i];
            sum=sum+(min-height[i]);
        } 
        return sum;
    }
}