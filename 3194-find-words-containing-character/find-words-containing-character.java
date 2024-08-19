class Solution 
{
    public List<Integer> findWordsContaining(String[] words, char x) 
    {
        List<Integer> res=new ArrayList<>();
        for(int i=0;i<words.length;i++)
        {
            String t=words[i];
            for(int j=0;j<t.length();j++)
            {
                if(x==t.charAt(j))
                {
                    res.add(i);
                    break;
                }
            }
        }
     return  res;  
    }
}