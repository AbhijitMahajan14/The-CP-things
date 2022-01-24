import java.util.*;
public class TypeStack {
	public static void main(String args[]) {
	Stack<Integer> S = new Stack<>();
	S.push(1);
	S.push(2);
	S.push(3);
	
	System.out.println(S);
	
	System.out.println("Stack Top is "+S.peek());
	
	//remove peek
	
	S.pop();
	System.out.println("Stack Top is "+S.peek());
}
}
