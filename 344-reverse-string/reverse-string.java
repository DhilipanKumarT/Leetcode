class Solution 
{
    public void reverseString(char[] s)
    {
     int t=s.length;
     for (int i = 0; i < t / 2; i++) 
     {
            char temp = s[i];
            s[i] = s[t - 1 - i];
            s[t - 1 - i] = temp;
        }
     String fin=s.toString();
     System.out.print(fin);
    }
}