package com.dooioo.dyOnline.test.service;

import java.util.HashMap;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.dooioo.dyOnline.model.Employee;
import com.dooioo.dyOnline.service.EmployeeService;
import com.dooioo.dyOnline.test.BaseTest;

public class TestEmployeeService extends BaseTest{

	@Autowired
	private EmployeeService employeeService;
	
	@Test
	public void getEmployeeByUserCode(){
		System.out.println(employeeService.selectOne("queryByUserCode", 86101));
	}
	@Test
	public void getEmployeeList(){
		System.out.println(employeeService.selectList("queryList"));
	}
	
	@Test
	public void getEmployeeListLikeName(){
		HashMap<String,Object> map = new HashMap<String,Object>();
		map.put("userName", "胡");
		System.out.println(employeeService.getEmployeeListLikeName(map));
	}
	
	@Test
	public void getEmployeeCount(){
		System.out.println(employeeService.count("employeeCount"));
	}
	
	@Test
	public void insertEmployee(){
		Employee employee = new Employee();
		employee.setUserName("邓冬");
		employee.setMobilePhone("13138271112");
		employee.setSex((byte)2);
		System.out.println(employeeService.insert("insertEmployee",employee));
	}
	
	@Test
	public void updateEmployee(){
		Employee employee = new Employee();
		employee.setUserCode(2);
		employee.setSex((byte)3);
		System.out.println(employeeService.update("updateEmployee",employee));
	}
	
	@Test
	public void updateEmployee2(){
		System.out.println(employeeService.update("updateEmployee2"));
	}
	
	@Test
	public void deleteEmployee(){
		System.out.println(employeeService.delete("deleteEmployee",4));
	}
	
	@Test
	public void selectByPage(){
		Employee employee = new Employee();
		employee.setWhere("userName like '胡%'");
		employee.setOrder("userCode desc");
		employee.setPageNo(2);
		System.out.println(employeeService.selectByPage("queryByPage",employee));
	}
}
