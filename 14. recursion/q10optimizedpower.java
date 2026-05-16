import java.util.*;

public class q10optimizedpower {
    public static int optimizedpower(int a, int n) {
        if (n == 0) {
            return 1;
        }

        int halfpower = optimizedpower(a, n / 2);
        int halfpopwersqr = halfpower * halfpower;

        // odd power
        if (n % 2 != 0) {
            halfpopwersqr = a * halfpopwersqr;
        }
        return halfpopwersqr;
    }

    public static void main(String[] args) {
        int a = 2;
        int n = 9;
        System.out.println(optimizedpower(a, n));
    }

}
