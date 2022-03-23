package parag.springCrud.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import parag.springCrud.Dto.Employee;

@Repository
public class EmployeeDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public int saveEmployee(Employee employee) {
		return (Integer)this.hibernateTemplate.save(employee);
	}
	
	public List<Employee> getAllEmployee(){
		return this.hibernateTemplate.loadAll(Employee.class);
	}
}
