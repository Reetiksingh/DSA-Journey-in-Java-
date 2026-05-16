import java.util.*;
public class q4sumofn {
    public static int calsum(int n) {
        if(n==1){
            return 1;
        }
        int snm1= calsum(n-1);
        int sn = n+snm1;
        return sn;
    }

    public static void main(String[] args) {
        int n=10;
        System.out.println(calsum(n));
    }
    
}
