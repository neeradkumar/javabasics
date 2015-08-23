/*
Question - Implement an integer queue using java ArrayList
			Queue should have the following functions and follow FIFO (First In First Out)
	Functions - void enqueue(int a)
			  - int dequeue()
			  - boolean isEmpty()
Author - Neerad Kumar G
*/
import java.util.ArrayList;
class QueueUsingList{
	private ArrayList<Integer> data = new ArrayList<>();
	void enqueue(int a){
		data.add(a);
	}
	int dequeue(){
		int temp = data.get(0);
		data.remove(0);
		return temp;
	}
	boolean isEmpty(){
		return (data.size() == 0);
	}
	
	public static void main(String[] args){
		int i;
		QueueUsingList queue = new QueueUsingList();
		//Enqueing integers from 1 to 5
		for(i=1;i<=5;i++){
			System.out.println("Enqueing to queue - "+i);
			queue.enqueue(i);
		}
		
		System.out.println("");
		System.out.println("Popping now.. They should come in the same order");
		System.out.println("");
		//Dequeue elements till queue is empty
		while(!queue.isEmpty()){
			int firstInElement = queue.dequeue();
			System.out.println("Dequeue element from queue - "+firstInElement);
		}
	}
}