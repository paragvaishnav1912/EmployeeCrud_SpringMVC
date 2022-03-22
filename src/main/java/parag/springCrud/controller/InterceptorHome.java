package parag.springCrud.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class InterceptorHome extends HandlerInterceptorAdapter{

	private static final Logger logger = Logger.getLogger(MainController.class);
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		if(request.getParameter("ename").startsWith("A")) {
			logger.warn("inside the interceptor here "+request.getParameter("ename"));
			request.setAttribute("error", "name is not start with other then A character");
			response.sendRedirect("/home?error=yes");
			return false;
		}
		return true;
	}

}
