package lab5;

public class Employee {
	private String firstName;
	private String lastName;
	private int salary;

	public Employee(String firstName, String lastName, int salary) {
		if ((firstName.length() == 0) && (lastName.length() == 0))
			throw new NoNameException("First name and last name must not be empty");

		if (salary < 3000)
			throw new EmployeeException("Salary can't be less than 3000");

		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary + "]";
	}

}
