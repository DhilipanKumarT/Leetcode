class Solution
 {
    public int[] decode(int[] encoded) 
    {
        int n=encoded.length;
        int t=0;
        for(int i=1;i<=(n+1);i++)
        {
            t=t^i;
        }
        int r=0;
        for(int j=1;j<n;j+=2)
        {
          r=r^encoded[j];
        }
        int temp=t^r;
        int res[]=new int[n+1];
        res[0]=temp;
        for(int k=0;k<n;k++)
        {
            res[k+1]=res[k]^encoded[k];
        }
        return res;
    }
}