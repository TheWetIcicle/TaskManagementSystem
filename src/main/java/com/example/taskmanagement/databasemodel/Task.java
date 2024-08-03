//This is the Task class, each Task has a few fields to fill in, and there are multiple Tasks that compose a Project.

package com.example.taskmanagement.databasemodel;

import jakarta.persistence.*;
import java.time.*;
import java.time.format.*;

@Entity //Specifies that this class is an Entity and is mapped to a database table
public class Task {
    @Id //Specifies the primary key of the Entity
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Specifies that the primary key should be generated automatically
    private Long id; //This is the primary key

    private String title; //Specifies the title of the task
    private String description; //Specifies the description of the task
    private LocalDateTime dueDate; //Specifies the due date of the task

    @ManyToOne //Specifies that there can exist many Tasks in a single Project
    private Project project; //Specifies the Project that this task is associated with

    //Getters and Setters, allows you to get and modify the private fields of a class

    //Getter for id
    public Long getId() {
        return id;
    }

    //Setter for id
    public void setId(Long id) {
        this.id = id;
    }

    //Getter for title
    public String getTitle() {
        return title;
    }

    //Setter for title
    public void setTitle(String title) {
        this.title = title;
    }

    //Getter for description
    public String getDescription() {
        return description;
    }

    //Setter for description
    public void setDescription(String description) {
        this.description = description;
    }

    //Getter and Setter for dueDate are not entirely redundant because you may need to give your own code direct access to the 'dueDate'
    //Getter for dueDate
    public LocalDateTime getDueDate() {
        return dueDate;
    }

    //Setter for dueDate
    public void setDueDate(LocalDateTime dueDate) {
        this.dueDate = dueDate;
    }

    //Getter for project
    public Project getProject() {
        return project;
    }

    //Setter for project
    public void setProject(Project project) {
        this.project = project;
    }

    //Method to get dueDate in proper format
    public String getFormattedDueDate() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"); //Creates a formatter that uses the string as the format
        //condition ? true expr : false expr
        return dueDate != null ? dueDate.format(formatter) : null;
    }

    //Method to set dueDate using user-input proper format string
    public void setDueDateFromString(String dueDateString) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"); //Creates a formatter that uses the string as the format
        try {
            this.dueDate = LocalDateTime.parse(dueDateString, formatter); //Parses the string to LocalDateTime using the formatter
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException("Invalid date format. Please enter date as 'yyyy-MM-dd HH:mm:ss"); //Specifies an exception message
        }
    }
}
