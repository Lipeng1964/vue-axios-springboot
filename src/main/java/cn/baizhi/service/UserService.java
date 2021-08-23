package cn.baizhi.service;

import cn.baizhi.entity.User;

import java.util.List;

public interface UserService {

    List<User> selectAll();

    User selectBy(String id);

    void insert(User user);

    void delete(String id);

    void update(User user);
}
