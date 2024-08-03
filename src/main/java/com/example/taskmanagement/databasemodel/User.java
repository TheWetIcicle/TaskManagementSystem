//This is the User package, A User here is a user of the system, a User can have multiple Projects.

package com.example.taskmanagement.databasemodel;

import jakarta.persistence.*;
import java.util.List;

@Entity //Specifies that this class is an Entity and is mapped to a database table
public class User {
    @Id //Specifies the primary key of the Entity
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Specifies that the primary key should be generated automatically
    private Long id; //This is the primary key

    private String username; //Username of the User
    private String password; //Password of the User

    @OneToMany(mappedBy = "user") //OnetoMany sets up a one-to-many relationship which means that, here, a User can have multiple Projects.
    // The 'mappedBy' attribute indicates that the user field in the 'Project' entity is the owner of the relationship
    private List<Project> projects; //Specifies a list of Projects associated with the User

    //Getters and Setters, allows you to get and modify the private fields of a class

    //Getter for id
    public Long getId() {
        return id;
    }

    //Setter for id
    public void setId(Long id) {
        this.id = id;
    }

    //Getter for username
    public String getUsername() {
        return username;
    }

    //Setter for username
    public void setUsername(String username) {
        this.username = username;
    }

    //Getter for password
    public String getPassword() {
        return password;
    }

    //Setter for password
    public void setPassword(String password) {
        this.password = password;
    }

    //Getter for projects
    public List<Project> getProjects() {
        return projects;
    }

    //Setter for projects
    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }
}
