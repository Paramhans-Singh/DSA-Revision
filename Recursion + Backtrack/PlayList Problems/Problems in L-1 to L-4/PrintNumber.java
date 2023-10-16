public class PrintNumber {
    public static void PrintNum(int i , int n){
      if(i>n)
    //   if(n==0)
      return;

      PrintNum(i+1, n);
    // PrintNum(i, n-1);
    System.out.println(i);

    }
    public static void main (String[] args){
        int n = 5;
        PrintNum(1,n);
    }
}

