package com.javaex.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.BlogVo;
import com.javaex.vo.UserVo;

@Repository
public class BlogDao {

	@Autowired
	private SqlSession sqlSession;
	
	//insert blog
	public int insertBlog(UserVo userVo) {
	    System.out.println("[blogDao.insertBlog()]");

	    int count = sqlSession.insert("blog.insertBlog", userVo);
	    
	    return count;
	}
	
	//select blog
	public BlogVo selectBlog(String id) {
		System.out.println("[blogDao.selectBlog()]");
		
		return sqlSession.selectOne("blog.selectBlog", id);
	}
	
	//update blog
	public int updateBlog(BlogVo blogVo) {
		System.out.println("[blogDao.selectBlog()]");
		
		int count = sqlSession.insert("blog.insertBlog", blogVo);
	    
	    return count;
	}
	
}
