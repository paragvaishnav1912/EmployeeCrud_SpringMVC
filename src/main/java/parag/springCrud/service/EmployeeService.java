package parag.springCrud.service;

import java.util.List;

import org.springframework.stereotype.Component;

import parag.springCrud.Dto.Employee;
public interface EmployeeService {

	public int  insertEmployee(Employee employee);
	
	public Employee getEmployeeById(int eid);
	
	public List<Employee> getEmployee();
	
	public int deleteById(int eid);
	
	public int updateEmployee(Employee employee , int eid);
	
}
