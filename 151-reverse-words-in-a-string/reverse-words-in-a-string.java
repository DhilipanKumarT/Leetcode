class Solution
 {
    public String reverseWords(String s)
     {
        String []res=s.split("\\s+");
        StringBuffer sb=new StringBuffer();
        for(int i=res.length-1;i>=0;i--)
        {
          sb.append(res[i]+" ");
        }
     return sb.toString().strip();   
    }
}