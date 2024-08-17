class Solution 
{
    public int rangeSumBST(TreeNode root, int low, int high) 
    {
        if(root==null)
        {
            return 0;
        }
        Queue<TreeNode> q=new LinkedList<>();
        List<Integer> li=new ArrayList<>();
        q.add(root);
        while(!q.isEmpty())
        {
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
        }
        int sum=low+high;
        for(int i=0;i<li.size();i++)
        {
          int t=li.get(i);
          if(t>low && t<high)
          {
            sum=sum+t;
          }
        }
    return sum;
    }
}