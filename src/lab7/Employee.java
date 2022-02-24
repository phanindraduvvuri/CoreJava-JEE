package lab7;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class Employee {
	private int id;
	private String name;
	private int salary;
	private String designation;
	private String insuranceScheme;
	
	// Apparently increments number each time automatically
	private static final AtomicInteger COUNT_ATOMIC_INTEGER = new AtomicInteger(0);
	// A map to store insurance Schemes based on Designation
	private static Map<String , String> INSURANCE_SCHEMES = new HashMap<String, String>();

	public Employee(String name, int salary, String designation) {
		super();
		
		// adding insurance schemes map;
		INSURANCE_SCHEMES.put("System Associate", "Scheme C");
		INSURANCE_SCHEMES.put("Programmer", "Scheme B");
		INSURANCE_SCHEMES.put("Manager", "Scheme A");
		INSURANCE_SCHEMES.put("Clerk", "No Scheme");
		
		this.id = COUNT_ATOMIC_INTEGER.incrementAndGet();
		this.name = name;
		this.salary = salary;
		this.designation = designation;
		this.insuranceScheme = INSURANCE_SCHEMES.get(designation);
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getSalary() {
		return salary;
	}

	public String getDesignation() {
		return designation;
	}

	public String getInsuranceScheme() {
		return insuranceScheme;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", designation=" + designation + "]";
	}

}
