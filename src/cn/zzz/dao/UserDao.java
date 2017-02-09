package cn.zzz.dao;

import java.util.List;

import cn.zzz.pojo.User;

public interface UserDao {
	// 查询所有
	public List<User> findAll();

	// 根据ID查找
	public User findById(int id);

	// 添加一个用户
	public void save(User user);

	// 删除一个用户
	public void remove(User user);

	// 更改用户
	public void change(User user);

	public List<User> findByNameUser(String name);

	// 根据ID和用户名的组合查找
	public User findByIdAndUserName(User user);
}
