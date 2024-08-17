class Solution 
{
  public String shortestPalindrome(String s) 
  {
    String res="";
    for(int i=s.length()-1;i>=0;i--)
    {
        res=res+Character.toString((s.charAt(i)));
    }
    for (int i = 0; i < res.length(); i++)
    {
      if (s.startsWith(res.substring(i)))
      {
        return res.substring(0, i) + s;
      }
    }
    return "";
  }
}