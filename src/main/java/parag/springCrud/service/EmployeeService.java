package parag.springCrud.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import parag.springCrud.Dao.EmployeeDao;
import parag.springCrud.Dto.Employee;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;
	public int createEmployee(Employee employee) {
		return this.employeeDao.saveEmployee(employee);
	}
	
	public List<Employee> getEmployees(){
		return this.employeeDao.getAllEmployee();
	}
	
	public Employee getEmpById(int id) {
		return this.employeeDao.getEmployeeById(id);
	}
	
	public void deleteById(Employee employee) {
		this.employeeDao.deleteEmployeeById(employee);
	}
	
	public void updateById(Employee employee) {
		this.employeeDao.updateEmployeeById(employee);
	}
}
