package lab9;

import java.util.Scanner;

interface MathFunction {
	long power(int x, int y);
}

public class LambdaPower {
	public static void main(String[] args) {
		MathFunction mathFunction = (x, y) -> (long) Math.pow(x, y);
		Scanner input = new Scanner(System.in);
		
		int x = input.nextInt();
		int y = input.nextInt();
		
		System.out.println(mathFunction.power(x, y));
		
		input.close();
	}
}
