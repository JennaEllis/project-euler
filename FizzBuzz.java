public class FizzBuzz{
	public static void main(String[] args){
		System.out.println("Results of the Fizz Buzz Test"); 
		System.out.println("Should print all numbers from 1 to 100"); 
		System.out.println("Prints fizz when the current number is divisible by 3"); 
		System.out.println("Prints buzz when the current number is divisible by 5"); 
		System.out.println("Prints fizzbuzz when the number is divisible by both 3 and 5"); 
	

		for( int i = 1; i < 101; i++){
			if(i % 3 == 0 && i % 5 == 0){
				System.out.println("FizzBuzz"); 
			}
			else if( i % 3 == 0){
				System.out.println("Fizz");
			}
			else if( i % 5 == 0){
				System.out.println("Buzz"); 
			}
			else{
				System.out.println(i); 
			}
		}
	}
}
