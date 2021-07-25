package management.management.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employee")
public class Employee {
	
	
	public Employee() {
		super();
	}
	public Employee(long empCode, String empName, String loc, String email, String date) {
		super();
		this.empCode = empCode;
		this.empName = empName;
		this.loc = loc;
		this.email = email;
		this.date = date;
	}
	@Id
	private long empCode;
	
	private String empName;
	private String loc;
	private String email;
	private String date;
	public long getEmpCode() {
		return empCode;
	}
	public void setEmpCode(long empCode) {
		this.empCode = empCode;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Employee [empCode=" + empCode + ", empName=" + empName + ", loc=" + loc + ", email=" + email + ", date="
				+ date + "]";
	}

}
