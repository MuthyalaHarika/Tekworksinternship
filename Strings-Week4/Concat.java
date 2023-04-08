import java.util.Scanner;
 class Concat
   {
    public static void main(String[] args)
     {
        Scanner string = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String String1 = string.nextLine();
        System.out.print("Enter the second string to concatenate: ");
        String String2 = string.nextLine();
       String string3 = String1.concat(String2);
     System.out.println("The concatenated string is: " + string3);
    }
}