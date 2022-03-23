package parag.springCrud.Dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EmployeeData")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	int eid;
	String ename, gen, dob, email, phno, desgination;

	public Employee(int eid, String ename, String gen, String dob, String email, String phno, String desgination) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.gen = gen;
		this.dob = dob;
		this.email = email;
		this.phno = phno;
		this.desgination = desgination;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getGen() {
		return gen;
	}

	public void setGen(String gen) {
		this.gen = gen;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhno() {
		return phno;
	}

	public void setPhno(String phno) {
		this.phno = phno;
	}

	public String getDesgination() {
		return desgination;
	}

	public void setDesgination(String desgination) {
		this.desgination = desgination;
	}

	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", gen=" + gen + ", dob=" + dob + ", email=" + email
				+ ", phno=" + phno + ", desgination=" + desgination + "]";
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}
}
