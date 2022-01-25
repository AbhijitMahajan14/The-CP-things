import java.util.*;
public class TypeTreeMap {
//treeMap : sorted map on basis of keys
	public static void main(String[]args)
	{
		Map<Integer,String> myNum= new TreeMap<>();
		myNum.put(1,"One");
		myNum.put(6,"Six");
		myNum.put(3,"Three");
		myNum.put(2,"Two");
		
		System.out.println(myNum);
		//remove element
		myNum.remove(6);
		System.out.println(myNum);
	}
	
}
