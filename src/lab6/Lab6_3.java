package lab6;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lab6_3 {
	public Map<Integer, Integer> getSquares(List<Integer> lst) {
		Map<Integer, Integer> result = new HashMap<>();
		for (int ele : lst) {
			result.put(ele, ele * ele);
		}

		return result;
	}
}
