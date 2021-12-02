package com.guglielminijorge.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guglielminijorge.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
