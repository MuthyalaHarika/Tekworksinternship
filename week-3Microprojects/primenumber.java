import java.util.*;
class primenumber
 {
 public static void main(String[] args) 
   {
         int numberOfPrimes = 100; 
        int count = 0;
        int number = 2; 
        
        ArrayList<Integer> primes = new ArrayList<Integer>();
        
        while (count < numberOfPrimes) 
        {
            if (isPrime(number)) 
            {
                primes.add(number);
                count++;
            }
            number++;
        }
        
        System.out.println("The first " + numberOfPrimes + " prime numbers are:");
        for (int prime : primes) 
        {
            System.out.print(prime + " ");
        }
    }
    
    public static boolean isPrime(int number) 
   {
        if (number < 2) 
        {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(number); i++) 
        {
            if (number % i == 0) {
                return false;
            }
        }
        
        return true;
    }

}