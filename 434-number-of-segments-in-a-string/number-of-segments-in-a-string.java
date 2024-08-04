class Solution
 {
    public int countSegments(String s) 
    {
        s=s.trim();
        if(s.equals(""))
        {
            return 0;
        }
         String []res=s.split("\\s+");
         return res.length;
    }
}