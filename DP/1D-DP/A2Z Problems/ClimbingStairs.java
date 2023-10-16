public class ClimbingStairs {
    public static int climbRec(int n){
       if(n<=1)
       return 1;

     int left = climbRec(n-1);
     int right = climbRec(n-2);

       return left+right;
    }

    public static int climbM (int n){
        int dp[]= new int[n+1];
        for(int i =0;i<=n;i++){
            dp[i]=-1;
      }

      if(n<=1){
        return 1;
      }

      if(dp[n]!=-1){
       return dp[n];
      }

      else{
        return dp[n]= climbM(n-1)+climbM(n-2);
      }

    }

    public static int climbOptimal(int n){

    if(n<=1){
        return 1;
    } 
    else{
     int prev1=1;
     int prev=1;
     
     for(int i =2; i<=n; i++){
        int curr = prev+prev1;
        prev1=prev;
        prev=curr;
     }
     return prev;
    }
    }
    public static void main (String []args){
     int n = 4;
     int ans = climbM(n);
     System.out.println(ans);
    }
}
