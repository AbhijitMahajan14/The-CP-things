import java.util.*;
public class TypeLinkedList {

	public static void main(String[] args) {
		
		Queue<Integer> queue=new LinkedList<>();
		
		//push into queue
		queue.offer(11);
		queue.offer(12);
		queue.offer(13);
		
		System.out.println(queue);
		
		//pop and return
		System.out.println(queue.poll());
		
		System.out.println(queue);
		
		//peak: which will pop next
		System.out.println(queue.peek());     
	}
}
