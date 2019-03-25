package com.springboot.file.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.springboot.file.model.User;


public interface SpringReadFileService {

	List<User> findAll();

	boolean saveDataFromUploadFile(MultipartFile file);

}
