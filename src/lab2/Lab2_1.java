package lab2;

import java.util.Arrays;

public class Lab2_1 {
	public int getSecondSmallest(int[] arr) {
		Arrays.sort(arr);
		
		return arr[1];
	}
}
