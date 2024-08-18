class Solution 
{
    public String reversePrefix(String word, char ch) 
    {
        int n=word.length();
        int k=0;
        String tn="";
        for(int i=0;i<n;i++)
        {
            if(ch==word.charAt(i))
            {
                k=i;
                tn=word.substring(k+1);
                break;
            }
        }
        if(k==0)
        {
            return word;
        }
        String s1=word.substring(0,k+1);
        StringBuffer sb1=new StringBuffer(s1);
        sb1.reverse();
        String res="";
        res=res+sb1.toString();
        res+=tn;
        return res;     
    }
}