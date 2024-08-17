class Solution 
{
    public String largestNumber(int[] nums) 
    {
        int n=nums.length;
        String str[]=new String[n];
        for(int i=0;i<n;i++)
        {
            str[i]=Integer.toString(nums[i]);
        }
        Arrays.sort(str,(a,b) -> ((b+a).compareTo(a+b)));
        if(str[0].equals("0")) 
        {
            return "0";
        }
        StringBuffer res = new StringBuffer();
        for(int i=0;i<str.length;i++)
        {
            res.append(str[i]);
        }
    return res.toString();
    }
}