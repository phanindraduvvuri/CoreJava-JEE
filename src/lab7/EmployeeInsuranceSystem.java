package lab7;

import java.util.Map;
import java.util.Scanner;

public class EmployeeInsuranceSystem {
	static Services services = new Services();
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		/*
		 * Employee emp1 = new Employee(100, "Phanindra", 50_000, "Manager",
		 * "Scheme A"); Employee emp2 = new Employee(101, "Ravi", 19_000,
		 * "System Associate", "Scheme C"); Employee emp3 = new Employee(102, "John",
		 * 23_000, "Programmer", "Scheme B"); Employee emp4 = new Employee(103, "Sylu",
		 * 42_000, "Manager", "Scheme A"); Employee emp5 = new Employee(104, "Tony",
		 * 4_500, "Clerk", "No Scheme"); Employee emp6 = new Employee(105, "Banner",
		 * 32_000, "Prgrammer", "Scheme B");
		 * 
		 * services.addEmployee(emp1); services.addEmployee(emp2);
		 * services.addEmployee(emp3); services.addEmployee(emp4);
		 * services.addEmployee(emp5); services.addEmployee(emp6);
		 */

		System.out.println("Welcome to Employee Insurance Management System");
		while (true) {
			System.out.println("Enter 1 to add an employee");
			System.out.println("Enter 2 to remove to  an employee");
			System.out.println("Enter 3 to get all the employees from an insurance scheme");
			System.out.println("Enter 4 to quit");
			System.out.print("Enter your option: ");

			int option = input.nextInt();

			switch (option) {
			case 1:
				addEmployee();
				break;
			case 2:
				removeEmployee();
				break;
			case 3:
				getDetails();
				break;
			case 4:
				System.exit(0);

			default:
				System.out.println("Enter a valid option");
				break;
			}
			System.out.println("\n\n\n");
		}
	}

	private static void removeEmployee() {
		System.out.println("Which employee you want to remove ");
		if (services.getAllEmployees().isEmpty())
			System.out.println("No employees in database");
		for (Map.Entry<Integer, Employee> pair : services.getAllEmployees().entrySet()) {
			System.out.printf("%d : %s\n", pair.getKey(), pair.getValue().getName());
		}

		System.out.print("Enter your option: ");
		int option = input.nextInt();

		try {
			services.removeEmployee(services.getEmployeeById(option));

		} catch (NoEmployeeException e) {
			System.out.println("ERROR: " + e.getMessage());
		}
	}

	private static void getDetails() {
		System.out.println("Available insurance schemes ");
		System.out.println("1: No Scheme");
		System.out.println("2: Scheme A");
		System.out.println("3: Scheme B");
		System.out.println("4: Scheme C");
		System.out.print("Enter insurance scheme (number): ");
		int scheme = input.nextInt();
		String schemeString;

		switch (scheme) {
		case 1:
			schemeString = "No Scheme";
			break;
		case 2:
			schemeString = "Scheme A";
			break;
		case 3:
			schemeString = "Scheme B";
			break;
		case 4:
			schemeString = "Scheme C";

		default:
			schemeString = "";
			break;
		}

		services.getEmployees(schemeString);

	}

	private static void addEmployee() {
		System.out.println("Enter Employee details");

		System.out.print("Enter name of the employee: ");
		String name = input.next();

		System.out.print("Enter salary of the employee: ");
		int salary = input.nextInt();

		System.out.print("Enter designation of the employee: ");
		String designation = input.next();

		services.addEmployee(new Employee(name, salary, designation));

	}

}
