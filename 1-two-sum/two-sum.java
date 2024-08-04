class Solution 
{
    public int[] twoSum(int[] nums, int target) 
    {
        int arr[]=new int[2];
        int l=nums.length;
        HashMap<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<=l-1;i++)
        {
            int key=target-nums[i];
            if(m.containsKey(key))
            {
               arr[0]=m.get(key);
               arr[1]=i;
               return arr;
            }
            else
            {
               m.put(nums[i],i);
            }
        }
       return arr; 
    }
}