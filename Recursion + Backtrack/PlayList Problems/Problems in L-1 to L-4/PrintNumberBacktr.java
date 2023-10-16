public class PrintNumberBacktr {
    
public static void PrintNum(int i , int n){
      if(i>n)
      return;

      PrintNum(i+1, n);
      System.out.println(i); // recursion call ke baad ka line is backtracking 

    }
    public static void main (String[] args){
        int n = 5;
        PrintNum(1,n);
    }
}