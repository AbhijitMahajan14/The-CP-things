import java.util.*;
public class TypePriorityQueue {

	public static void main(String[] args)
	{
		Queue<Integer> pq=new PriorityQueue<>();
		pq.offer(34);
		pq.offer(12);
		pq.offer(3);
		pq.offer(344);
		
		//by default it is mean heap
		
		System.out.println(pq);
		
		//remove element which has highest priority ie 3
		pq.poll();
		System.out.println(pq);
		
		//top
		System.out.println(pq.peek());
		
		
		//Max Heap
		Queue<Integer> maxHeap=new PriorityQueue<>(Comparator.reverseOrder());

	}
}
