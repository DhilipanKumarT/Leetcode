class Solution
 {
    public int numJewelsInStones(String jewels, String stones) 
    {
      char jew[]=jewels.toCharArray();
      int []res=new int[jew.length];
      for(int i=0;i<jew.length;i++)
      {
        int c=0;
        for(int j=0;j<stones.length();j++)
        {
            if(jew[i]==stones.charAt(j))
            {
              c++;
            }
        }
        res[i]=c;
      }
      int sum=0;
     for(int i=0;i<res.length;i++)
     {
        sum+=res[i];
     }
    return sum;   
    }
}