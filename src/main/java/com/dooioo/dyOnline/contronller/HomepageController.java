package com.dooioo.dyOnline.contronller;

import com.dooioo.dyOnline.model.Employee;
import com.dooioo.dyOnline.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.util.WebUtils;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HomepageController {

    @Autowired
    private EmployeeService employeeService;
    @RequestMapping(value = "/index",method = RequestMethod.GET)
	public String test(Model model){
        model.addAttribute("employees",employeeService.selectList("queryList"));
		return "index";
	}

    @RequestMapping(value = "/index",method = RequestMethod.POST)
    public String add(Model model,Employee employee){
        employeeService.insert("insertEmployee",employee);
        return "redirect:/details/"+employee.getUserCode();
    }

    @RequestMapping(value = "/details/{userCode}",method = RequestMethod.GET)
    public String deatils(Model model,@PathVariable int userCode){
        model.addAttribute("employee",employeeService.getEmployeeByUserCode(userCode));
        return "details";
    }

    @RequestMapping(value = "/page")
    public String page(HttpServletRequest request,Model model){
       int pageNo = Integer.parseInt(WebUtils.findParameterValue(request,"pageNo"));
       model.addAttribute("employees",employeeService.pageNo(pageNo,2));
       return "index";
    }

}
