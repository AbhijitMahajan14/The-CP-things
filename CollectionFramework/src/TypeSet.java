import java.util.*;

//hashSet :No duplecats,unordered
public class TypeSet {
	public static void main(String[] args)
	{
		Set<Integer> S=new HashSet<>();
		S.add(1);
		S.add(1);
		S.add(3);
		S.add(6);
		S.add(45);
		S.add(2);
		
		System.out.println(S);
		
		//remove
		S.remove(3);//3 is element it is not index
		
		//contain
		System.out.println(S.contains(23));
		
		//is empty
		System.out.println(S.isEmpty());
		
		
		//size of set
		System.out.println(S.size());
		
		//clear whole set
		S.clear();
		
		
		//Linked HashSet :no dup  but allow ordering 
		Set<Integer> S2=new LinkedHashSet<>();
		S2.add(1);
		S2.add(1);
		S2.add(3);
		S2.add(6);
		S2.add(45);
		S2.add(2);
		
		System.out.println(S2);
		
		
		//TreeSet :no dup  but allow ordering(it use BST so we will get sorted ordering)
				Set<Integer> S3=new TreeSet<>();
				S3.add(1);
				S3.add(1);
				S3.add(3);
				S3.add(6);
				S3.add(45);
				S3.add(2);
				
				System.out.println(S3);
		
		
	}

}
