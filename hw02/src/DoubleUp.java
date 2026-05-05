public class DoubleUp {
   /**
     * Returns a new string where each character of the given string is repeated twice.
     * Example: doubleUp("hello") -> "hheelllloo"
     */
   public static String doubleUp(String s) {
      // TODO: Fill in this function
      StringBuilder doubleup = new StringBuilder();
      //int length = s.length();
      for (int i = 0; i < s.length(); i++){
         doubleup.append(s.charAt(i));
         doubleup.append(s.charAt(i));
      }

      return doubleup.toString();
   }
   
   public static void main(String[] args) {
      String s = doubleUp("hello");
      System.out.println(s);
      
      System.out.println(doubleUp("cat"));
   }
}