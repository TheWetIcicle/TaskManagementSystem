package com.example.taskmanagement.databasemodel;

import jakarta.persistence.*;

@Entity //Specifies that this class is an Entity and is mapped to a database table
public class Task {
    @Id //Specifies the primary key of the Entity
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Specifies that the primary key should be generated automatically
    private Long id; //This is the primary key

    private String title; //Specifies the title of the task
    private String description; //Specifies the description of the task
    private String dueDate; //Specifies the due date of the task

    @ManyToOne //Specifies that there can exist many Tasks in a single Project
    private Project project;
}
