package com.example.taskmanagement.repository;

import com.example.taskmanagement.databasemodel.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {

}
