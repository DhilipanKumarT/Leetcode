class Solution 
{
    public List<Boolean> kidsWithCandies(int[] can, int ex)
    {
        List<Boolean> res=new ArrayList<>();
        int n = can.length;
        int max=0;
        for (int i=0;i<n;i++) 
        {
            max = Math.max(max, can[i]);
        }
        for(int i=0;i<n;i++)
        {
            if(can[i]+ex>=max)
            {
                res.add(true);
            }
            else
            {
                res.add(false);
            }
        }
        return res;
    }
}