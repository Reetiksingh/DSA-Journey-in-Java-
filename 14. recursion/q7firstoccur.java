import java.util.*;

public class q7firstoccur {
    public static int firstoccurance(int arr[],int key ,int i) {
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstoccurance(arr, key, i+1);
        
    }

    public static void main(String[] args) {
        int arr[] = { 3, 5, 7, 2, 8, 6, 9 };
        System.out.println(firstoccurance(arr, 8, 0));
    }

}
