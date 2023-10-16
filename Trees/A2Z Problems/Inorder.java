import java.util.ArrayList;
import java.util.List;

public class Inorder {
       public void preorder(TreeNode root, List<Integer> ans){
        if(root!=null){
            preorder(root.left, ans);
             ans.add(root.data);
            preorder(root.right,ans);
        }
       } 
       public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        preorder(root,ans);
        return ans;
    }
}
