import java.util.*;

public class operations {
    // get i operation
    // public static int getithBit(int n, int i) {
    // int bitMask = 1 << i;
    // if ((n & bitMask) == 0) {
    // return 0;
    // } else {
    // return 1;
    // }
    // }

    // set i operation
    // public static int setIthbit(int n, int i) {
    //     int bitMask = 1 << i;
    //     return n | bitMask;

    // }

    //clear  i th 
    public static int clearIthbit(int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;

    }

    public static void main(String[] args) {
        System.out.println(clearIthbit(10, 1));

    }
}
