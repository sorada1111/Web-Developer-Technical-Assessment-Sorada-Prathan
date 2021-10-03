package com.example.demo.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.User;

@Repository
public class UserRepositoryImpl implements UserRepository{
	
	 @Autowired
	  private JdbcTemplate jdbcTemplate;

	@Override
	public List<User> getusers() throws Exception {
		List<User> user = jdbcTemplate.query("SELECT * from user ORDER BY RAND() LIMIT 6", BeanPropertyRowMapper.newInstance(User.class));
		
		return user;
	}

}
