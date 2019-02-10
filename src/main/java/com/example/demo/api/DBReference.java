package com.example.demo.api;

import com.example.demo.api.model.User;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Diego
 */
public class DBReference {

    public static final DBReference istance = new DBReference();
    private List<User> users;

    public DBReference() {
        users = new ArrayList<>();
    }

    public static DBReference getIstance() {
        return istance;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

}
