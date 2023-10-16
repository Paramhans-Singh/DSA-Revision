import java.util.ArrayList;
import java.util.List;

public class Postorder {
       public void preorder(TreeNode root, List<Integer> ans){
        if(root!=null){
            preorder(root.left, ans);
            preorder(root.right,ans);
            ans.add(root.data);
        }
       } 
       public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        preorder(root,ans);
        return ans;
    }
}
