package lab5;

public class Test {
	public static void main(String[] args) {
		Employee e;

		try {
			e = new Employee("Phanindra", "Duvvuri", 400);

			System.out.println(e);
		} catch (NoNameException exp1) {
			exp1.printStackTrace();
		} catch (EmployeeException exp2) {
			System.out.println("ERROR: Employee salary can't be less than 3000");
		}
	}
}
