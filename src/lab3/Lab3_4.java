package lab3;

public class Lab3_4 {
	public int modifyNumber(int num) {
		String numStr = String.valueOf(num);
		StringBuffer newNumStr = new StringBuffer();
		
		int n = numStr.length(), digit;
		
		newNumStr.append(numStr.charAt(n - 1));
		
		for (int i = n - 2; i >= 0; i--) {
			digit = Math.abs(numStr.charAt(i) - numStr.charAt(i + 1));
			newNumStr.append(digit);
		}
		
		newNumStr = newNumStr.reverse();
		
		return Integer.parseInt(newNumStr.toString());
	}
}
