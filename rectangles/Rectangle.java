class Rectangle{
	protected float length;
	float width;
	private String name;
	
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
		Rectangle rect1;
		rect1 = new Rectangle();
		rect.setValues(10,20,"rect");
		float area = rect.getArea();
		System.out.println("Area of rect is "+area);
		boolean isSquare = rect.isSquare();
		if(isSquare){
			System.out.println("Rect is a square!");
		}
		else{
			System.out.println("Rect is not a square!");
		}
	}
	
	
	
}