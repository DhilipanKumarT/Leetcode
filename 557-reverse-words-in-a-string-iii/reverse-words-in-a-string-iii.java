class Solution 
{
    public String reverseWords(String s)
    {
     String []res=s.split(" ");
     for(int i=0;i<res.length;i++)
     {
        String tmp=res[i];
        StringBuffer sb=new StringBuffer(tmp);
        res[i]=sb.reverse().toString();
     }
     String fin=String.join(" ",res);
     return fin;   
    }
}