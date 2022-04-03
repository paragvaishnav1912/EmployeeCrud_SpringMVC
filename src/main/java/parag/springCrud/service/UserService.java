package parag.springCrud.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import parag.springCrud.Dao.UserDao;
import parag.springCrud.Dto.User;

@Service
public class UserService {

	@Autowired
	private UserDao UserDao;
	public void createUser(User user) {
		this.UserDao.saveUser(user);
	}
	
	public List<User> getUsers(){
		return this.UserDao.getAllUser();
	}
	
	public boolean getUserById(String email,String pass) {
		return this.UserDao.validate(email,pass);
	}
	
	public void deleteById(User User) {
		this.UserDao.deleteUserById(User);
	}
	
	public void updateById(User user) {
		this.UserDao.updateUserById(user);
	}
	
	public String getUserName(String email) {
		return this.UserDao.getUserName(email);
	}
}
