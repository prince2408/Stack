import java.util.ArrayList;
import java.util.Stack;


public class SetofStacks {

	ArrayList<Stack> stacks = new ArrayList<Stack>();

	public static void main(String[] args) {
		
	}
	
	public void push(Object obj){
		Stack last = getlastStack();
		if(!last.isEmpty()){
			last.push(obj);
		}
		else{
			Stack<Object> stack = new Stack<Object>();
			stack.push(obj);
			stacks.add(stack);
		}
	}
	
	public Object pop(){
		Stack last = getlastStack();
		Object v = last.pop();
		if(last.isEmpty())
			stacks.remove(stacks.size()-1);
		return v;
		}
	
	public Stack getlastStack(){

		if(stacks.size() == 0)
			return null;
		return stacks.get(stacks.size()-1);
}
}
