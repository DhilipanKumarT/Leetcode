class Solution 
{
    public int maxAbsoluteSum(int[] nums) 
    {
        // Kadane's algorithm to find maximum subarray sum
        int maxSum = nums[0];
        int minSum = nums[0];
        int currentMax = nums[0];
        int currentMin = nums[0];
        
        for (int i = 1; i < nums.length; i++) 
        {
            // Calculate max subarray sum up to index i
            currentMax = Math.max(nums[i], currentMax + nums[i]);
            maxSum = Math.max(maxSum, currentMax);
            
            // Calculate min subarray sum up to index i
            currentMin = Math.min(nums[i], currentMin + nums[i]);
            minSum = Math.min(minSum, currentMin);
        }
        
        // The result is the maximum of the max sum and the absolute value of the min sum
        return Math.max(Math.abs(maxSum), Math.abs(minSum));
    }
}