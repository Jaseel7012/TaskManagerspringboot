package com.example.taskManagerBackend.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="task_table")
public class TaskModel {
    @Id
    @GeneratedValue
    private int id;
    private String description;
    private String comment;
    private String status;
    private String priority;
    private Date dueDate;
    private int patientId;


    public TaskModel() {
    }

    public TaskModel(int id, String description, String comment, String status, String priority, Date dueDate,
                     int patientId)
    {
        this.id = id;
        this.description = description;
        this.comment = comment;
        this.status = status;
        this.priority = priority;
        this.dueDate = dueDate;
        this.patientId = patientId;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }


}
