package lab6;

import java.util.ArrayList;
import java.util.Comparator;

public class Lab6_7 {
	/**
	 * getSorted takes an integer array, reverses each integer init, sorts the resulting array and returns it
	 * @param arr
	 * @return 
	 */
	public int[] getSorted(int[] arr) {
		// define an arraylist
		ArrayList<Integer> lstIntegers = new ArrayList<Integer>();

		// Iterate over each element in the list, reverse it and add it to the arraylist
		for (int ele : arr) {
			int newEle = reverseNumber(ele);
			lstIntegers.add(newEle);
		}

		// use built-in sort method of arraylist (should provide a comparator)
		lstIntegers.sort(Comparator.naturalOrder());

		// Convert the arraylist to stream, map each element to an integer and convert
		// the stream into an array and return it.
		return lstIntegers.stream().mapToInt(i -> i).toArray();
	}

	/**
	 * reverseNumber takes a interger reverses it (Eg: 12 -> 21)
	 * 
	 * @param num
	 * @return the number after reversing it
	 */
	private int reverseNumber(int num) {
		int revNum = 0;

		while (num > 0) {
			// Get the last digit and add it to the previous number
			revNum = (revNum * 10) + (num % 10);
			num /= 10;
		}

		return revNum;
	}
}
