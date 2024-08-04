class Solution
{
    public List<String> generateParenthesis(int n) 
    {
        List<String> res=new ArrayList<>();
        String str="";
        Para(n,str,res,0,0);
        return res;
    }
    public static void Para(int n,String str,List<String> res,int op_cou,int clo_cou)
    {
        if(op_cou==n&&clo_cou==n)
        {
            res.add(str);
            return;
        }
        else
        {
        //open parantheses
        if(op_cou<n)
        {
            Para(n,str+"(",res,op_cou+1,clo_cou);
        }
        //close parantheses
        if(op_cou>clo_cou)
        {
            Para(n,str+")",res,op_cou,clo_cou+1);
        }
        }
    }
}