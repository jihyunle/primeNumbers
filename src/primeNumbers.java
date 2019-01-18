/* A prime number is a number that has only itself and 1 as a factor.

This means that for each of the numbers from 2 to that number, the number cannot be divided without a remainder.

For example, 9 is not a prime number because it can be divided by 3 without a remainder.

But 7 is a prime number because it cannot be divided by 2, 3, 4, 5, or 6 without a remainder. */

import java.util.Scanner;

public class primeNumbers {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int x=0;
        boolean isPrime=true;
        System.out.println("Please enter a number: ");
        x = keyboard.nextInt();
        keyboard.close();

        System.out.println("You've entered: " + x);
        // add this statement for complete presentation
        System.out.println("1 is a non-prime number.");

        // outer loop to count the numbers 1 through user input, x
        for(int i=2; i<=x; i++){
            isPrime = true;

            // inner loop to count denominator, from 2 to x-1
            for(int j=2; j<i; j++){

                // condition to test for prime
                int remainder = i%j;
                if(remainder == 0){
                    isPrime = false;
                    break;

                }

            }

            // If isPrime is true print that the number is a prime number
            if (isPrime){
                System.out.println(i + " is a prime number.");
            }else
                System.out.println(i + " is a non-prime number.");

        }

    }
}
