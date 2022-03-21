package parag.springCrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import parag.springCrud.Dao.EmployeeDao;
import parag.springCrud.Dto.Employee;
import parag.springCrud.config.JdbcConfig;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	EmployeeDao employeeDao;
	
	@Autowired
	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}
	
	@Override
	public Employee getEmployeeById(int eid) {
		return this.employeeDao.getEmployeeById(eid);
	}

	@Override
	public List<Employee> getEmployee() {
		return this.employeeDao.getEmployee();
	}

	@Override
	public int deleteById(int eid) {
		return this.employeeDao.deleteById(eid);
	}
	
	@Override
	public int insertEmployee(Employee employee) {
		 return this.employeeDao.insertData(employee);
	}

	@Override
	public int updateEmployee(Employee employee, int eid) {
		return this.employeeDao.udpateById(employee, eid);
	}

}
