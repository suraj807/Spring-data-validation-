package com.usermgm.repository;

import com.usermgm.model.user;

import org.springframework.data.jpa.repository.JpaRepository;

public interface userRepository extends JpaRepository<user, Integer> {

}
