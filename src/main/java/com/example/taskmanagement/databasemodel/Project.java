//This is the Project class, a Project has multiple Tasks in it. There can be multiple Projects associated with a User.

package com.example.taskmanagement.databasemodel;

import jakarta.persistence.*;
import java.util.List;

@Entity //Specifies that this class is an Entity and is mapped to a database table
public class Project {
    @Id //Specifies the primary key of the Entity
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Specifies that the primary key should be generated automatically
    private Long id; //This is the primary key

    private String name; //Specifies the name of the Project

    @ManyToOne //Specifies that many Projects can belong to one User
    private User user; //Specifies the User associated with this Project

    @OneToMany(mappedBy = "project")//Specifies that one Project can have many Tasks
    private List<Task> tasks; //List of Tasks associated with the Project

    //Getters and Setters, allows you to get and modify the private fields of a class

    //Getter for id
    public Long getId() {
        return id;
    }

    //Setter for id
    public void setId(Long id) {
        this.id = id;
    }

    //Getter for name
    public String getName() {
        return name;
    }

    //Setter for name
    public void setName(String name) {
        this.name = name;
    }

    //Getter for user
    public User getUser() {
        return user;
    }

    //Setter for user
    public void setUser(User user) {
        this.user = user;
    }

    //Getter for tasks
    public List<Task> getTasks() {
        return tasks;
    }

    //Setter for tasks
    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }
}