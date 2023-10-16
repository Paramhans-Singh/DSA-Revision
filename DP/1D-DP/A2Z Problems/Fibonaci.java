import java.util.*;
public class Fibonaci{
public static int fibRec (int n){
    if(n<=1){
        return n;
    }
    return fibRec(n-1)+fibRec(n-2);
}

public static int fibM (int n){
    ArrayList<Integer> dp = new ArrayList<>();
    for(int i = 0 ;i<=n ; i++){
        dp.add(-1);
    }
    if(n<=1){
        return n;
    }

   if(dp.get(n)!=-1){
    return dp.get(n);
   }

    int temp = (fibM(n-1)+fibM(n-2));
    dp.set(n, temp);
    return temp;
    
    }

public static int fibDP (int n ){
    ArrayList<Integer> dp = new ArrayList<>();
    // for(int i=0;i<=n;i++){
    //     dp.add(-1);
    // }

    dp.add(0, 0);
    dp.add(1, 1);
    for(int i=2;i<=n;i++){
        dp.add(i, dp.get(i-1)+dp.get(i-2));
    }
return dp.get(n);
}

public static int fibOptimal(int n){
    if(n<=1){
        return n;
    }
    else{
    int prev2 = 0;
    int prev = 1;
    for(int i=2;i<=n;i++){
        int curr= prev+prev2;
        prev2=prev;
        prev=curr;
    }
    return prev;
    }
}

public static void main (String[] args){
// int ans = fibRec(5);
// int ans = fibM(5);
// int ans = fibDP(5);
int ans = fibOptimal(5);
System.out.println(ans);
}
}
