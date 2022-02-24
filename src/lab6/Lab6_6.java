package lab6;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Lab6_6 {
	public List<Integer> votersList(Map<Integer, String> votersMap) {
		List<Integer> votersList = new ArrayList<Integer>();

		for (Map.Entry<Integer, String> pair : votersMap.entrySet()) {
			int id = pair.getKey();
			String yearString = pair.getValue();

			int yearInt = getYear(yearString);

			if (2022 - yearInt >= 18)
				votersList.add(id);
		}

		return votersList;
	}

	private int getYear(String dateString) {
		// DateString format 'YYYY-MM-DD'
		String[] dateArray = dateString.split("-");

		return Integer.parseInt(dateArray[0]);

	}
}
