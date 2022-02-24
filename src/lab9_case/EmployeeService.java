package lab9_case;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeService {
	public double salarySum() {
		return EmployeeRepository.employeeMap.values().stream().mapToDouble(x -> x.getSalary()).reduce(0, Double::sum);
	}

	public void deptDetails() {
		EmployeeRepository.departments.forEach(x -> {
			long empCount = EmployeeRepository.employeeMap.values().stream().filter(emp -> (emp.getDepartment() != null)
					&& emp.getDepartment().getDepartmentName() == x.getDepartmentName()).count();

			System.out.printf("%s - %o\n", x.getDepartmentName(), empCount);
		});
	}

	public Employee seniorEmployee() {
		// sorts based on the hiredate - lowest date == senior most employee
		return EmployeeRepository.employeeMap.values().stream()
				.min((x, y) -> x.getHireDate().compareTo(y.getHireDate())).get();
	}

	public void employeeDuration(int employeeId) {
		Period period = Period.between(EmployeeRepository.employeeMap.get(employeeId).getHireDate(), LocalDate.now());

		System.out.println("No.of  months: " + period.getMonths());
		System.out.println("No of days: " + period.getDays());
	}

	public List<Employee> noDepartmentEmployees() {
		return EmployeeRepository.employeeMap.values().stream().filter(emp -> emp.getDepartment() == null)
				.collect(Collectors.toList());
	}

	public void employeeDay(int employeeId) {
		Employee emp = EmployeeRepository.employeeMap.get(employeeId);
		LocalDate hireDate = emp.getHireDate();
		DayOfWeek dayOfWeek = hireDate.getDayOfWeek();

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM, yyyy");

		String empName = emp.getFirstName() + " " + emp.getLastName();

		System.out.println("Employee Name: " + empName);
		System.out.println("Hired on: " + hireDate.format(formatter));
		System.out.println("Day of the week is " + dayOfWeek);
	}
	
	public List<Employee> employeeonDay (String day) {
		day = day.toUpperCase();
		
		return EmployeeRepository.employeeMap.values().stream().filter(emp -> emp.getHireDate().getDayOfWeek() == day).collect(Collectors.toList());
	}
}
