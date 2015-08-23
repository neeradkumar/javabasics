class RectangleBuilder{
	public static void main(String[] args){
		ExpandableRectangle rect = new ExpandableRectangle();
		rect.setValues(10,20,"adf");
		System.out.println("Area of rect is "+rect.getArea());
		rect.enlarge(2);
		System.out.println("Area of expanded rect is "+rect.getArea());
	}
}