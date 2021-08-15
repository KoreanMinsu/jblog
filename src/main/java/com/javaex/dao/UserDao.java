package com.javaex.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.UserVo;

@Repository
public class UserDao {

	@Autowired
	private SqlSession sqlSession;
	
	//join
	public int insert(UserVo userVo) {
		System.out.println("[UserDao.insertUser(join)]");
		
		int count = sqlSession.insert("user.insertUser", userVo);
		
		return count;
	}
	
	//로그인 유저 정보 호출(Login)
	public UserVo getUser(UserVo userVo) {
		System.out.println("[UserDao.getUser(login)]");
		
		return sqlSession.selectOne("user.getUser", userVo);
	}
	
	//id duplication check
	public UserVo idCheck(String id) {
		System.out.println("[UserDao.idCheck]");
		
		return sqlSession.selectOne("user.idCheck", id);
	}
}
