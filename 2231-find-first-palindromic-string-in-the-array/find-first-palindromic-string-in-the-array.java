class Solution {
    public String firstPalindrome(String[] words)
    {
        int n=words.length;
        String res="";
        for(int i=0;i<n;i++)
        {
            String str=words[i];
            StringBuffer sb=new StringBuffer(str);
            String rev=sb.reverse().toString();
            if(str.equals(rev))
            {
                res=str;
                break;
            }
        }
     return res;
    }
}