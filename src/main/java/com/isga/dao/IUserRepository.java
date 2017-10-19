package com.isga.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.isga.model.User;

public interface IUserRepository extends JpaRepository<User, Long> {

	@Query(nativeQuery = true, value = "SELECT * FROM user u WHERE u.login=:x")
	public User getUSerByLogin(@Param("x") String login);
}
