class Solution 
{
    public int searchInsert(int[] nums, int target) 
    {
        int ind=nums.length;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>=target)
            {
                ind=i;
                break;
            }
        }
    return ind;
    }
}