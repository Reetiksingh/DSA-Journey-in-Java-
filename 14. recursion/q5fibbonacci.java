import java.util.*;
public class q5fibbonacci {
    public static int fib(int n){
        if(n==0|n==1){
        return n;
        }
      
        int fibnm1 =fib(n-1);
        int fibnm2 =fib(n-2);
        int fibn = fib(n-1)+fib(n-2);
        return fibn;
    }

    public static void main(String[] args) {
        int n=24;
        System.out.println(fib(25));
        System.out.println(fib(26));
    }
    
}
