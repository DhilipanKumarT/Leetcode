class Solution 
{
    public void moveZeroes(int[] nums) 
    {
       int n=nums.length;
       int res=0;
       for(int i=0;i<n;i++)
       {
        if(nums[i]!=0)
        {
            nums[res]=nums[i];
            res++;
        }
       }
      for(int i=res;i<n;i++)
      {
       nums[i]=0;
      }
    }
}