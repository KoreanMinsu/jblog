package com.javaex.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.dao.BlogDao;
import com.javaex.dao.UserDao;
import com.javaex.vo.UserVo;

@Service
public class UserService {

	@Autowired
	private UserDao userDao;
	
	@Autowired
	BlogDao blogDao;
	
	
	//join
	public int join(UserVo userVo) {
		
		int count = userDao.insert(userVo);
		
		//blog
		blogDao.insertBlog(userVo);
		
		return count;
	}
	
	//로그인 유저 정보 호출(Login)
		public UserVo getUser(UserVo userVo) {
			System.out.println("[UserService.getUser()]");
			
			UserVo authUser = userDao.getUser(userVo);
			
			return authUser;
	}
	
	//id duplication check	
	public boolean idCheck(String id) {
		if (userDao.idCheck(id) == null) {
			return true;
			
	    } else {
	      return false;
	      
	    }
	  }
}
