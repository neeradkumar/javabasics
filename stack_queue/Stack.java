class Stack{
	private int[] data = new int[100];
	private int size = 0;
	public void push(int a){
		data[size] = a;
		size++;
	}
	public int pop(){
		int temp = data[size-1];
		size--;
		return temp;
	}
	public boolean isEmpty(){
		return (size==0);
	}
}