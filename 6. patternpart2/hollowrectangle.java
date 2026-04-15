import java.util.*;

public class hollowrectangle {
    public static void hollow_rectangle(int totRows, int totCols){
        for(int i=1 ; i<=totRows ; i++){//outer loop-rows
            for(int j=1 ; j<=totCols ; j++){//inner loop-coloumns
                if (i==1 || i==totRows || j==1 || j==totCols){//boundry cell condition
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
    }
}

    public static void main(String[] args) {
        hollow_rectangle(5, 8);

    }

}
