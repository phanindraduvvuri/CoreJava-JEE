package lab9;

import java.util.Scanner;

interface MathFunction2 {
	long factorial(int num);
}

public class LambdaFactorial {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		MathFunction2 mathFunction2 = (num) -> {
			int fact = 1;
			
			for (int i = 1; i <= num; i++) {
				fact *= i;
			}
			
			return fact;
		};
		
		System.out.println(mathFunction2.factorial(input.nextInt()));
		
		input.close();
	}

}
