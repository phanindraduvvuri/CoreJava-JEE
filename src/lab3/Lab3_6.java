package lab3;

public class Lab3_6 {
	public boolean isPositiveString(String str) {
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) < str.charAt(i - 1))
				return false;
		}
		
		return true;
	}
}
