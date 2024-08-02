//This is a Project package, a Project has multiple tasks in it.

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
    private User user;

    @OneToMany(mappedBy = "project")//Specifies that one Project can have many Tasks
    private List<Task> tasks; //List of Tasks associated with the Project

}
