class Solution
 {
    public int singleNumber(int[] nums) 
    {
        int len=nums.length;
        int uni=nums[0];
        for(int i=0;i<len;i++)
        {
            int tmp=nums[i];
            int c=0;
            for(int j=0;j<len;j++)
            {
                if(tmp==nums[j])
                {
                    c++;
                }
            }
            if(c==1)
            {
                uni=tmp;
            }
        }
     return uni;   
    }
}