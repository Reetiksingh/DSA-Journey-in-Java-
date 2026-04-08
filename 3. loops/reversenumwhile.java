import java.util.*;
public class reversenumwhile {
    public static void main(String[] args) {
        int n = 11092004;

        while(n>0){
            int lastDigit=n%10;
            System.out.print(lastDigit);
            n=n/10;
        }
    }
    
}
