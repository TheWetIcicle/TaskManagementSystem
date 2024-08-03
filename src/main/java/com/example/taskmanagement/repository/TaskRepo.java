package com.example.taskmanagement.repository;

import com.example.taskmanagement.databasemodel.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepo extends JpaRepository<Task, Long> {

}
