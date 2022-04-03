package parag.springCrud.Dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import parag.springCrud.Dto.User;
import parag.springCrud.controller.MainController;



@Repository
public class UserDao {

	private static final Logger logger = Logger.getLogger(UserDao.class);
	   
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public void saveUser(User user) {
		this.hibernateTemplate.saveOrUpdate(user);
	}
	
	public List<User> getAllUser(){
		return this.hibernateTemplate.loadAll(User.class);
	}
	
	public boolean validate(String email,String password) {
		Transaction tsx = null;
		User user = null;
		try(Session session = this.hibernateTemplate.getSessionFactory().openSession()){
			tsx = session.beginTransaction();
			user = (User)session.createQuery("FROM User U WHERE U.userEmail = :userEmail").setParameter("userEmail", email)
					.uniqueResult();
			logger.warn("from userdao here is "+user);
			if(user!=null && user.getUserPassword().equals(password)){
				logger.warn("from userdao");
				return true;
			}
			tsx.commit();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public String getUserName(String email) {
		Transaction tsx =null;
		User user = null;
		try(Session session = this.hibernateTemplate.getSessionFactory().openSession()){
			tsx = session.beginTransaction();
			user = (User)session.createQuery("FROM User U WHERE U.userEmail = :userEmail")
					.setParameter("userEmail", email)
					.uniqueResult();
			logger.debug("from getUserName--->"+user.getUserName());
			tsx.commit();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return user.getUserName();
	}
	@Transactional
	public void deleteUserById(User User) {
		this.hibernateTemplate.delete(User);
	}
	
	@Transactional
	public void updateUserById(User User) {
		this.hibernateTemplate.update(User);
	}
	
}
