class Solution 
{
    public int isPrefixOfWord(String sentence, String searchWord) 
    {
        int r=-1;
        String str[]=sentence.split(" ");
        for(int i=0;i<=str.length-1;i++)
        {
            if(str[i].startsWith(searchWord))
            {
                r=i;
                break;
            }
        }
        if(r==-1)
        {
            return -1;
        }
        else
        {
            return r+1;   
        }
    }
}