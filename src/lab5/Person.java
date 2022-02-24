package lab5;

public class Person {
	private int age;
	private String name;

	Person() {
		super();
	}

	Person(String name, int age) throws PersonAgeException {
		this.setName(name);
		this.setAge(age);
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws PersonAgeException {
		this.age = age;

		if (this.age < 15) {
			throw new PersonAgeException("Person's age must be atleat 15");
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;

	}

	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + "]";
	}

}
