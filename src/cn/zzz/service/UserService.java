package cn.zzz.service;

import java.util.List;

import cn.zzz.pojo.User;

public interface UserService {
	//��ѯ����
		public List<User> findAll();
		//����ID����
		public  User findById(int id);
		//���һ���û�
		public void save(User user);
		//ɾ��һ���û�
		public void remove(User user);
		//�����û�
		public void change(User user);
		
		public User findByIdAndUserName(User user);
		
		public List<User> findByNameUser(String name);
		
}
