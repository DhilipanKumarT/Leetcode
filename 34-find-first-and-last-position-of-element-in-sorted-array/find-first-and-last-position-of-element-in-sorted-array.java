class Solution {
    public int[] searchRange(int[] nums, int target)
    {
        int len=nums.length;
        int res[]=new int[2];
        res[0]=-1;
        res[1]=-1;
        if(len!=0)
        {
        for(int i=0;i<len;i++)
        {
            if(nums[i]==target)
            {
                res[0]=i;
                break;
            }
            else
            {
                res[0]=-1;
            }
        }
         for(int i=len-1;i>=0;i--)
        {
            if(nums[i]==target)
            {
                res[1]=i;
                break;
            }
            else
            {
                res[1]=-1;
            }
        }
    }
    else
    {
        return res;
    }
    return res;  
    }
}