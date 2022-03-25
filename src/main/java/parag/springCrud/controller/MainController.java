package parag.springCrud.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;
import parag.springCrud.Dto.Employee;
import parag.springCrud.service.EmployeeService;

@Controller
@RequestMapping("/")
public class MainController {

	private static final Logger logger = Logger.getLogger(MainController.class);
	@Autowired
	private EmployeeService employeeService;

	@RequestMapping("/home")
	public ModelAndView homePage() {

		logger.warn("home page starts...");
		ModelAndView mv = new ModelAndView();
		mv.addObject("data", this.employeeService.getEmployees());
		mv.setViewName("index");
		return mv;
	}

	@RequestMapping(value = "/processPage", method = RequestMethod.POST)
	public String processPage(@ModelAttribute Employee employee) {

		logger.warn("processPage starts..." + employee.toString());
		this.employeeService.createEmployee(employee);
		return "redirect:home";
	}

	@RequestMapping(value = "/deleteData/{eid}", method = RequestMethod.GET)
	public String deleteProcess(@PathVariable(value = "eid") String empId) {

		int id = Integer.parseInt(empId);
		logger.warn("process editData starts.." + empId);
		Employee employee = this.employeeService.getEmpById(id);
		this.employeeService.deleteById(employee);
		return "redirect:/home";
	}

	@RequestMapping(value = "/editData/{eid}", method = RequestMethod.GET)
	public ModelAndView editProcess(@PathVariable(value = "eid") String empId) {

		int id = Integer.parseInt(empId);
		logger.warn("process EditStarts here.." + empId);
		Employee employee = this.employeeService.getEmpById(id);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("updateForm");
		logger.warn("the object "+employee.toString());
		mv.addObject("employee",employee);
		return mv;
	}
	
	@RequestMapping(value = "/updateData/{eid}", method = RequestMethod.POST)
	public String updateData(@PathVariable String eid, @ModelAttribute Employee employee) {

		int id = Integer.parseInt(eid);
		logger.warn("employee data "+employee);
		this.employeeService.updateById(employee);
		return "redirect:/home";
		
	}
}
