package string;

import java.util.ArrayList;

public class Example1 {

	public static void main(String[] args) {
		ArrayList<Integer>List=new ArrayList<Integer>();
		List.add(10);
		List.add(20);
		List.add(50);
		List.add(76);
		ArrayList<Integer>List1=new ArrayList<Integer>();
		List1.addAll(List);
		List1.add(32);
		List1.add(43);
		List1.add(65);
		System.out.println(List1);
		int value=List.get(3);
		System.out.println(value);
		List1.set(2, 33);
		System.out.println(List1);
		List1.add(2,55);
		System.out.println(List1);
		List1.remove(2);
		System.out.println(List1);
		System.out.println(List.contains(76));
		List.retainAll(List1);
		System.out.println(List);
		
		
		
		
		
		
		
	}

}
