package lab10;

import java.io.File;
import java.util.Scanner;

public class Lab10_2 {
	public void fileInfo() {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the full path of the file: ");
		String filePath = input.nextLine();
		input.close();

		File file = new File(filePath);

		System.out.println("-----------------------------------------------");
		if (!file.exists()) {
			System.out.println("Your file doesnot exist");
			return;
		}

		System.out.println(file.getName() + " exists");
		System.out.println(file.getName() + (file.canRead()? " is readable": " is not readable"));
		System.out.println(file.getName() + (file.canWrite()? " is writable": " is not writable"));
		System.out.println("Size of " + file.getName() + " is " + file.length() + " bytes");
	}
}
