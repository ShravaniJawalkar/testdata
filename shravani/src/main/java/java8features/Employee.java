package java8features;

import java.util.Objects;

public class Employee implements Comparable<Employee> {
	private int id;
	private String name;
	private String organization;
	private int salary;

	public Employee(int id, String name, String organization, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.organization = organization;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, organization, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return id == other.id && Objects.equals(name, other.name) && Objects.equals(organization, other.organization)
				&& salary == other.salary;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOrganization() {
		return organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee e) {
		if (this.id > e.id)
			return 1;
		else if (this.id < e.id)
			return -1;
		else
			return 0;
	}

}
