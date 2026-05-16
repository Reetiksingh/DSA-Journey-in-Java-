import java.util.*;

public class q11tillingproblem {
    public static int tillingproblem(int n) {
        // base case
        if (n == 0 || n == 1) {
            return 1;
        }
        // vertical choice
        int fnm1 = tillingproblem(n - 1);
        // horizantal choice
        int fnm2 = tillingproblem(n - 2);

        int totways = fnm1 + fnm2;
        return totways;
    }

    public static void main(String[] args) {
        System.out.println(tillingproblem(4));
    }

}
