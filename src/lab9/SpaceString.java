package lab9;

import java.util.Scanner;

interface FormatString {
	String addSpace(String str);
}

public class SpaceString {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		FormatString formatString = (str) -> {
			StringBuffer stringBuffer = new StringBuffer();
			for (char ch : str.toCharArray()) {
				if (Character.isAlphabetic(ch))
					stringBuffer.append(ch + " ");
			}

			return stringBuffer.toString();
		};

		System.out.println(formatString.addSpace(input.next()));

		input.close();
	}

}
