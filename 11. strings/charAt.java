

public class charAt {
    public static void main(String[] args) {
        String firstName ="Reetik";
        String lastName ="Singh";
        String fullName =firstName+" "+ lastName;
        printchar(fullName);

    }

    public static void printchar(String str){
    for (int i = 0; i < str.length(); i++) {
        System.out.print(str.charAt(i) + " ");
    }
    System.out.println("  ");
    }
}
