package lab6;

import java.util.HashMap;
import java.util.Map;

public class Lab6_4 {
	public Map<Integer, String> getStudents(Map<Integer, Integer> students) {
		Map<Integer, String> studentMedals = new HashMap<>();
		
		for (Map.Entry<Integer, Integer> pair: students.entrySet())
			studentMedals.put(pair.getKey(), getMedal(pair.getValue()));

		return studentMedals;
	}

	private String getMedal(int marks) {
		if (marks >= 90)
			return "Gold";
		else if (marks < 90 && marks >= 80)
			return "Silver";
		else if (marks < 80 && marks >= 70)
			return "Bronze";
		return "No Medal";
	}
}
