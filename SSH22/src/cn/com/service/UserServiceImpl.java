package cn.com.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.com.dao.UserDao;
import cn.com.entity.User;

@Service
public class UserServiceImpl implements UserService {
	@Resource
	private UserDao userdao;
	
	

	/**
	 * @return the userdao
	 */
	public UserDao getUserdao() {
		return userdao;
	}

	/**
	 * @param userdao the userdao to set
	 */
	public void setUserdao(UserDao userdao) {
		this.userdao = userdao;
	}

	@Override
	public void insertUser(User user) {
		// TODO Auto-generated method stub
		this.userdao.insert(user);//服务层代码调用数据访问层

	}

	@Override
	public void deleteUser(Integer userId) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<User> select() {
		// TODO Auto-generated method stub
		return this.userdao.select();
		
	}

}
