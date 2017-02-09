package cn.zzz.dao;

import java.util.List;

import cn.zzz.pojo.User;

public interface UserDao {
	// ��ѯ����
	public List<User> findAll();

	// ����ID����
	public User findById(int id);

	// ���һ���û�
	public void save(User user);

	// ɾ��һ���û�
	public void remove(User user);

	// �����û�
	public void change(User user);

	public List<User> findByNameUser(String name);

	// ����ID���û�������ϲ���
	public User findByIdAndUserName(User user);
}
