package com.fiap.webservice.models.Psychologist;

import java.time.LocalDate;

public class Psychologist {
    private String id;
    private String name;
    private LocalDate birthday;
    private String address;
    private String sex;
    private String subscribe;
    private AcademicFormation academicFormation;
    private String Description;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSubscribe() {
        return subscribe;
    }

    public void setSubscribe(String subscribe) {
        this.subscribe = subscribe;
    }

    public AcademicFormation getAcademicFormation() {
        return academicFormation;
    }

    public void setAcademicFormation(AcademicFormation academicFormation) {
        this.academicFormation = academicFormation;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
