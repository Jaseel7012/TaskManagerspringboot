package com.example.taskManagerBackend.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="patient_tb")
public class PatientModel {

    @Id
    @GeneratedValue

    private int id;
    private String name;
    private int age;
    private String location;
    private String facility;
    private int bed;
    private int room;
    private String physicianName;
    private String unitName;


    public PatientModel() {
    }

    public PatientModel(int id, String name, int age, String location, String facility, int bed, int room, String physicianName, String unitName) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.location = location;
        this.facility = facility;
        this.bed = bed;
        this.room = room;
        this.physicianName = physicianName;
        this.unitName = unitName;

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getFacility() {
        return facility;
    }

    public void setFacility(String facility) {
        this.facility = facility;
    }

    public int getBed() {
        return bed;
    }

    public void setBed(int bed) {
        this.bed = bed;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public String getPhysicianName() {
        return physicianName;
    }

    public void setPhysicianName(String physicianName) {
        this.physicianName = physicianName;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }




}
