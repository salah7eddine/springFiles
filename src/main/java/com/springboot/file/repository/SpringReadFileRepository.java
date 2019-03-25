package com.springboot.file.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.file.model.User;

@Repository
public interface SpringReadFileRepository extends CrudRepository<User, Long>{

}
