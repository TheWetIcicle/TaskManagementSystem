//This is a User package, A user here is a user of the system, a user can have multiple projects

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
}
