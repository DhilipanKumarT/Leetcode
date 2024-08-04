class Solution {
    public int fib(int n)
    {
     int p1=0;
     int p2=1;
     int c=0;
     if(n<=1)
        {
            return n;
        }
     else
     {
        for(int i=2;i<=n;i++)
        {
            c=p1+p2;
            p1=p2;
            p2=c;
        }
     }
     return c;   
    }
}