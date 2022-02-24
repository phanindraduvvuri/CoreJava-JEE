package lab8;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileProgram {
	public static void main(String[] args) {
		FileReader fileReader = null;
		FileWriter fileWriter = null;

		// Open the files using try-reasource block (using this the resources are
		// automatically closed)
		try {
			fileReader = new FileReader("C:\\Users\\PDUVVURI\\Desktop\\source.txt");
			fileWriter = new FileWriter("C:\\Users\\PDUVVURI\\Desktop\\target.txt");
			
			System.out.println("Hello");

			// initializing the class;
			CopyDataThread obj = new CopyDataThread(fileReader, fileWriter);

			obj.start();
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
		} catch (IOException e1) {
			e1.printStackTrace();
		} 
	}
}
