package lab10;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Lab10_1 {
	public void addLineNumber() {
		try (FileReader fr = new FileReader("C:\\Users\\PDUVVURI\\Desktop\\test.txt")) {
			BufferedReader bReader = new BufferedReader(fr);

			int i = 1;
			String line;
			while ((line = bReader.readLine()) != null) {
				System.out.println(i + "\t" + line);
				i++;
			}
		} catch (FileNotFoundException e) {
			System.out.println("Please make sure you entered correct path for the file and file exists");
		} catch (IOException e) {
			System.out.println("Got an error");
		}
	}
}
