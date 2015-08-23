/*
-------------------------------------------------
Question - Design a class Pen which has same properties and functions as a real world pen
  
Approach - self explainatory

Author - Neerad Kumar G
---------------------------------------------------  
*/

class Pen{
	String name;
	String colorOfPen;
	float lengthInCms;
	float inkLevelinMl;
	float maxInkLevel;
	
	void setValues(String name, String colorOfPen, float lengthInCms, 
					float inkLevelinMl, float maxInkLevel){
		this.name = name;
		this.colorOfPen = colorOfPen;
		this.lengthInCms = lengthInCms;
		this.inkLevelinMl = inkLevelinMl;
		this.maxInkLevel = maxInkLevel;
	}
	float getInkLevel(){
		return inkLevelinMl;
	}
	void refillInk(float givenInk){
		if(givenInk + inkLevelinMl > maxInkLevel){
			System.out.println("Overflowed");
			inkLevelinMl = maxInkLevel;
		}
		else{
			inkLevelinMl += givenInk;
		}
	}
	void changeColorOfPen(String newColor){
		colorOfPen = newColor;
	}
	
	public static void main(String[] args){
		// Create a pen object and setValues
		// setMaxInkLevel as 10ml and current inkLevel as 5ml
		Pen pen = new Pen();
		pen.setValues("MyPen", "blue", 10, 5, 10);
		System.out.println("Max inkLevel is "+pen.maxInkLevel+" ml");
		System.out.println("Current ink level is "+pen.getInkLevel()+" ml");
		
		//Add 3ml ink
		System.out.println("Adding 3 ml of ink...");
		pen.refillInk(3);
		System.out.println("Current ink level is "+pen.getInkLevel()+" ml");
		
		//Add 3ml ink
		System.out.println("Adding 3 ml of ink...");
		pen.refillInk(3);
		System.out.println("Current ink level is "+pen.getInkLevel()+" ml");
		
		//Add 3ml ink
		System.out.println("Adding 3 ml of ink...");
		pen.refillInk(3);
		System.out.println("Current ink level is "+pen.getInkLevel()+" ml");
		
		
	}
}