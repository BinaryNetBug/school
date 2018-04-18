package cn.com.service;

import java.util.List;

import cn.com.entity.User;

public interface UserService {
	public void insertUser(User user);
	public void deleteUser(Integer userId);
	public List<User> select();
}
