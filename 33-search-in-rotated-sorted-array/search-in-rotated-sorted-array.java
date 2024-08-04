class Solution {
    public int search(int[] nums, int target)
     {
        for(int i=0;i<nums.length;i++)
        {
            int tmp=nums[i];
            if(tmp==target)
            {
                return i;
            }
        }
        return -1;
    }
}