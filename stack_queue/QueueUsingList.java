import java.util.ArrayList;
class QueueUsingList{
	private ArrayList<Integer> data = new ArrayList<>();
	void push(int a){
		data.add(a);
	}
	int pop(){
		int temp = data.get(0);
		data.remove(0);
		return temp;
	}
	boolean isEmpty(){
		return (data.size() == 0)
	}
}