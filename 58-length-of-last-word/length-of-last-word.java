class Solution {
    public int lengthOfLastWord(String s)
    {
        String []arr=s.split(" ");
        int l=arr.length;
        String res=arr[l-1];
        int r=res.length();
        return r;       
    }
}