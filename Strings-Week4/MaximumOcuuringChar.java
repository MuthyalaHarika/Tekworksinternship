import java.util.*;
class MaximumOccuringChar 
{
  public static void main(String[] args)
  {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int[] freq = new int[256]; // frequency array to store count of characters
        for (int i = 0; i < input.length(); i++) 
        {
            char ch = input.charAt(i);
            freq[ch]++;
        }

        int maximumCount = 0;
        char maximumChar = ' ';
        for (int i = 0; i < 200; i++) 
        {
            if (freq[i] > maximumCount) 
            {
                maximumCount = freq[i];
                maximumChar = (char) i;
            }
        }

        System.out.println("The maximum occurring character in the given string is '" + maxChar + "' with a frequency of " + maxCount);
    }
}
