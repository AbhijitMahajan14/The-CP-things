package com.phoenix.demos;

import java.util.HashSet;
import java.util.Set;


public class Sets {
public static void main(String[] args) {
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
	
	for(Integer s:S)
	{
		System.out.println(s);
	}
	
}
}
