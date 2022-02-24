package lab6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class Lab6_1 {
	public List<Integer> getValues(Map<String, Integer> countryToPop) {
		List<Integer> lst = new ArrayList<>();

		for (int pop : countryToPop.values())
			lst.add(pop);

		lst.sort(Comparator.naturalOrder());

		return lst;

//		return countryToPop.values()
//				.stream()
//				.sorted()
//				.collect(Collectors.toList());
	}
}
