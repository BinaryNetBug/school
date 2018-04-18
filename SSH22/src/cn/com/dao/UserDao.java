package cn.com.dao;

import java.util.List;

import cn.com.entity.User;

public interface UserDao {
	public void insert(User user);
	public void delete(Integer userId);
	public void update(User user);
	public User selectId(Integer userId);
	public List<User> select();
}
