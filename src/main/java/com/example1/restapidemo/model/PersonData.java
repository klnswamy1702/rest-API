package com.example1.restapidemo.model;

public class PersonData {
    public String personId;
    public String name;
    public String description;
    public String status;
    public String category;
    public String subject;

    public PersonData() {
    }

    public PersonData(String personId, String name, String description, String status, String category, String subject) {
        this.personId = personId;
        this.name = name;
        this.description = description;
        this.status = status;
        this.category = category;
        this.subject = subject;
    }



    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
