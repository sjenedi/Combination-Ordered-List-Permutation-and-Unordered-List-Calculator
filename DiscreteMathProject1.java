/*
 *  @ author Sami Jenedi
 */

import java.util.Scanner;

public class DiscreteMathProject1 {
  
  public static void main(String[] args) {
    
  Scanner input = new Scanner(System.in);

  // Prompt user for numbers
  System.out.print("Please enter the first positive integer: ");
  int number1 = input.nextInt(); 
  System.out.print("Please enter the second positive integer: ");
  int number2 = input.nextInt(); 
  
  // Declare formulas
  int permutation = Factorial(number1) / Factorial((number1 - number2)); 
  int orderedList = (int) Math.pow(number1, number2);
  int combination = Factorial(number1) / ( Factorial(number2) * Factorial((number1 - number2))); 
  int unOrderedList = Combination(number1 + number2 - 1, number2);
  
  // Output the results
  System.out.println("Permutation: " + permutation);
  System.out.println("Ordered List: " + orderedList);
  System.out.println("Combination: " + combination);
  System.out.println("Unordered List: " + unOrderedList);
  }
  
  public static int Factorial(int n)
  {
     if ( n == 0 )
        return 1;
     
     else 
       return n * ( Factorial(n-1) ); 
  }
  
  public static int Combination(int a, int b)
  {      
       return ( Factorial(a) / ( Factorial(b) * Factorial((a - b))) );   
  }

} 