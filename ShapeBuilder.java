/*
-------------------------------------------------
Question - Given an oddNumber, print a rhombus with stars. For example if oddNumber is 5
  *
 ***
*****
 ***
  *
  
Approach - print an upper triangle, lower triangle and then combine them to create rhombus

Author - Neerad Kumar G
---------------------------------------------------  
*/
class ShapeBuilder{
	static void printLowerTriangleGivenAnOddNumber(int oddNumber, int offset){
		int lineNumber;
		for(lineNumber=0;(oddNumber-2*lineNumber)>0;lineNumber++){
			printSpaces(lineNumber+offset);
			printStars(oddNumber-2*lineNumber);
			System.out.println("");
		}
	}
	static void printRhombusGivenAnOddNumber(int oddNumber){
		printUpperTriangleGivenOddNumber(oddNumber);
		printLowerTriangleGivenAnOddNumber(oddNumber-2,1);
	}
	
	static void printUpperTriangleGivenOddNumber(int oddNumber){
		int lineNumber;
		for(lineNumber=0;(2*lineNumber+1)<=oddNumber;lineNumber++){
			int numberOfSpaces = (oddNumber-(2*lineNumber+1))/2;
			printSpaces(numberOfSpaces);
			int numberOfStars = 2*lineNumber+1;
			printStars(numberOfStars);
			System.out.println("");
		}
	}

	static void printStars(int number){
		int i;
		for(i=0;i<number;i++){
			System.out.print("*");
		}
	}
	static void printSpaces(int number){
		int i;
		for(i=0;i<number;i++){
			System.out.print(" ");
		}
	}
	
	public static void main(String[] args){
		System.out.println("");
		System.out.println("Lower Triangle");
		System.out.println("");
		printLowerTriangleGivenAnOddNumber(9,0);
		System.out.println("");
		
		System.out.println("Upper Triangle");
		System.out.println("");
		printUpperTriangleGivenOddNumber(9);
		System.out.println("");
		
		System.out.println("Rhombus");
		System.out.println("");
		printRhombusGivenAnOddNumber(9);
	}
}