public class PowX {
    public static double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }

        if (n < 0) {
            x = 1 / x;
            n = -n;
        }
        if (x == -1.00000 && n == Integer.MIN_VALUE) {
            return Math.abs(x);
        }
        int even = n / 2;
        int odd = (n + 1) / 2;

        return (helper(x, even) * helper(x, odd));
    }

    public static double helper(double num, int n) {
        if (n == 0) {
            return 1;
        }

        double temp = helper(num, n / 2);

        if (n % 2 == 0) {
            return temp * temp;
        } else {
            return num * temp * temp;
        }
    }

    public static void main(String[] args) {
        double x = 2;
        int n = 10;

        double ans = myPow(x, n);
        System.out.println(ans);
    }
}