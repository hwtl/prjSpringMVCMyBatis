package com.dooioo.dyOnline.model;

import org.apache.ibatis.type.Alias;

import com.dooioo.dyOnline.base.model.Page;

@Alias("employee")
public class Employee extends Page{
	/**
	 * 工号
	 */
	private int userCode;
	/**
	 * 姓名
	 */
	private String userName;
	/**
	 * 手机号码
	 */
	private String mobilePhone;
	/**
	 * 性别 0 女，1男 2未知
	 */
	private byte sex;
	/**
	 * 获得工号
	 * @return
	 */
	public int getUserCode() {
		return userCode;
	}
	/**
	 * 设置工号
	 * @param userCode
	 */
	public void setUserCode(int userCode) {
		this.userCode = userCode;
	}
	/**
	 * 获得姓名
	 * @return
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * 设置姓名
	 * @param userName
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * 获得手机
	 * @return
	 */
	public String getMobilePhone() {
		return mobilePhone;
	}
	/**
	 * 设置手机
	 * @param mobilePhone
	 */
	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}
	/**
	 * 获得性别
	 * @return
	 */
	public byte getSex() {
		return sex;
	}
	/**
	 * 设置性别
	 * @param sex
	 */
	public void setSex(byte sex) {
		this.sex = sex;
	}
	
	public Employee(){
		
	}
	
	@Override
	public String toString() {
		return "Employee [userCode=" + userCode + ", userName=" + userName
				+ ", mobilePhone=" + mobilePhone + ", sex=" + sex + "]";
	}
}
