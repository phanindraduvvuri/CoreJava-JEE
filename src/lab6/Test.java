package lab6;

import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		Lab6_6 obj = new Lab6_6();
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "2001-06-01");
		map.put(2, "2016-02-01");
		
		System.out.println(obj.votersList(map));
	}

}
