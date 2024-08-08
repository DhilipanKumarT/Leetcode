class Solution {
    public int[] sortedSquares(int[] nums)
    {
        int arr[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            int tem=nums[i];
            arr[i]=tem*tem;
        }
        Arrays.sort(arr);
     return arr;   
    }
}