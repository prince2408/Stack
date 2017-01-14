package stack;

/**
 * This has been done by using a separate stack for min value.
 */
import java.util.Stack;

public class FindMinimum extends Stack<Integer> {

	int min = Integer.MAX_VALUE;
	private static final long serialVersionUID = 1L;
	Stack<Integer> s2 = new Stack<Integer>();
	Stack<Integer> s3 = new Stack<Integer>();
	
	public static void main(String []args){
		FindMinimum stack = new FindMinimum();
		stack.push(5);
		stack.push(2);
		stack.push(4);
		stack.push(1);
		stack.pop();
	
		
		System.out.println(" min : "+stack.min());
	}
	public void push(int data){
		if(data < min){
			min = data;
			s2.push(data);
		}
		super.push(data);
	}
	
	public Integer pop(){
		int value = super.pop();
		if(s2.peek() == value){
			s2.pop();
		}
		return value;
	}
	
	public int min(){
		if(s2.isEmpty()){
			return min;
		}
		else{
			return s2.peek();
		}
	}
}
