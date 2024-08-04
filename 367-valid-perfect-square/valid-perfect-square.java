class Solution {
    public boolean isPerfectSquare(int num)
    {
        double tmp=Math.sqrt(num);
        int res=(int)tmp;
        int s=res*res;
        if(s==num)
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
}