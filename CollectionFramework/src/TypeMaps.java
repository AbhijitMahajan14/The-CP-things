import java.util.*;
//map store key value pairs
public class TypeMaps {

	public static void main(String[]args)
	{
		//hashMap
		Map<String,Integer> numbers =new HashMap<>();
		numbers.put("One",1);
		numbers.put("One",2);
		numbers.put("Three",1);
		numbers.put("Four",4);
		
		System.out.println(numbers);
		
		//key shoud be unique
		
		if(!numbers.containsKey("five")) {
			numbers.put("five",5);
		}
		
		//or
		
		numbers.putIfAbsent("Six",6);
		System.out.println(numbers);
		
		//iterate through map
		System.out.println("iterate on pairs");
		for(Map.Entry<String,Integer> e:numbers.entrySet())
		{
			System.out.println(e);
			//System.out.println(e.getKey();
			//System.out.println(e.getValue();
		}
		
		//get only keys
		System.out.println("iterate on keys");
		
		for(String key: numbers.keySet())
		{
			System.out.println(key);
		}
		
		//get only values
		System.out.println("iterate on values");
		for(Integer key: numbers.values())
		{
			System.out.println(key);
		}
		
		//check empty
		System.out.println(numbers.isEmpty());
		
		//clear map
		numbers.clear();
	}
}
