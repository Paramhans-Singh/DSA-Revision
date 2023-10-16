public class CountGoodNum {
    public static int countGoodNumbers(long n) {
        if(n==1)
         return 5;
        int prime = 4 ;
        int even = 5;
        int product = prime*even;

        int loop = (int)(n/2);
        int part = (int) Math.pow(product, loop);
        if(n%2==0)
           return part; 
        
        else
           return even*part;
    }

    public static void main (String[] args){
        long n = 50;
        int ans = countGoodNumbers(n);
        System.out.println(ans);
    }
}
