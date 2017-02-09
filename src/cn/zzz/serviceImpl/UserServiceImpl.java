package cn.zzz.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.zzz.dao.UserDao;
import cn.zzz.pojo.User;
import cn.zzz.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;//由userMapper.xml实现注入的实现类对象
	
	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return userDao.findAll();
	}

	@Override
	public User findById(int id) {
		// TODO Auto-generated method stub
		return userDao.findById(id);
	}

	@Override
	public void save(User user) {
		// TODO Auto-generated method stub
		userDao.save(user);
	}

	@Override
	public void remove(User user) {
		// TODO Auto-generated method stub
		userDao.remove(user);
	}

	@Override
	public void change(User user) {
		// TODO Auto-generated method stub
		userDao.change(user);
	}

	@Override
	public User findByIdAndUserName(User user) {
		// TODO Auto-generated method stub
		return userDao.findByIdAndUserName(user);
	}

	@Override
	public List<User> findByNameUser(String name) {
		// TODO Auto-generated method stub
		return userDao.findByNameUser(name);
	}
	
}
