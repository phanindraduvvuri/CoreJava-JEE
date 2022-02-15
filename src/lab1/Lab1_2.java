package lab1;

public class Lab1_2 {
	public long calculateDifference(int n) {
		long res = 0;

		res = this.squareSum(n) - this.sumSquare(n);

		return res;
	}

	private long squareSum(int n) {
		long sum = 0;

		for (int i = 1; i <= n; i++) {
			sum += (i * i);
		}

		return sum;
	}

	private long sumSquare(int n) {
		long sum = 0;

		for (int i = 1; i <= n; i++)
			sum += i;

		return (sum * sum);
	}
}
