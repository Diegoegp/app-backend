package com.example.demo.api.repository;

import com.example.demo.api.model.User;
import java.util.List;

public interface UserRepository {

    public Integer add(User model);

    public List<User> getAll();

    public User getUser(String id);
    
    public Integer update(User model);
    
    public Integer delete(String id);

}
