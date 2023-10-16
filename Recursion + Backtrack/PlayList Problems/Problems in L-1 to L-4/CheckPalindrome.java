public class CheckPalindrome {
    public static boolean palin(String str, int i){
        int n = str.length();

        if(i>=n/2)
        return true;

        char first = str.charAt(i);
        char last = str.charAt(n-i-1);

        if(first != last)
        return false;

        return palin(str, i+1);
      } 

      public static void main (String[] args){
          String str = "madsm";
          boolean ans = palin(str,0);
          System.out.println(ans);
      }

}
