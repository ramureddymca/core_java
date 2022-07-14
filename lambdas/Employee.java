package lambdas;

public class Employee {
	private String name;
	private Integer age;
	private String regien;
	private Integer deptId;

	public Employee(String name, Integer age) {
		this.name = name;
		this.age = age;
	}

	public Employee(String name, Integer age, String regien, Integer deptId) {
		this.name = name;
		this.age = age;
		this.regien = regien;
		this.deptId = deptId;
	}

	// Getters and Setters of name & age go here

	public String toString() {
		return "Employee Name:" + this.name + "  Age:" + this.age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getRegien() {
		return regien;
	}

	public void setRegien(String regien) {
		this.regien = regien;
	}

	public Integer getDeptId() {
		return deptId;
	}

	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}
		if (!(obj instanceof Employee)) {
			return false;
		}
		Employee empObj = (Employee) obj;
		return this.age == empObj.age && this.name.equalsIgnoreCase(empObj.name);
	}

	@Override
	public int hashCode() {
		int hash = 1;
		hash = hash * 17 + this.name.hashCode();
		hash = hash * 31 + this.age;
		return hash;
	}
}