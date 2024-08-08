class Solution {
    public int findDuplicate(int[] nums) 
    {
      HashSet<Integer> temp = new HashSet<>();
      for(int i:nums)
      {
        if(temp.contains(i))
        {
            return i;
        }
        temp.add(i);
      }
      return 0;
    }
}