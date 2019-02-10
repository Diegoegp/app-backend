package com.example.demo.api.repository;

import com.example.demo.api.DBReference;
import com.example.demo.api.model.User;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Diego
 */
@Repository
public class UserRepositoryDAO implements UserRepository {

    @Override
    public Integer add(User model) {
        DBReference db = DBReference.getIstance();

        db.getUsers().add(model);
        return 1;

    }

    @Override
    public List<User> getAll() {
        DBReference db = DBReference.getIstance();

        return db.getUsers();
    }

    @Override
    public User getUser(String id) {
        DBReference db = DBReference.getIstance();

        return db.getUsers().get(1);
    }

    @Override
    public Integer update(User model) {
        DBReference db = DBReference.getIstance();

        db.getUsers().set(1, model);
        return 1;
    }

    @Override
    public Integer delete(String id) {
        DBReference db = DBReference.getIstance();

        db.getUsers().remove(1);
        return 1;
    }

}
