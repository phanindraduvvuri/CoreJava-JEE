package lab9;

import java.util.Scanner;

interface AuthenticateInf {
	boolean isValid(String username, String password);
}

public class Authenticate {
	
	final private static String USERNAME = "tonystart";
	final private static String PASSWORD = "iamironman";

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		AuthenticateInf authenticate = (username, password) -> (username == USERNAME) && (password == PASSWORD);
		
		System.out.println(authenticate.isValid("tonystart", "iamironman"));
		System.out.println(authenticate.isValid("brucebanner", "punygod"));
		System.out.println(authenticate.isValid("tonystark", "punygod"));
		System.out.println(authenticate.isValid("brucebanner", "iamironman"));
		
		input.close();
	}

}
