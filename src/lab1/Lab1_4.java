package lab1;

public class Lab1_4 {
	public boolean checkNumber(int n) {
		if (n == 0)
			return false;

		return Math.ceil(this.log2(n)) == Math.floor(this.log2(n));
	}

	private double log2(int n) {
		return (Math.log(n) / Math.log(2));
	}
}
