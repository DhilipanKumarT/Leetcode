class Solution {
    public boolean isAnagram(String s, String t) 
    {
        char []c1=s.toCharArray();
        Arrays.sort(c1);
        String r1=new String(c1);
        char []c2=t.toCharArray();
        Arrays.sort(c2);
        String r2=new String(c2);
        if(r1.equals(r2))
        {
            return true;
        }
    return false;
    }
}