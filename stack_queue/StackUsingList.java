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
		return (data.size() == 0)
	}
}