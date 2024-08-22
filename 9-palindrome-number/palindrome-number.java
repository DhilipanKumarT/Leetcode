class Solution {
    public boolean isPalindrome(int x) 
    {
        String str=Integer.toString(x);
        StringBuilder sb=new StringBuilder(str);
        String t=sb.reverse().toString();
        if(str.equals(t))
        {
            return true;
        }
     return false;   
    }
}