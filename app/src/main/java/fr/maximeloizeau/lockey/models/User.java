package fr.maximeloizeau.lockey.models;

import java.util.Date;

/**
 * Created by Maxime on 16-Jan-16.
 */
public class User {
    private String firstname;
    private String lastname;
    private String email;
    private String password;
    private String phone;

    private String token;
    private Date tokenExpiry;

    public User(String firstname, String lastname, String email, String password) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.password = password;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }
}
