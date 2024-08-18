class Solution
{
    public int scoreOfString(String s) 
    {
        int r=0;
        for(int i=0;i<s.length()-1;i++)
        {
            char ch1=s.charAt(i);
            char ch2=s.charAt(i+1);
            int t1=(int) ch1;
            int t2=(int) ch2;
            int tem=Math.abs(t1 - t2);
            r+=tem;
        }
        return r;
    }
}