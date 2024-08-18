class Solution 
{
    public int prefixCount(String[] words, String pref) 
    {
        int r=0;
        for(int i=0;i<words.length;i++)
        {
            String t=words[i];
            if(t.startsWith(pref))
            {
                r++;
            }
        }
    return r;  
    }
}