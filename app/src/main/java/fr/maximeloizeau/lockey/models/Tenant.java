package fr.maximeloizeau.lockey.models;

/**
 * Created by Maxime on 17-Jan-16.
 */
public class Tenant extends User {

    public Tenant(String firstname, String lastname, String email, String password) {
        super(firstname, lastname, email, password);
    }
}
