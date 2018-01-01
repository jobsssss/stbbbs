package com.jobs.service;

import java.util.List;
import com.jobs.model.User;
public interface UserService {
    int addUser(User user);

    List<User> findAllUser(int pageNum, int pageSize);
}
