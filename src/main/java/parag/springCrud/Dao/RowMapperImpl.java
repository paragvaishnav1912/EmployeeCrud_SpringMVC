package parag.springCrud.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

import parag.springCrud.Dto.Employee;

public class RowMapperImpl implements RowMapper<Employee>{

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Employee employee = new Employee();
		employee.setEid(rs.getInt(1));
		employee.setEname(rs.getString(2));
		employee.setGen(rs.getString(3));
		employee.setDob(rs.getString(4));
		employee.setEmail(rs.getString(5));
		employee.setPhno(rs.getString(6));
		employee.setDesgination(rs.getString(7));
		
		return employee;
	}

}
