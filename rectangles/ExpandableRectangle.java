class ExpandableRectangle extends Rectangle{
	void enlarge(float timesToEnlarge){
		length = timesToEnlarge*length;
		width = timesToEnlarge*width;
	}
	
	@Override
	public float getArea(){
		return length*length;
	}
}