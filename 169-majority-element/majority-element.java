class Solution 
{
    public int majorityElement(int[] nums) 
    {
      Arrays.sort(nums);
      int t=nums.length/2;
      return nums[t];
    }
}