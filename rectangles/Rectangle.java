/*
Question - Implement a class Rectangle with the following:

Name - Rectangle
Properties - float length
			 float width 
			 String name
Functions - void setValues(float length, float width, String name)
			float getArea()
			float getPerimiter()
			boolean isSquare
			
Author - Neerad Kumar G
*/
class Rectangle{
	protected float length;
	protected float width;
	public String name;
	
	void setValues(float a, float b, String c){
		this.length = a;
		this.width = b;
		this.name = c;
	}
	float getArea(){
		return length*width;
	}
	float getPerimiter(){
		return 2*(length+width);
	}
	boolean isSquare(){
		if(length==width) return true;
		else return false;
	}
	
	public static void main(String[] args){
		int a;
		Rectangle rect;
		rect = new Rectangle();
		rect.setValues(10,20,"myRect");
		
		System.out.println("Area of rect "+rect.name+" is "+rect.getArea());
		
		boolean isSquare = rect.isSquare();
		if(isSquare){
			System.out.println("Rect is a square!");		
		}
		else{	
			System.out.println("Rect is not a square!");
		}
	}
}