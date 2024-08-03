package com.example.taskmanagement.repository;

import com.example.taskmanagement.databasemodel.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepo extends JpaRepository<Project, Long> {

}
