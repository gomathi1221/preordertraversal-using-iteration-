class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
      List<Integer>list=new ArrayList<>();
      if(root==null){
        return list;
      }
      Stack<TreeNode>st=new Stack<>();
      st.push(root);
      while(!st.empty()){
        TreeNode curr=st.pop();
        list.add(curr.val);
        if(curr.right!=null){
            st.push(curr.right);
        }
        if(curr.left!=null){
            st.push(curr.left);
        }
        
      }
      return list;
    
       
       
    }
   
    
}