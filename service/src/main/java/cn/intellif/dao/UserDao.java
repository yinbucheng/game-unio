package cn.intellif.dao;

import cn.intellif.domain.User;

import java.util.List;

public interface UserDao {
    void save(User entity);
    List<User> listAll();
}
