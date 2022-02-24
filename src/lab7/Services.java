package lab7;

import java.util.HashMap;
import java.util.Map;

public class Services implements EmployeeService {
	// stored as id: Employee
	private Map<Integer, Employee> employeeMap = new HashMap<Integer, Employee>();

	@Override
	public void addEmployee(Employee employee) {
		employeeMap.put(employee.getId(), employee);
	}

	@Override
	public void removeEmployee(Employee employee) {
		employeeMap.remove(employee.getId());
	}

	@Override
	public void getEmployees(String insuranceScheme) {
		for (Employee employee : employeeMap.values()) {
			if (employee.getInsuranceScheme() == insuranceScheme)
				System.out.println(employee);
		}

	}

	public Employee getEmployeeById(int id) throws NoEmployeeException {
		if (!employeeMap.containsKey(id))
			throw new NoEmployeeException("Id no " + id + " does not exits");

		return employeeMap.get(id);
	}

	public Map<Integer, Employee> getAllEmployees() {
		return employeeMap;
	}

}
