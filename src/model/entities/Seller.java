package model.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Seller implements Serializable{

	private static final long serialVersionUID = 1L;
	private Integer ID;
	private String name;
	private String email;
	private Date birthDate;
	private double BaseSalary;
	private Department department;

	public Seller() {
		super();
	}

	public Seller(Integer iD, String name, String email, Date birthDate, double baseSalary, Department department) {
		ID = iD;
		this.name = name;
		this.email = email;
		this.birthDate = birthDate;
		BaseSalary = baseSalary;
		this.department = department;
	}

	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public double getBaseSalary() {
		return BaseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		BaseSalary = baseSalary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public int hashCode() {
		return Objects.hash(ID);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Seller other = (Seller) obj;
		return Objects.equals(ID, other.ID);
	}

	@Override
	public String toString() {
		return "Seller [ID=" + ID + ", name=" + name + ", email=" + email + ", birthDate=" + birthDate + ", BaseSalary="
				+ BaseSalary + ", department=" + department + "]";
	}

}
