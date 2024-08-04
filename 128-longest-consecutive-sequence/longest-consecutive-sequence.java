class Solution 
{
    public int longestConsecutive(int[] nums) 
    {
        int count=1,max=1;
        Arrays.sort(nums);
        int n=nums.length;
        if(n==0)
        {
            return 0;
        }
        for(int i=0;i<=n-2;i++)
        {
            if(nums[i]==nums[i+1])
            {
                continue;
            }
            else if(nums[i]+1==nums[i+1])
            {
                count++;
                if(count>max)
                {
                    max=count;
                }
            }
            else
            {
                count=1;
            }
        }
      return max;  
    }
}