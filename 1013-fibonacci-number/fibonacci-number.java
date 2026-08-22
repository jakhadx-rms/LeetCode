class Solution {

    static int fibbo(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (n == 2) return 1;

        return fibbo(n - 1) + fibbo(n - 2);
    }

    public static int fib(int n) {
        return fibbo(n);
    }
}