class Solution
 {
    public List<Double> averageOfLevels(TreeNode root) 
    {
        List<Double> res=new ArrayList<>();
        Queue<TreeNode> q =new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            int q_size=q.size();
            long sum=0;
            for(int i=0;i<q_size;i++)
            {
                TreeNode temp=q.poll();
                sum+=temp.val;
                if(temp.left!=null)
                {
                    q.add(temp.left);
                }
                if(temp.right!=null)
                {
                    q.add(temp.right);
                }
            }
            double s=(double)sum/q_size;
            res.add(s);
        }
    return res;    
    }
}