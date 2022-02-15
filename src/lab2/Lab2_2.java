package lab2;

import java.util.Arrays;

public class Lab2_2 {
	public String[] sortStrings(String[] arr) {
		for (int i = 0; i < arr.length; i++)
			arr[i] = arr[i].toLowerCase();
		Arrays.sort(arr);
		
		for (int i = 0; i < (arr.length / 2) + (arr.length & 1); i++)  // "(arr.length & 1)" == 1 if arr.lenght is odd
			arr[i] = arr[i].toUpperCase();
		
		return arr;
	}
}