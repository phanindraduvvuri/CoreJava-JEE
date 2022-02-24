package lab9_case;

import java.time.LocalDate;

public class Test {

	public static void main(String[] args) {
		EmployeeRepository employeeRepository = new EmployeeRepository();

		// adding departments to the repository
		employeeRepository.addDepartment(new Department(1, "L_D", 2));
		employeeRepository.addDepartment(new Department(2, "HR", 3));
		employeeRepository.addDepartment(new Department(3, "R_D", 4));
		employeeRepository.addDepartment(new Department(4, "Dev", 5));

		// adding employees to the repo
		employeeRepository.addEmployee(new Employee(1, "Phanindra", "Duvvuri", "phanindra@email.com", "9392123456",
				LocalDate.of(2022, 02, 04), "Sr Analyst", 22_000.0, 2, employeeRepository.getDepartment(4)));
		employeeRepository.addEmployee(new Employee(2, "Tony", "Stark", "tony@email.com", "9989123456",
				LocalDate.of(2022, 02, 05), "Engineer", 2200.0, 2, employeeRepository.getDepartment(3)));
		employeeRepository.addEmployee(new Employee(3, "Steve", "Rogers", "steve@email.com", "9392987654",
				LocalDate.of(2022, 01, 25), "Associate", 45_000.0, 2, employeeRepository.getDepartment(2)));
		employeeRepository.addEmployee(new Employee(3, "Bruce", "Banner", "bruce@email.com", "9988776655",
				LocalDate.of(2021, 01, 25), "Scintist", 145_000.0, 3, null));

		EmployeeService employeeService = new EmployeeService();

		System.out.println(employeeService.salarySum());
		System.out.println("--------------");
		employeeService.deptDetails();
		System.out.println("--------------");
		System.out.println(employeeService.seniorEmployee());
		System.out.println("--------------");
		employeeService.employeeDuration(3);
		System.out.println("--------------");
		employeeService.noDepartmentEmployees().forEach(x -> System.out.print(x + " "));
		System.out.println("--------------");
		employeeService.employeeDay(1);

	}

}
