import java.util.Scanner;
public class QuadraticEquation {
   public static void main(String[] args) {
      double a, b, c, root_1, root_2, quadratic_equation;
      double real_number, imaginary_number;
       Scanner d = new Scanner(System.in);
    
      System.out.print("Enter the value of a : ");
      a = d.nextDouble();
      System.out.print("Enter the value of b : ");
      b = d.nextDouble();
      System.out.print("Enter the value of c : ");
      c = d.nextDouble();
      quadratic_equation = b*b - 4*a*c ;
      if (quadratic_equation > 0) {
         root_1 = (-b + Math.sqrt(quadratic_equation)) / (2 * a);
         root_2 = (-b - Math.sqrt(quadratic_equation)) / (2 * a);
         System.out.format("root_1 = %.2f and root_2 = %.2f", root_1, root_2);
      }
      else 
      if (quadratic_equation == 0) {
         root_1 = root_2 = -b / (2 * a);
        System.out.format("root_1 = root_2 = %.2f;", root_1);
      }
      else {
         real_number = -b / (2 * a);
         imaginary_number = Math.sqrt(-quadratic_equation) / (2 * a);
         System.out.println("The roots of the quadratic equation are");
         System.out.printf("root_1 = %.2f+%.2fi", real_number, imaginary_number);
         System.out.printf("\nroot_2 = %.2f-%.2fi", real_number, imaginary_number);
      }
   }
}