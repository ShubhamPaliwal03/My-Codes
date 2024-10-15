package com.general.db_connectivity_java;

public class Student {

    private String firstname;
    private String lastname;
    private String email;
    private int id;

    public Student(String firstname, String lastname, String email, int id) {

        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.id = id;
    }

    public Student(String firstname, String lastname, String email) {

        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
    }

    public String getFirstname() {

        return firstname;
    }

    public void setFirstname(String firstname) {

        this.firstname = firstname;
    }

    public String getLastname() {

        return lastname;
    }

    public void setLastname(String lastname) {

        this.lastname = lastname;
    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {

        this.email = email;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    @Override
    public String toString() {

        return "Student [id=" + id + ", firstName=" + firstname + ", lastName=" + lastname + ", email=" + email + "]";
    }
}
