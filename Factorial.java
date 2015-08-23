/*
-------------------------------------------------
Question - 
Approach - print an upper triangle, lower triangle and then combine them to create rhombus

Author - Neerad Kumar G
---------------------------------------------------  
*/
class Factorial{
	int factorialOfOddNumber(int x){
		int product=1;
		int i;
		for(i=1;i<=x;i++){
			if((i+1)%2==0) product=product*i;
		System.out.println("the value of odd product numbers of factorial is"+product);
		}
		return (product);
	}
	public static void main(String[] args){
		System.out.println("enter a number to print the product of odd numbers:"+y);
	
	}
}