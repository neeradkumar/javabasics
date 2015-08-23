/*
Question - Implement an integer stack using arrays with a maximum size of 100
			Stack should have the following functions and follow LIFO (Last In First Out)
	Functions - void push(int a)
			  - int pop()
			  - boolean isEmpty()
			
Author - Neerad Kumar G
*/

class Stack{
	private int[] data = new int[100];
	public int size = 0;
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
	
	public static void main(String[] args){
		int i;
		Stack stack = new Stack();
		//push integers from 1 to 5
		for(i=1;i<=5;i++){
			System.out.println("Pushing into stack - "+i);
			stack.push(i);
		}
		
		System.out.println("");
		System.out.println("Popping now.. They should come in reverse order");
		System.out.println("");
		//pop elements till stack is empty
		while(!stack.isEmpty()){
			int topElement = stack.pop();
			System.out.println("Popping element from stack - "+topElement);
		}
	}
}