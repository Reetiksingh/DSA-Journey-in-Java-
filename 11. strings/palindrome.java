

public class palindrome {
    public static void main (String args[]){
        String name = "racecar";
          printA(name);
          System.out.println(printA(name));
    }
    
    public static boolean printA(String str){
        for (int i = 0; i < str.length()/2; i++) {
            int n = str.length();
           if( str.charAt(0)!=str.charAt(n-1-i)){
            return false;

           }
            
        }
        return true;
    }
}
