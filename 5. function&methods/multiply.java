import java.util.*;

public class multiply {
   public static int calculateSum(int num1, int num2){
        int product = num1 * num2;
       return product;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int a= sc.nextInt();
        int b= sc.nextInt(); 
        int product = calculateSum(a,b);
        System.out.println("product is: " + product);
    }
}