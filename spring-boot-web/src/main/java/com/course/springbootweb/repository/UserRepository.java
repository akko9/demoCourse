package com.course.springbootweb.repository;

import com.course.springbootweb.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User,Integer > {

}
