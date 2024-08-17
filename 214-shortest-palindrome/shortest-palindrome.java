class Solution 
{
  public String shortestPalindrome(String s) 
  {
    StringBuilder sb= new StringBuilder(s);
    sb.reverse();
    String res=sb.toString();
    for (int i = 0; i < res.length(); i++)
    {
      if (s.startsWith(res.substring(i)))
      {
        return res.substring(0, i) + s;
      }
    }
    return res + s;
  }
}