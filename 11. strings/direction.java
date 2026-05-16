public class direction {
    public static void main(String[] args) {
        String directions ="WNEENESENNN";
        System.out.println(ShortestPath(directions));
    }
    public static float ShortestPath (String str){
        int x=0;
        int y=0;
          for (int i = 0; i < str.length(); i++) {
              if (str.charAt(i)=='N') {
                y++;
              }
              else if (str.charAt(i)=='E'){
                x++;
              }
              else if (str.charAt(i)=='S'){
                y--;
              }
               else {
                x--;
              } 
          }
          int X2 =x*x;
          int Y2 = y*y;
        return (float)Math.sqrt(X2+Y2);

    }
}
