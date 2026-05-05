public class StarTriangle5 {
   /**
     * Prints a right-aligned triangle of stars ('*') with 5 lines.
     * The first row contains 1 star, the second 2 stars, and so on. 
     */
   public static void starTriangle5() {
      // TODO: Fill in this function
      int i = 1;
      int j = 3;
      String star = "*";
      String space = "    ";
      while (i <= 5){
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
      starTriangle5();
   }
}