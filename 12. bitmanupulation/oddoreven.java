
import java.util.*;

public class oddoreven {
    public static void oddoreven(int n) {
        int bitMask = 1;
        if ((n & bitMask) == 0) {
            System.out.println("EVEN NO.");
        } else {
            System.out.println("ODD NO.");
        }
    }

    public static void main(String[] args) {
        oddoreven(76);
        oddoreven(97);
    }
}
