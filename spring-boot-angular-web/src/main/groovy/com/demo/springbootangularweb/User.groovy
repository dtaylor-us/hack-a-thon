package com.demo.springbootangularweb


import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class User {

    @Id
    @GeneratedValue()
    private long id
    private final String name
    private final String email

    // standard constructors / setters / getters / toString
    User() {}

    User(String name, String email) {
        this.name = name
        this.email = email
    }

    User(long id, String name, String email) {
        this.name = name
        this.email = email
        this.id = id
    }

    long getId() {
        return id
    }

    void setId(long id) {
        this.id = id
    }

    String getName() {
        return name
    }

    String getEmail() {
        return email
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
