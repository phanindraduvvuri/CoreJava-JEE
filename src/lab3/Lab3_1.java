package lab3;

import java.util.StringTokenizer;

public class Lab3_1 {
	public void integers(String str) {

		StringTokenizer tokenizer = new StringTokenizer(str);
		
		int sum = 0;

		while (tokenizer.hasMoreTokens()) {
			int ele = Integer.parseInt(tokenizer.nextToken());
			System.out.println(ele);
			sum += ele;
		}
		
		System.out.println(sum);
	}
}
