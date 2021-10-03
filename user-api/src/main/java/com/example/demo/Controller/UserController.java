package com.example.demo.Controller;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Base64;
import java.util.List;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.ResponseList;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
@RestController
@CrossOrigin("http://localhost:8081/")
@RequestMapping("/api")
public class UserController {
	
	private Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/users")
	public ResponseList<User> getAllCustomers(HttpServletRequest request, HttpServletResponse response){
        ResponseList<User> respData = new ResponseList<User>();
		List<User> user = null;
		try {
			user= userService.listUser();	

            respData.setData(user);
			
		} catch(Exception ex) {
			logger.error(ex.getMessage(), ex);
            response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
            respData.setData(null);
		}finally {
            respData.setData(user);
        }
		return respData;
	}

}
