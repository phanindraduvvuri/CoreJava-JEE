package lab3;

import java.util.Scanner;

public class Lab3_5 {
	public void processText() {
		Scanner input = new Scanner(System.in);
		int lines = 0, words = 0, characters = 0;

		while (input.hasNextLine()) {
			String line = input.nextLine();
			if (line.length() == 0)
				break;
			
			words += line.split("\\s+").length;
			characters += line.length();
			lines++;
		}

		System.out.printf("Lines: %d\nWords: %d\nCharacters: %d\n", lines, words, characters);

		input.close();
	}
}
