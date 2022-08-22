public class Main {
   public static void main(String[] args) {

      int n1 = 10, n2 = 6, n3 = 1, res;
      System.out.printf("Variable assigned: n1 = %s, n2 = %s, n3 = %s%n", n1, n2, n3);
      System.out.println();

      // Arithmetic
      System.out.println("Arithmetic operators:");
      System.out.printf("\tn1 / n2 = %s%n", n1 / n2);
      System.out.printf("\tn1 %% n2 = %s%n", n1 % n2);
      System.out.println();

      // Unary
      System.out.println("Unary operators:");
      System.out.printf("\tn1++ : value used (%s), value after (incremented afterwards) (%s)%n", n1++, n1);
      System.out.printf("\t--n1 :  value used (decremented directly) (%s), value after (%s)%n", --n1, n1);
      System.out.println();

      // Assignment
      System.out.println("Assignment operators:");
      res = n1;
      n1 *= 5;
      System.out.printf("\tn1 *= 5 : n1 (%s) multiplied by 5 (%s)%n", res, n1);
      n1 /= 5;
      System.out.printf("\tn1 /= 5 : n1 (%s) divided by 5 (%s)%n", res, n1);
      System.out.println();

      // Relational
      System.out.println("Relational operators:");
      System.out.printf("\tn1 > n2 = %s%n", n1 > n2);
      System.out.printf("\tn1 != n2 + n3 = %s%n", n1 != n2 + n3);
      System.out.println();

      // Logical
      System.out.println("Logical operators:");
      System.out.printf("\tn1 > n2 && n2 > n3 = %s%n", n1 > n2 && n2 > n3);
      System.out.printf("\tn1 != n2 + n3 && n1 == 9 = %s%n", n1 != n2 + n3 && n1 == 9);
      System.out.println();

      // Ternary
      System.out.println("Ternary operators:");
      System.out.printf("\tn1 > n2 ? n1 : n2 = %s%n", n1 > n2 ? n1 : n2);
      System.out.println();

      // Bitwise
      System.out.println("Bitwise operators:");
      System.out.printf("\tn1 & n2 = %s%n", n1 & n2);
      System.out.println();

      // Shift
      System.out.println("Shift operators:");
      System.out.printf("\tn1 >> n3 = %s (10: 1010 -> 101)%n", n1 >> n3);
      System.out.printf("\tn1 << n3 = %s (10: 1010 -> 10100)%n", n1 << n3);
      System.out.println();

      // instanceof
      System.out.println("instanceof operator:");
      Person person = new Person();
      Person boy = new Boy();
      System.out.println("\tBoy class extends Person and implements MyInterface. Boy objects are instances of Person and MyInterface");
      System.out.println();
      System.out.println("\tPerson person = new Person();");
      System.out.println("\tPerson boy = new Boy();");
      System.out.println();
      System.out.printf("\tperson instanceof Person = %s%n", person instanceof Person);
      System.out.printf("\tperson instanceof Boy = %s%n", person instanceof Boy);
      System.out.printf("\tperson instanceof MyInterface = %s%n", person instanceof MyInterface);
      System.out.println();
      System.out.printf("\tboy instanceof Person = %s%n", boy instanceof Person);
      System.out.printf("\tboy instanceof Boy = %s%n", boy instanceof Boy);
      System.out.printf("\tboy instanceof MyInterface = %s%n", boy instanceof MyInterface);

   }
   static class Person {}

   static class Boy extends Person implements MyInterface {}

   interface MyInterface {}
}