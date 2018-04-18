package cn.com.daoImpl;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;

import cn.com.dao.UserDao;
import cn.com.entity.User;

public class UserDaoImpl implements UserDao {
	private HibernateTemplate hibernateTemplate;
	
	

	/**
	 * @param hibernateTemplate the hibernateTemplate to set
	 */
	//spring为我们提供了hibernatetemplate对象，类似于session对象，之后要有sparing容器注入，所以提供set方法
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	public void insert(User user) {
		// TODO Auto-generated method stub
		this.hibernateTemplate.save(user);

	}

	@Override
	public void delete(Integer userId) {
		// TODO Auto-generated method stub
		this.hibernateTemplate.delete(this.selectId(userId));

	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		this.update(user);

	}

	@Override
	public User selectId(Integer userId) {
		// TODO Auto-generated method stub
		User user = this.hibernateTemplate.get(User.class, userId);
		return user;

	}

	@Override
	public List<User> select() {
		// TODO Auto-generated method stub
		return (List<User>) this.hibernateTemplate.find("from user",null);
	}

}
