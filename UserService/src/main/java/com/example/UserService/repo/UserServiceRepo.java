package com.example.UserService.repo;

import com.example.UserService.entities.UserInfo;
import com.example.UserService.entities.UserInfoDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@EnableJpaRepositories
public interface UserServiceRepo extends CrudRepository<UserInfo, String> {

   Optional<UserInfo> findByUserId(String userId);
}
