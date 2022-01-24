
//ArrayList
import java.util.*;
public class TypesList {
	public static void main(String args[])
	{
		List<Integer>l=new ArrayList<>();
		l.add(20);
		l.add(20);
		l.add(20);
		l.add(20);
		
		List<Integer>l1 =new ArrayList<>();
		l1.add(40);
		l1.add(23);
		
		//append l1 to l
		
		l.addAll(l1);
		
		//remove from list
		
		l.remove(0);
		
		//set or update element
		
		l.set(2,33);
		
		//check list contain element or not
		System.out.println(l.contains(20));
		
		
		for(int i=0;i<l.size();i++)
		{
			System.out.println(l.get(i));
		}
		//iterator on list		
		System.out.println("Access using Iterator:");
		Iterator<Integer> it = l.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
	
	

	
	
}
