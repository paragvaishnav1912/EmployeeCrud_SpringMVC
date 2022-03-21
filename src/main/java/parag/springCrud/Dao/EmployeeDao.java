package parag.springCrud.Dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import parag.springCrud.Dto.Employee;

@Repository
public interface EmployeeDao {

	public int insertData(Employee employee);
	
	public Employee getEmployeeById(int eid);
	
	public List<Employee> getEmployee();
	
	public int deleteById(int eid);
	
	public int udpateById(Employee employee, int eid);
}
