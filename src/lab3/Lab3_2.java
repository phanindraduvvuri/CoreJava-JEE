package lab3;

public class Lab3_2 {
	public String getImage(String str) {
		StringBuffer buff = new StringBuffer(str);

		buff = buff.reverse();

		return str.concat("|" + buff);
	}
}
