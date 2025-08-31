public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
}
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        List<List<Integer>> ans = new LinkedList<List<Integer>>();
        if(root == null){
            return ans;
        }
        int flag = 1;
        q.offer(root);
        while(!q.isEmpty()){
            int levelSize = q.size();
            List<Integer> level = new LinkedList<Integer>();
            for(int i = 0; i<levelSize; i++){
                if(q.peek().left != null){
                    q.offer(q.peek().left);
                }
                if(q.peek().right != null){
                    q.offer(q.peek().right);
                }
                if(flag == 0){
                    level.addFirst(q.poll().val);
                }
                else{
                    level.addLast(q.poll().val);
                }
            }
            flag = 1 - flag;
            ans.add(level);
        }
        return ans;
    }
}