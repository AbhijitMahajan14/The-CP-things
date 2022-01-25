import java.util.*;
public class TypeArrayClass {

	public static void main(String[] args)
	{
		//arrayclass work on normal primitve arrays
		
		int[] num= {1,2,3,4,5,6,75};
		
		int index=Arrays.binarySearch(num,3);
		
		System.out.println(index);
		
		int[] num2= {2,5,2,4,1,8,6};
		Arrays.sort(num2);//uses quick sort
		
		System.out.println("\nArray after sort");
		for(int i:num2)
		{
			System.out.println(i);
		}
		
		//fill element in all positio of array
		Arrays.fill(num,12);
		System.out.println("\nArray after fill");
		for(int i:num)
		{
			System.out.println(i);
		}
		
	}
}
