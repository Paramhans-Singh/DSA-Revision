import java.util.ArrayList;
import java.util.List;

public class Preorder {
    public void preorder(TreeNode root, List<Integer> ans){
        if(root !=null){
             ans.add(root.data);
             preorder(root.left,ans);
             preorder(root.right,ans);
        }
      } 
      public List<Integer> preorderTraversal(TreeNode root) {
           List<Integer> ans = new ArrayList<>();
           preorder(root,ans);
           return ans;
      }
}


// Morris Traversal bhi hai kuch