package com.dooioo.dyOnline.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dooioo.dyOnline.base.service.BaseService;
import com.dooioo.dyOnline.model.Employee;

@Service
public class EmployeeService extends BaseService<Employee> {

	/**
	 * 获得员工信息
	 * @param userCode
	 * @return
	 */
	public Employee getEmployeeByUserCode(int userCode){
		return this.selectOne(sqlId("queryByUserCode"), userCode);
	}
	
	/**
	 * 获得员工列表2
	 * @return
	 */
	public List<Employee> getEmployeeListLikeName(Object obj){
		return this.selectList(sqlId("queryListLikeName"),obj);
	}

    /**
     * 分页查询
     * @return
     */
    public List<Employee> pageNo(int pageNo,int pageSize){
        Employee employee = new Employee();
//        employee.setWhere("userName like '胡%'");
        employee.setOrder("userCode desc");
        employee.setPageNo(pageNo);
        employee.setPageSize(pageSize);
       return  this.selectByPage("queryByPage",employee);
    }
	
}
