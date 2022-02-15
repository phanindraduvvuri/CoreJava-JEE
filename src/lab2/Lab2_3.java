package lab2;

import java.util.Arrays;

public class Lab2_3 {
	public int[] getSorted(int[] arr) {
		for (int i = 0; i < arr.length; i++) 
			arr[i] = reverse(arr[i]);
		
		Arrays.sort(arr);
		
		return arr;
	}

	private int reverse(int ele) {
		int revNum = 0;

		while (ele > 0) {
			revNum = revNum * 10 + (ele % 10);
			ele /= 10;
		}
		
		return revNum;
	}
}