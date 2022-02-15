package lab1;

public class Lab1_1 {
	public int calculateSum(int n) {
		int sum = 0;

		int i = 1;
		while (n > 0) {
			if ((i % 3 == 0) || (i % 5 == 0)) {
				sum += i;
				n--;
			}

			i++;

		}

		return sum;
	}
}
