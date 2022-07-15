package string;

import java.util.ArrayList;

public class Array {

	public static void main(String[] args) {
		//syntax of array
	ArrayList<Integer>List=new ArrayList<Integer>();
	//to add values
	List.add(56);
	List.add(76);
	List.add(34);
	int a=10;
	List.add(a);
	System.out.println(List);
	//to retrieve a value
	int value=List.get(2);
	System.out.println(value);
	//to update
	List.set(1, 32);
	System.out.println(List);
	//to insert
	List.add(1,15);
	System.out.println(List);
	//delete
	List.remove(1);
	System.out.println(List);
	//to know the size
	System.out.println(List.size());
	//to check the value
	System.out.println(List.contains(8));
	//to copy all values from one collection to other
	List.addAll(List);
	List.add(33);
	List.add(44);
	List.add(12);
	List.add(12);
	List.add(13);
	System.out.println(List);
	
	
	
	

	}

}
