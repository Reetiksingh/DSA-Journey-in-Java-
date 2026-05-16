import java.util.*;

public class q8lastoccur {
    public static int lastoccurance(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        int isfound = lastoccurance(arr, key, i + 1);
        if (isfound == -1 && arr[i] == key) {
            return i;
        }
        return isfound;
    }

    public static void main(String[] args) {
        int arr[] = { 8, 4, 3, 5, 6, 8, 3, 9, 5, 3 };
        System.out.println(lastoccurance(arr, 5, 0));
    }

}
