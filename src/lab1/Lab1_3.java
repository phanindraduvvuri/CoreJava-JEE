package lab1;

public class Lab1_3 {
	public boolean checkNumber(int n) {
		int currentDigit = n % 10;
		n /= 10;

		while (n > 0) {
			if (currentDigit < (n % 10))
				return false;

			currentDigit = n % 10;
			n /= 10;
		}

		return true;
	}
}
