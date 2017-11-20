import java.util.*;

//PROBLEM DESCRIPTION
/* "The prime factors of 13195 are 5, 7, 13, and 29. 
*	 What is the largest prime factor of 
*	 600851475143?
*/

public class ProblemThree {
		public static void main(String args[]){
			System.out.println("PROBLEM 3: "); 

			Scanner input = new Scanner(System.in); 
			long number; 
			System.out.print("Enter a number: "); 
			number = input.nextLong(); 
			System.out.println(); 

			int divisor_store = 2; 
			int largest_divisor_store = 1; 

			while( number != 1 ){
				if( number % divisor_store == 0){
					number = number/divisor_store; 
					if( divisor_store > largest_divisor_store){
						largest_divisor_store = divisor_store; 
					}
					divisor_store = 2; 
				}
				else{
					divisor_store++; 	
				}
			} 
	
			System.out.println("The largest prime factor of "+ number + " is: " + largest_divisor_store); 
			
			
		}
}
