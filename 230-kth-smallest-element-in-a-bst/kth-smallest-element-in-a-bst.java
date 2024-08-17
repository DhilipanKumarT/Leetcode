class Solution 
{
    public int kthSmallest(TreeNode root, int k) 
    {
      List<Integer> li=new ArrayList<>();
      Queue<TreeNode> q=new LinkedList<>();
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
        Collections.sort(li);
        return li.get(k-1);
    }
}