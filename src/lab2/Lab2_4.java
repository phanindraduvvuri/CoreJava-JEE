package lab2;

import java.util.ArrayList;
import java.util.Arrays;

public class Lab2_4 {
	public Object[] modifyArray(int[] arr) {
		sort(arr);
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != arr[i + 1])
				list.add(arr[i]);
		}
		list.add(arr[arr.length - 1]);

		
		return list.toArray();
	}
	
	private void sort(int[] arr) {
		Arrays.sort(arr);
		
		reverse(arr);
	}
	
	private void reverse(int[] arr) {
		for (int i = 0; i < (arr.length / 2); i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length - i - 1];
			arr[arr.length - i - 1] = temp;
		}
	}
}