package stack;
/**
 * This implementation has been done using array list.
 */

public class CustomStack {
	
	int height;
	int top =0;
	Object array[];
	
	public CustomStack(int size) {
		array = new Object[size];
		height = size;
	}
	
	public void push(Object data){
		
		if(top == height-1){
			System.out.println("Stack Overfow !!!");
		}
		
		else{
		array[++top] = data;
		}
	}
	
	public Object pop(){
		return array[top--];
	}
	
	public Object peek(){
		return array[top];
	}
}

