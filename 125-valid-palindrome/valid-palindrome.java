class Solution 
{
    public boolean isPalindrome(String s) 
    {
        StringBuilder res = new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(Character.isLetterOrDigit(ch))
            {
                res.append(Character.toLowerCase(ch));
            }
        }
        String org=res.toString();
        String rev=res.reverse().toString();
        return rev.equals(org);   
    }
}