package parag.springCrud.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import parag.springCrud.Dto.User;
import parag.springCrud.service.UserService;

@Controller
public class LoginController {

	private static final Logger logger = Logger.getLogger(MainController.class);
	@Autowired
	private UserService userService;

	@RequestMapping(path = "/login", method = RequestMethod.POST)
	public String loginPage(@ModelAttribute User user,HttpServletRequest req) {
		logger.warn("started login controller here"+user.getUserEmail());
		logger.warn("started login controller isChecked"+user.isChoice());
			if(userService.getUserById(user.getUserEmail(), user.getUserPassword())){
				HttpSession session = req.getSession();
				String name = userService.getUserName(user.getUserEmail()).split(" ")[0];
				session.setAttribute("user", name);
				return "index";
			}
			else {
				return "redirect:/";
			}
		}
	
	@RequestMapping(path="/logout")
	public String logoutPage(HttpServletRequest req) {
		logger.warn("started logout page--->");
		req.getSession().invalidate();
		return "redirect:/";
	}
	
	public User checkCookie(HttpServletRequest req) {
		Cookie[]cookie = req.getCookies();
		User user = new User();
		String email="",pass="";
		for(Cookie ck : cookie) {
			if(ck.getName().equalsIgnoreCase("paragvaishnav42@gmail.com")) {
				email=ck.getValue();
			}
			if(ck.getName().equalsIgnoreCase("Pa2000vn@")) {
				pass=ck.getValue();
			}
		}
		if(email.isEmpty() && pass.isEmpty()) {
			user.setUserEmail(email);
			user.setUserPassword(pass);
		}
		return user;
	}
	

}
