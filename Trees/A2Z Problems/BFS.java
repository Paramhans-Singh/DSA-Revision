import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS{
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new LinkedList<>();
        Queue<TreeNode> pending = new LinkedList<>();
        if(root == null) return ans;

        pending.add(root);

         while(!pending.isEmpty()){

           int count = pending.size();
           List<Integer> ansList = new LinkedList<>();

            for(int i=0;i<count;i++){
            TreeNode first = pending.remove();

            if(first.left != null) pending.add(first.left);
            if(first.right != null) pending.add(first.right);
            
            ansList.add(first.data);
            
           }
         ans.add(ansList);
        }
        return ans;
    }
}