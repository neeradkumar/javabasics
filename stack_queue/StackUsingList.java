/*
Question - Implement an integer stack using java ArrayList
			Stack should have the following functions and follow LIFO (Last In First Out)
	Functions - void push(int a)
			  - int pop()
			  - boolean isEmpty()
Author - Neerad Kumar G
*/			


import java.util.ArrayList;
class StackUsingList{
	private ArrayList<Integer> data = new ArrayList<>();
	void push(int a){
		data.add(a);
	}
	int pop(){
		int size = data.size();
		int temp = data.get(size-1);
		data.remove(size-1);
		return temp;
	}
	boolean isEmpty(){
		return (data.size() == 0);
	}
	
	public static void main(String[] args){
		int i;
		StackUsingList stack = new StackUsingList();
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