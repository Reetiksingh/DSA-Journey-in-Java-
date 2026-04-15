import java.util.*;

 public class functionoverloading {
//     public static int sum(int a,int b){
//     return a+b;
//      }

//     public static int sum(int a,int b, int c){
//     return a+b+c;
// }

  public static int sum(int a,int b){
 return a+b;
      }

      
 public static float sum(float a,float b){
    return a+b;
  }
public static void main(String args[]){
    System.out.println(sum(5,7));
    System.out.println(sum(8.f,8.5f));
}
    
}
