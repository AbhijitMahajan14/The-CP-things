import java.util.*;
public class TypeArrayDeque {
	//we can remove element from both end of queue ie ArrayDeque
	
	public static void main(String[] args)
	{
		 ArrayDeque<Integer> ad= new ArrayDeque<>();
		 ad.offer(12);
		 ad.offerFirst(14);
		 ad.offerLast(87);
		 
		 System.out.println(ad);
		 
		 //get first elemnt and remove it
		 System.out.println(ad.pollFirst());
		 
		//get last elemnt and remove it
		 System.out.println(ad.pollLast());
		 
	}

}
