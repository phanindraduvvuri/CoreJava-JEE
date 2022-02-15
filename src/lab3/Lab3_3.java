package lab3;

public class Lab3_3 {
	public String alterString(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (!isVowel(str.charAt(i))) {
				str = str.replace(str.charAt(i), (char) ((char) str.charAt(i) + 1));
			}
		}
		
		return str;
	}
	
	private boolean isVowel(char ch) {
		ch = Character.toLowerCase(ch);
		
		return (ch == 'a') || (ch == 'e') || (ch == 'i') || (ch == 'o') || (ch == 'u');
	}
}
