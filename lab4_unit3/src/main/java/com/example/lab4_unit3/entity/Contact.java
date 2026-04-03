package com.example.lab4_unit3.entity;

import com.sun.tools.javac.Main;
import jakarta.persistence.*;

import javax.naming.Name;

//The database consists of Contacts. Each Contact has a name, title and company.
@Entity
@Table (name = "contacts")
public class Contact {
    //Names should be embedded within the Contact entity and not be stored in a separate table.

    @Id
    @GeneratedValue
    private int id;

    @Column(nullable = false,length = 60)
    private String title;

    @Column (nullable = false,length = 50)
    private String company;

    @Embedded
    private Name name;

    public Contact() {
    }

    public Contact(int id,String title, String company, Name name) {
        this.id=id;
        this.title = title;
        this.company = company;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }
}
