package parag.springCrud.Dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import parag.springCrud.Dto.Employee;

@Component("employeeDao")
@Repository
public class EmployeeDaoImpl implements EmployeeDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int insertData(Employee employee) {
		
		String query = "insert into employee(ename,gen,dob,email,phno,desgination) values(?,?,?,?,?,?)";
		int run = this.jdbcTemplate.update(query,employee.getEname(),
												employee.getGen(),
												employee.getDob(),
												employee.getEmail(),
												employee.getPhno(),
												employee.getDesgination());
		return run;
	}
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public Employee getEmployeeById(int eid) {
		
		String query = "select * from employee WHERE eid=?";
		RowMapper<Employee>rowMapper = new RowMapperImpl();
		Employee employee = this.jdbcTemplate.queryForObject(query, rowMapper,eid);
		
		return employee;
	}

	@Override
	public List<Employee> getEmployee() {
		
		String query = "select * from employee";
		List<Employee>student = this.jdbcTemplate.query(query, new RowMapperImpl());
		return student;
	}

	@Override
	public int deleteById(int eid) {
		
		String query = "delete from employee WHERE eid=?";
		int run = this.jdbcTemplate.update(query,eid);
		return run;
	}
	
	@Override
	public int udpateById(Employee employee,int eid) {
		
		String query = "update employee SET ename=?,gen=?,dob=?,email=?,phno=?,desgination=? WHERE eid=?";
		int result = this.jdbcTemplate.update(query,
				employee.getEname(),
				employee.getGen(),
				employee.getDob(),
				employee.getEmail(),
				employee.getPhno(),
				employee.getDesgination(),
				employee.getEid());
		return result;
	}
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	
	public EmployeeDaoImpl() {
		// TODO Auto-generated constructor stub
	}
}
