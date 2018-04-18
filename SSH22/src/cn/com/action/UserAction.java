package cn.com.action;

import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import com.opensymphony.xwork2.ActionSupport;

import cn.com.entity.User;
import cn.com.service.UserService;

@ParentPackage("json-defult")
@Namespace("p2")
@Results({
	@Result(name="success"),
	@Result(name="error",location="/error.html")
})
public class UserAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private User user;//封装表单数据
	private UserService userService;//要注入的服务器对象
	private List<User> userList;
	
	

	/**
	 * @return the userList
	 */
	public List<User> getUserList() {
		return userList;
	}

	/**
	 * @param userList the userList to set
	 */
	public void setUserList(List<User> userList) {
		this.userList = userList;
	}

	/**
	 * @param userService the userService to set
	 */
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}
	
	@Action("insertUser")
	public String insertUser(){
		this.userService.insertUser(user);
		this.userList = this.userService.select();
		return SUCCESS;
	}
	
	public String deleteUser(){
		return SUCCESS;
	}
	@Action("userList")
	public String userList(){
		this.userList = this.userService.select();
		return SUCCESS;
	}
	
}
