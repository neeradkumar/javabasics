/*
Question - Implement a class that inherits from Rectangle class and 
			have the following additional functionality:
			
		- Define a function that enlarges the rectangle by a factor
		- void enlarge(float timesToEnlarge)
*/

class ExpandableRectangle extends Rectangle{
	void enlarge(float timesToEnlarge){
		length = timesToEnlarge*length;
		width = timesToEnlarge*width;
	}
	
	//Example of override function
	@Override
	public float getPerimiter(){
		return 2*length*width;
	}
	
	public static void main(String[] args){
		ExpandableRectangle rect = new ExpandableRectangle();
		rect.setValues(10,20,"newRect");
		System.out.println("Area of rect "+rect.name+" is "+rect.getArea());
		System.out.println("Enlarging rectangle by 2 times");
		rect.enlarge(2);
		System.out.println("Area of enlarged rect "+rect.name+" is "+rect.getArea());
	}
}