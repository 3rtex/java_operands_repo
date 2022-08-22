public class Main {
   public static void main(String[] args) {
      int i = 3;
      int j = 0;
      String s = "";

      while(i > 0) {
         s += j++;

         if (j % 2 == 0 || --i == 2){
            s += i;
         }
      }

      // s value ?
   }
}