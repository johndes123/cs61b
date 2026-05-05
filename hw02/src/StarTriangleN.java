public class StarTriangleN {
   /**
     * Prints a right-aligned triangle of stars ('*') with N lines.
     * The first row contains 1 star, the second 2 stars, and so on. 
     */
   public static void starTriangle(int N) {
      // TODO: Fill in this function
      int i = 1;
      int k = 1;
      int j = N - 2;
      String star = "*";
      String space = "";
      while (k < N) {
         space += " ";
         k += 1;
      }
      while (i <= N){
         IO.println(space + star);
         space = space.substring(0, j);
         star += "*";
         i += 1;
         if (j > 0) {
            j -= 1;
         }
      }
   }
   
   public static void main(String[] args) {
      starTriangle(7);
      IO.println("1");
   }
}