import java.util.ArrayList;

public class SubsetSum1{
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
        ArrayList<Integer> ans = new ArrayList<>();
        helper(arr, 0, 0, N, ans);    
        return ans;
    }

    private void helper(ArrayList<Integer> arr,int ind, int sum , int N , ArrayList<Integer> ans) {
        if(ind==arr.size()){
            ans.add(sum);
            return;
        }
        helper(arr, ind+1, sum+arr.get(ind), N, ans);

        helper(arr, ind+1, sum, N, ans);
    }
}