import java.util.*;
public class TypeCollectionClass {
	public static void main(String[]args)
	{
		//collection class for small functions
		
		List<Integer>l=new ArrayList<>();
		l.add(2);
		l.add(8);
		l.add(1);
		l.add(10);
		l.add(9);
		l.add(9);
		l.add(9);
		
		System.out.println("max in list :"+Collections.max(l));
		//min is same
		System.out.println("min in list :"+Collections.min(l));
		
		//frequancy of 9
		System.out.println("count of 9 in list :"+Collections.frequency(l,9));
	
		Collections.sort(l);
		System.out.println("Sorted :"+l);
		
		Collections.sort(l,Comparator.reverseOrder());
		System.out.println("Sorted desc:"+l);
		
		
	}

}
