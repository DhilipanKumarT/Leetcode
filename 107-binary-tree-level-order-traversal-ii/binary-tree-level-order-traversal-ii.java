class Solution 
{
    public List<List<Integer>> levelOrderBottom(TreeNode root) 
    {
        List<List<Integer>> res=new ArrayList<>();
        if(root==null)
        {
            return res;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            List<Integer> li=new ArrayList<>();
            int q_size=q.size();
            for(int i=0;i<q_size;i++)
            {
                TreeNode temp=q.poll();
                li.add(temp.val);
                if(temp.left!=null)
                {
                    q.add(temp.left);
                }
                if(temp.right!=null)
                {
                    q.add(temp.right);
                }
            }
            res.add(0,li);
        }
    return res;
    }
}