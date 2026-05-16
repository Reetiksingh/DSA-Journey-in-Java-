import java.util.*;

public class q13findingpair {
    public static int friendspairing(int n) {
        if (n == 1 || n == 2) {
            return n;
        }

        // coices
        // single
        int fnm1 = friendspairing(n - 1);
        // pair
        int fnm2 = friendspairing(n - 2);
        int pairways = (n - 1) * fnm2;

        // totways
        int totways = fnm1 + pairways;
        return totways;
    }

    public static void main(String[] args) {
        System.out.println(friendspairing(3));
    }

}
