package com.example.demo.service;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public List<User> listUser() throws Exception {
		try {
			List<User> userList = userRepository.getusers();
			Random r = new Random();
			for (User u: userList) {
				int ran = r.nextInt(101);
				u.setRan(ran);
			}
            return userList;
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
	}

}
