class Solution
{
    public int countPrefixes(String[] words, String s) 
    {
        int r=0;
        for(int i=0;i<words.length;i++)
        {
            if(s.startsWith(words[i]))
            {
               r++;
            }
        }
    return r;
    }
}