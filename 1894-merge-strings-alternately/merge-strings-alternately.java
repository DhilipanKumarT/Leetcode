class Solution 
{
   public String mergeAlternately(String word1, String word2) 
   {
    String res="";
    int l1=word1.length();
    int l2=word2.length();
    int max=Math.max(l1,l2);
    for(int i=0;i<max;i++)
    {
        if(i<l1)
        {
            res+=word1.charAt(i);
        }
        if(i<l2)
        {
            res+=word2.charAt(i);
        }
    } 
    return res;
   }
}