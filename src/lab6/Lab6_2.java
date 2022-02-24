package lab6;

import java.util.HashMap;
import java.util.Map;

public class Lab6_2 {
	public Map<Character, Integer> countChars(char[] arr) {
		Map<Character, Integer> charToCount = new HashMap<>();
		for (char c : arr) {
			charToCount.put(c, charToCount.getOrDefault(c, 0) + 1);
		}

		return charToCount;
	}
}
