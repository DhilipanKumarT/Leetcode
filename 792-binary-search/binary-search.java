class Solution 
{
    public int search(int[] nums, int target) 
    {
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>target)
            {
                return -1;
            }
            else if(nums[i]==target)
            {
                return i;
            }
        }
        return -1;
    }
}