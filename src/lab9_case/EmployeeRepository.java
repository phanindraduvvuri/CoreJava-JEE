package lab9_case;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class EmployeeRepository {
	public static Map<Integer, Employee> employeeMap = new HashMap<Integer, Employee>();
	public static Set<Department> departments = new HashSet<Department>();

	public EmployeeRepository() {
	}

	public void addEmployee(Employee employee) {
		employeeMap.put(employee.getEmployeeId(), employee);
	}

	public void addDepartment(Department department) {
		departments.add(department);
	}
	
	public Department getDepartment (int id) {
		for (Department dept: departments)
			if (dept.getDepartmentId() == id)
				return dept;
		
		return null;
	}
}
