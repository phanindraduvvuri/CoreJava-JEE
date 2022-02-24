package lab6;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lab6_5 {
	public int getSecondSmallest(int[] nums) {
		List<Integer> lst = Arrays.stream(nums).boxed().collect(Collectors.toList());

		lst.sort(Comparator.naturalOrder());

		return lst.get(1);
	}
}
