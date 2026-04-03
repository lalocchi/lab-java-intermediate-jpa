package com.example.lab4_unit3.entity;

import com.sun.tools.javac.Main;
import jakarta.persistence.*;

import javax.naming.Name;

//The database consists of Contacts. Each Contact has a name, title and company.
@Entity
@Table (name = "contacts")
public class Contact {
    //Names should be embedded within the Contact entity and not be stored in a separate table.
    @Embeddable
    //Names are their own object and have a firstName, lastName, middleName and salutation.
    public class Name {
        private String firstName;
        private String lastName;
        private String middleName;
        private String salutation;

        public Name(){
        }

        public Name(String firstName, String lastName, String middleName, String salutation) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.middleName = middleName;
            this.salutation = salutation;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getMiddleName() {
            return middleName;
        }

        public void setMiddleName(String middleName) {
            this.middleName = middleName;
        }

        public String getSalutation() {
            return salutation;
        }

        public void setSalutation(String salutation) {
            this.salutation = salutation;
        }
    }

    @Column(nullable = false,length = 60)
    private String title;

    @Column (nullable = false,length = 50)
    private String company;

    @Embedded
    private Name name;

    public Contact() {
    }

    public Contact(String title, String company, Name name) {
        this.title = title;
        this.company = company;
        this.name = name;
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
