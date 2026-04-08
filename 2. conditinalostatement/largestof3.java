import java.util.*;
public class largestof3 {
    public static void main(String[] args) {
        int a=1,b=3,c=6;

        if (a>=b && b>=c){
            System.out.println("largest numberis a");
        }
        else if(b>=c){
            System.out.println("largest number is b");
        }
        else {
            System.out.println("largest number is c");
        }
    }
    
}
