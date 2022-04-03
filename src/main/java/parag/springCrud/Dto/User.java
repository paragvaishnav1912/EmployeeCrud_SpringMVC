package parag.springCrud.Dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
public class User {
	
	@Id
	String userEmail;
	String userName;
	String userPassword;
	boolean choice;
	
	public User(String userEmail, String userName, String userPassword, boolean choice) {
		super();
		this.userEmail = userEmail;
		this.userName = userName;
		this.userPassword = userPassword;
		this.choice = choice;
	}

	public boolean isChoice() {
		return choice;
	}

	public void setChoice(boolean choice) {
		this.choice = choice;
	}

	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	
	@Override
	public String toString() {
		return "User [userEmail=" + userEmail + ", userName=" + userName + ", userPassword=" + userPassword + "]";
	}

	public User() {
		// TODO Auto-generated constructor stub
	}
	
}
