//Project Euler Problem Four
//Determine the largest palindrome product of two three digit numbers

import java.util.*; 

public class ProblemFour{
	public static void main(String args[]){
		System.out.println("PROBLEM FOUR: "); 
		int max_product = 0; 


		//need to prove this logic
		for(int i = 999; i > 900; i--){
			for(int j = 999; j > 900; j--){
				int product = i * j; 

				boolean pal = isPalindrome(Integer.toString(product)); 
				if(pal && product > max_product){
					max_product = product; 
				}
			}
		}

		System.out.println("Largest product palindrome is: " + max_product); 

	}

	//method determines if a string is a palindrome 
	public static boolean isPalindrome(String param){
		for( int i = 0; i < (param.length()/2); i++){
			if(param.charAt(i) != param.charAt(param.length() - 1 - i)){
				return false; 
			}
		}

		return true; 
	}
}
