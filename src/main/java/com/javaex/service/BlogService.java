package com.javaex.service;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.javaex.dao.BlogDao;
import com.javaex.vo.BlogVo;

@Service
public class BlogService {

	@Autowired
	private BlogDao blogDao;
	
	
	//get Blog
	public BlogVo getBlog(String id) {
		
	return blogDao.selectBlog(id);
	}
	
	//파일업로드 처리
	public String restore(MultipartFile file) {
		
		//하드파일경로
		String saveDir = "c:\\javaStudy\\upload\\jblog";
		
		//원파일이름
		String orgName = file.getOriginalFilename();

		//확장자
		String exName = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
		
		//저장파일이름(관리때문에 중복 없는 새이름 부여)
		String saveName = System.currentTimeMillis() + UUID.randomUUID().toString()+exName;
		
		//파일패스
		String filePath = saveDir + "\\" + saveName;
		
		//파일 사이즈
		long fileSize = file.getSize();

		
		//파일을 서버의 하드에 저장
		try {
			byte[] fileData = file.getBytes();
			OutputStream out = new FileOutputStream(filePath);
			BufferedOutputStream bos = new BufferedOutputStream(out);
		
			 bos.write(fileData);
			 bos.close();
			 
	    // 2. 파일 정보를 DB에 저장 -- 과제

		}	catch (IOException e) {

	      e.printStackTrace();
	    }
		
		return saveName;
	}	
	
}
