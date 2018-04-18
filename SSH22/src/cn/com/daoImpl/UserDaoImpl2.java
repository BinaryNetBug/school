package cn.com.daoImpl;

import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import cn.com.dao.UserDao;
import cn.com.entity.User;

@Repository
public class UserDaoImpl2 extends HibernateDaoSupport implements UserDao {

	@Override
	public void insert(User user) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(user);

	}

	@Override
	public void delete(Integer userId) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(this.selectId(userId));

	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(user);

	}

	@Override
	public User selectId(Integer userId) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().get(User.class, userId);
	}

	@Override
	public List<User> select() {
		// TODO Auto-generated method stub
		return (List<User>) this.getHibernateTemplate().find("from User", null);
	}

}
