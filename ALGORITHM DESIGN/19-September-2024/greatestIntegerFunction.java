public class greatestIntegerFunction {
    public static void main(String[] args) {

        System.out.println(gcd(15, 10));
    }
    public static int gcd(int m, int n) {
        if (n == 0) {
            return m;
        }
        return gcd(n, m % n);
    }
}
