package string;

import java.util.ArrayList;

public class Classexercise {

	public static void main(String[] args) {

		ArrayList<Integer> List = new ArrayList<Integer>();
        int[] arr = { 3, 5, 8, -1, 0, 2, 9, 3, 8, 12 };
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < arr[i + 1]) {
				List.add(arr[i]);
			} else{
				List.add(arr[i]);

			System.out.println(List);
			List.clear();
			}
		}
	}
}
